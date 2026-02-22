# HOW TO RUN CANTON NETWORK LOCALLY

This guide will help you set up a local Canton Network environment using Docker. The network will include the following components: **Mediator, Sequencer, Participant1, and Participant2**.

---

## 1. DOWNLOAD CANTON SOURCE CODE

1. Go to the [Canton GitHub releases page](https://github.com/digital-asset/canton/releases/tag/v3.4.11).
2. For Windows 64-bit, download the ZIP file directly: [canton-open-source-3.4.11.zip](https://github.com/digital-asset/canton/releases/download/v3.4.11/canton-open-source-3.4.11.zip)
3. Extract the contents to a convenient directory on your machine.

---

## 2. BUILD THE CANTON DOCKER IMAGE LOCALLY

Digital Asset does not provide prebuilt Docker images for free. To ensure you have an up-to-date version, it is recommended to build your own image.

1. Open the directory where you extracted the Canton source code.
2. Create a file named `Dockerfile`.
3. Add the necessary instructions to the Dockerfile (you can copy from examples or the official guide).
4. Build the Docker image with the following command:

```bash
docker build -t local-canton:3.4.11 .
```

---

## 3. CREATE CANTON COMPONENT CONFIG FILES

Your local Canton network will require configuration files for each component.

1. Create a directory named `config`.
2. Inside `config`, create four files:
   - `mediator.conf`
   - `sequencer.conf`
   - `participant1.conf`
   - `participant2.conf`
3. Add the following content to each file:

**MEDIATOR.conf**

```hocon
canton {
  features {
    enable-preview-commands = yes
  }
  parameters {
    manual-start = no
    non-standard-config = yes
    timeouts.processing.slow-future-warn = 20.seconds
  }
  mediators {
    mediator {
      init = {
          generate-topology-transactions-and-keys = false
          identity.type = manual
      }
      topology.validate-initial-topology-snapshot = false

      sequencer-client {
        acknowledgement-interval = 10m
        use-new-connection-pool = true
        enable-amplification-improvements = true
      }

      storage {
        type = postgres
        config {
          url = "jdbc:postgresql://postgres-mediator:5432/canton"
          user = "canton"
          password = "canton"
        }
      }

      monitoring.grpc-health-server {
        address = "0.0.0.0"
        port = 5061
      }

      admin-api {
        address = "0.0.0.0"
        port = 5007
      }
    }
  }
}
```

**SEQUENCER.conf**

```hocon
canton {
  # required for key export
  features {
    enable-preview-commands = yes
  }
  parameters {
    manual-start = no
    non-standard-config = yes
    timeouts.processing.slow-future-warn = 20.seconds
  }

  sequencers {
    sequencer {
      init = {
          generate-topology-transactions-and-keys = false
          identity.type = manual
      }
      sequencer-client {
        acknowledgement-interval = 10m
      }
	  storage {
		type = postgres
		config {
		  url = "jdbc:postgresql://postgres-sequencer:5432/canton"
		  user = "canton"
		  password = "canton"
		}
	  }

      monitoring.grpc-health-server {
        address = "0.0.0.0"
        port = 5061
      }

      public-api {
        address = "0.0.0.0"
        port = 5008
        #max-token-expiration-interval = ${?SEQUENCER_TOKEN_EXPIRATION_TIME}
        # randomize to avoid issues with correlated failures
        use-exponential-random-token-expiration = true
      }

      admin-api {
        address = "0.0.0.0"
        port = 5009
        max-inbound-message-size = 104857600 # 100MB
        limits.active {
          "com.digitalasset.canton.topology.admin.v30.TopologyManagerReadService/GenesisState": 1,
          "com.digitalasset.canton.topology.admin.v30.TopologyManagerReadService/GenesisStateV2": 1,
          "com.digitalasset.canton.topology.admin.v30.TopologyManagerReadService/ExportTopologySnapshot": 1,
          "com.digitalasset.canton.topology.admin.v30.TopologyManagerReadService/ExportTopologySnapshotV2": 1,
          "com.digitalasset.canton.sequencer.admin.v30.SequencerAdministrationService/OnboardingState": 1,
          "com.digitalasset.canton.sequencer.admin.v30.SequencerAdministrationService/OnboardingStateV2": 1
        }
      }


      # Reduced time proof request interval here (default 24h)
      # so that sequencer will not block other sequencers from pruning even there is lack of activities
      # ref: https://github.com/DACH-NY/canton/issues/16371#issuecomment-1885005687
      # Note that this needs to be shorter than the SEQUENCER_RETENTION_PERIOD
      # or our own sequencer will prevent pruning.
      # Time requests are much less expensive than Daml transactions
      # so given our target load this is neglible.
      time-tracker.min-observation-duration = 30m

      parameters {
        batching.max-pruning-time-interval = "10 minutes"
      }
      sequencer {
        block {
          writer {
            type = high-throughput
            # maximum memory the buffered events will occupy
            buffered-events-max-memory = 200MiB // higher buffers for clients that have lagging subscriptions
            buffered-events-preload-batch-size = 1000 // increase the number of events we load in each query during startup to reduce startup time
            # increase payload queue size to have the same behavior as the cometbft sequencer
            payload-queue-size = 2500
          }
          throughput-cap  {
            enabled = true
            messages = {
              confirmation-request = {
                # Global TPS cap for this message type is 20. Over 60 seconds, this means the global usage is 1200.
                # If over the past 60seconds, at least 90% of these 1200 messages are observed, every client gets 1200 / (1 + vActive), where vActive is the number of clients that have sent at least one #thing in the past 60seconds.
                # If the usage was below 90%, then the client would be able to reach their allotted 5tps.
                global-tps-cap = 20
                per-client-tps-cap = 5
                global-kbps-cap = 1000
                per-client-kbps-cap = 400
              }
              topology = {
                # TODO(i29485): really high values that more or less mean the topology caps are disabled because time advancing messages are topology transactions as well and they are not retried
                # and if we throttle time advancing messages then we would actually get more time proofs which cannot be throttled currently
                global-tps-cap = 200
                per-client-tps-cap = 10
                global-kbps-cap = 2000
                per-client-kbps-cap = 500
              }
            }
          }
        }
        config {
		  storage {
			type = postgres
			config {
			  url = "jdbc:postgresql://postgres-sequencer:5432/canton"
			  user = "canton"
			  password = "canton"
			}
		  }
        }
        type = reference
      }

      sequencer-client {
        use-new-connection-pool = true
      }

      public-api.limits.active = {
        "com.digitalasset.canton.sequencer.api.v30.SequencerService/DownloadTopologyStateForInit" : 3,
        "com.digitalasset.canton.sequencer.api.v30.SequencerService/Subscribe" : 1000,
      }
    }
  }
}
```

**PARTICIPANT1.conf**

```hocon
```

**PARTICIPANT2.conf**

```hocon
canton {
  features {
    enable-preview-commands = yes
    enable-testing-commands = yes
  }

  parameters {
    manual-start = no
    non-standard-config = yes
    timeouts.processing.verify-active = 40.seconds
    timeouts.processing.slow-future-warn = 20.seconds
  }

  monitoring.logging.delay-logging-threshold = 40.seconds

  participants {
    participant2 {
      init {
        generate-topology-transactions-and-keys = true
      }

      ledger-api {
        address = "0.0.0.0"
        port = 5011
        max-token-lifetime = Inf
        admin-token-config.admin-claim = true
        user-management-service.additional-admin-user-id = "participant2"

        command-service {
          max-commands-in-flight = 30
        }

        index-service {
          max-contract-state-cache-size = 1000
          max-contract-key-state-cache-size = 1000
          max-transactions-in-memory-fan-out-buffer-size = 200
        }

        auth-services = []
      }

      admin-api {
        address = "0.0.0.0"
        port = 5012
      }

      http-ledger-api {
        address = "0.0.0.0"
        port = 7576
        path-prefix = "participant2"
      }

      monitoring.grpc-health-server {
        address = "0.0.0.0"
        port = 5062
      }

      storage {
        type = postgres
        config {
          url = "jdbc:postgresql://postgres-participant2:5432/canton"
          user = "canton"
          password = "canton"
        }
      }

      sequencer-client {
        acknowledgement-interval = 10m
        maximum-in-flight-event-batches = 50
        use-new-connection-pool = true
        enable-amplification-improvements = true
      }

      parameters {
        initial-protocol-version = 34
      }

      topology {
        broadcast-batch-size = 1
        validate-initial-topology-snapshot = false
      }
    }
  }
}
```

---

## 4. CREATE THE DOCKER-COMPOSE FILE AND START THE NETWORK

The `docker-compose.yml` file will define all services/containers including:

- Mediator
- Sequencer
- Participant1
- Participant2
- A PostgreSQL instance for each component

1. Create the `docker-compose.yml` file with the required configuration.
2. Start the network in detached mode:

```bash
docker-compose up -d
```

``` hcon

version: "3.8"

services:

  postgres-mediator:
    image: postgres:15
    environment:
      POSTGRES_USER: canton
      POSTGRES_PASSWORD: canton
      POSTGRES_DB: canton
    ports:
      - "5431:5432"
      
  postgres-sequencer:
    image: postgres:15
    environment:
      POSTGRES_USER: canton
      POSTGRES_PASSWORD: canton
      POSTGRES_DB: canton
    ports:
      - "5432:5432"

  postgres-participant1:
    image: postgres:15
    environment:
      POSTGRES_USER: canton
      POSTGRES_PASSWORD: canton
      POSTGRES_DB: canton
    ports:
      - "5433:5432"

  postgres-participant2:
    image: postgres:15
    environment:
      POSTGRES_USER: canton
      POSTGRES_PASSWORD: canton
      POSTGRES_DB: canton
    ports:
      - "5434:5432"

  mediator:
    image: local-canton:3.4.11
    depends_on:
      - postgres-mediator
    volumes:
      - ./config/mediator.conf:/canton.conf
    command: ["daemon", "-c", "/canton.conf"]
    ports:
      - "6864:6864"
     
  sequencer:
    image: local-canton:3.4.11
    depends_on:
      - postgres-sequencer
    volumes:
      - ./config/sequencer.conf:/canton.conf
    command: ["daemon", "-c", "/canton.conf"]
    ports:
      - "6865:6865"

  participant1:
    image: local-canton:3.4.11
    depends_on:
      - postgres-participant1
    volumes:
      - ./config/participant1.conf:/canton.conf
    command: daemon --config /canton.conf
    ports:
      - "6866:5001"
      - "5061:5061"

  participant2:
    image: local-canton:3.4.11
    depends_on:
      - postgres-participant2
    volumes:
      - ./config/participant2.conf:/canton.conf
    command: daemon --config /canton.conf
    ports:
      - "6867:6865"

```

---

## 5. VALIDATE THE ENVIRONMENT

To check that your Canton network is running correctly, you will need the `grpcurl` tool.

1. Install `grpcurl` via Windows Package Manager:

```bash
winget install -e --id fullstorydev.grpcurl
```

2. If the above command fails, download the installer manually from: [grpcurl\_1.9.3\_windows\_x86\_64.zip](https://github.com/fullstorydev/grpcurl/releases/download/v1.9.3/grpcurl_1.9.3_windows_x86_64.zip)
3. List the available gRPC services:

```bash
grpcurl -plaintext localhost:6866 list
```

If the list of services appears, your local Canton network is running successfully.

