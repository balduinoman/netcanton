# NetCanton: Java Development and Local Network Setup Guide

This guide establishes a unified workflow for two critical objectives: orchestrating a local Canton network using Docker and generating the necessary Java client-side classes to communicate with that network via gRPC. This documentation is based on Canton Open Source version 3.4.11.

---

## Core Prerequisites

As a technical lead, ensure your environment strictly adheres to these version requirements to avoid serialization errors or compatibility regressions during the build process.

* protobuf-java: 3.25.1
* grpc-java: 1.60.0
* protoc: 3.25.1
* Canton Source: canton-open-source-3.4.11.zip
* DAML SDK: 3.4.11

> **Daml SDK Download:** The installer is available at the following URL:
> https://github.com/digital-asset/daml/releases/download/v3.4.11/daml-sdk-3.4.11-windows-x86_64.exe

---

## Step 1: Initial Environment Preparation

### 1.1 Download Canton Source
Download the Windows 64-bit ZIP archive (canton-open-source-3.4.11.zip) and extract it to your local workspace.

### 1.2 Install Protoc & Plugins
1. Install protoc 3.25.1: Extract the binary to a dedicated protoc directory.
2. Install protoc-gen-grpc-java 1.60.0: Move the executable into the same directory as protoc.exe.
3. Rename the file: Rename the file to protoc-gen-grpc-java.exe.

---

## Step 2: Setting Up the Local Canton Network



### 2.1 Via Console
This method allows for manual execution of each node via the Canton binary. Ensure your configuration paths are correct.

1. Start Sequencer:
   .\canton --config C:\GitHub\netcanton\canton-local\config\console\sequencer.conf

2. Start Mediator:
   .\canton --config C:\GitHub\netcanton\canton-local\config\console\mediator.conf

3. Start Synchronizer:
   .\canton --config C:\GitHub\netcanton\canton-local\config\console\synchronizer.conf --bootstrap C:\GitHub\netcanton\canton-local\config\console\bootstrap-synchronizer.sc

4. Start Participant 1:
   .\canton --config C:\GitHub\netcanton\canton-local\config\console\participant1.conf --bootstrap C:\GitHub\netcanton\canton-local\config\console\bootstrap-participant1.sc

### 2.2 Via Docker
This method uses Docker Compose to orchestrate the full topology (Services + Persistence).

1. Build the Image:
   cd canton-local
   docker build -t canton-network .

2. Launch Topology:
   docker-compose up -d

---

## Step 3: Building the Java Application Interface (gRPC)

### 3.1 Gather Proto Files
1. Canton Protos: Copy the com directory from canton-open-source-3.4.11/protobuf/ledger-api/com into your protoc directory.
2. Google Protos: Create the structure google/rpc and download status.proto into it.

### 3.2 Generate Java gRPC Stubs
Navigate to your protoc directory and execute:
protoc --java_out=src/main/java --grpc-java_out=src/main/java com/daml/ledger/api/v2/*.proto

---

## Step 4: Environment Validation

### 4.1 Verification Command
Probe the Ledger API on Participant 1 (Port 6865) using grpcurl:
grpcurl -plaintext localhost:6865 list

### 4.2 Success Criteria
A successful list of services confirms the network is operational and the gRPC stubs are ready for use.

---

## Step 5: Daml Smart Contracts & Java Codegen

To implement business logic on the ledger, you must compile Daml templates and generate the corresponding Java boilerplate for application development.

### 5.1 Build Daml Archive (DAR)
Ensure the Daml SDK is installed. Navigate to your Daml project root and build the project to generate the DAR file:
daml build

### 5.2 Generate Java Contract Classes
Use the Daml codegen tool to extract Java representations of your Daml templates. This allows your application to handle ledger contracts as native Java objects.

Command:
daml codegen java -o ./generated .daml/dist/my-daml-project-0.0.1.dar

Process Details:
- Java codegen
- Reading configuration from command line input: -o, ./generated, .daml/dist/my-daml-project-0.0.1.dar

### 5.3 Uploading DAR to Participant
Once the DAR file is generated, it must be uploaded to the participant node to make the contract templates available on the ledger. Run the following command within the Canton console:

participant1.dars.upload("C:\\GitHub\\netcanton\\canton-local\\my-daml-project\\.daml\\dist\\my-daml-project-0.0.1.dar")

---

## Util Commands

Below are essential commands for managing identity and identifying ledger objects within the Canton console.

### Creating parties within the participants
Use these commands to provision identities on the participant node.
participant1.parties.enable("Alice")
participant1.parties.enable("Bob")

### Getting participants ID
To interact with the Ledger API via Java, you often need the fully qualified Party ID string.
participant1.parties.list(filterParty="Alice").head.party.filterString