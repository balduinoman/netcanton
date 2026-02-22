# NetCanton: Java Development and Local Network Setup Guide

This guide establishes a unified workflow for two critical objectives: orchestrating a local Canton network using Docker and generating the necessary Java client-side classes to communicate with that network via gRPC. This documentation is based on Canton Open Source version 3.4.11.

## Core Prerequisites

As a technical lead, ensure your environment strictly adheres to these version requirements to avoid serialization errors or compatibility regressions during the build process.

| Software        | Version          |
|-----------------|----------------|
| protobuf-java   | 3.25.1          |
| grpc-java       | 1.60.0          |
| protoc          | 3.25.1          |
| Canton Source   | canton-open-source-3.4.11.zip |

> **Note:** The Canton Source Code is a mandatory dependency for both the local network orchestration and the Java code generation process.

> **Additional Note:** All files required to run Canton locally, including the `Dockerfile`, `docker-compose.yml`, and the configuration files (`mediator.conf`, `sequencer.conf`, `participant1.conf`, `participant2.conf`), are located in the `canton-local` directory at [https://github.com/balduinoman/netcanton/tree/main/canton-local](https://github.com/balduinoman/netcanton/tree/main/canton-local)

---

## Step 1: Initial Environment Preparation

### 1.1 Download Canton Source

Navigate to the Canton GitHub releases page. Download the Windows 64-bit ZIP archive (`canton-open-source-3.4.11.zip`) and extract it to your local workspace. This directory contains the protocol definitions and configuration templates required for subsequent steps.

### 1.2 Install Protoc & Plugins

To interface with the Ledger API, you must generate Java code from `.proto` definitions. This requires the Protocol Buffer compiler and the gRPC Java plugin.

1. **Install protoc 3.25.1**
   * Download `protoc-25.1-win64.zip` from the official protobuf repository.
   * Extract the binary to a dedicated `protoc` directory.

2. **Install protoc-gen-grpc-java 1.60.0**
   * Download `protoc-gen-grpc-java-1.60.0-windows-x86_64.exe` from Maven Central.
   * Move this executable into the same directory as `protoc.exe`.
   * Rename the file to `protoc-gen-grpc-java.exe`.

> **Senior Lead Note:** The protoc compiler follows a specific discovery convention. It searches for plugins prefixed with `protoc-gen-`; renaming the binary is essential for the compiler to resolve the gRPC plugin during the execution phase.

---

## Step 2: Setting Up the Local Canton Network

### 2.1 Build the Docker Image

Digital Asset does not provide prebuilt Docker images for the Open Source edition via public registries. Consequently, you must build the image locally to ensure version alignment.

1. Navigate to the `canton-local` directory (which contains the `Dockerfile`, `docker-compose.yml`, and config files).
2. Build the image using the following command:

```
docker build -t canton-network .
```

### 2.2 Component Configuration

Standard Canton deployments require distinct identity and network settings for each architectural component.

1. All configuration files (`mediator.conf`, `sequencer.conf`, `participant1.conf`, `participant2.conf`) are already provided in the `canton-local` directory.
2. Ensure each file contains the specific configuration block relevant to that component (e.g., unique storage ports and ledger API settings) as defined in the source documentation.

### 2.3 Network Orchestration

The `docker-compose.yml` file in the `canton-local` directory defines the network topology. This orchestration includes:

* Four Canton services: Mediator, Sequencer, Participant1, and Participant2.
* Four dedicated PostgreSQL instances to act as the persistence layer for each component.

Launch the network in detached mode:

```
docker-compose up -d
```

---

## Step 3: Building the Java Application Interface

Once the network is provisioned, you must generate the client-side implementation of the gRPC services. These classes act as the bridge between your Java application and the Canton Ledger API.

### 3.1 Gather Proto Files

The compiler requires both the Daml-specific protocol files and the standard Google RPC definitions.

1. **Canton Protos:** Copy the entire `com` directory from `canton-open-source-3.4.11/protobuf/ledger-api/com` into your `protoc` directory.
2. **Google Protos:**
   * Inside the `protoc` directory, create the structure `google/rpc`.
   * Download `status.proto` from the Google APIs repository and place it within the `google/rpc` folder. This is a critical dependency for error handling and status reporting in gRPC.

### 3.2 Generate Java Classes

Navigate to your `protoc` directory and execute the following command targeting the v2 Ledger API definitions:

```
protoc --java_out=src/main/java --grpc-java_out=src/main/java com/daml/ledger/api/v2/*.proto
```

Upon execution, the compiler will generate 32 Java files located within `src/main/java/com/daml/ledger/api/v2`. These files provide the stubs and message objects required for your Java application to interact with the participants.

---

## Step 4: Environment Validation

### 4.1 Install grpcurl

To verify the health of the gRPC endpoints without writing code, use grpcurl.

* Install via Windows Package Manager: `winget install fullstorydev.grpcurl`
* Or manually download `grpcurl_1.9.3_windows_x86_64.zip`.

### 4.2 Verification Command

Probe the Ledger API on Participant 1 (typically mapped to port 6865 in standard local configurations) to list available services:

```
grpcurl -plaintext localhost:6865 list
```

### 4.3 Success Criteria

A successful list of services (e.g., `com.daml.ledger.api.v2.CommandService`) confirms that:

1. The local Canton network is fully operational and the containers are communicating correctly.
2. The Ledger API is exposed and reachable.
3. The environment is ready for your Java application to begin interacting with the network using the classes generated in Step 3.

