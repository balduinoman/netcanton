# HOW TO BUILD A JAVA APPLICATION TO COMMUNICATE WITH CANTON NETWORK

---

## PRE-REQUISITES

- protobuf-java: 3.25.1
- grpc-java: 1.60.0
- protoc: 3.25.1

---

## INSTALL protoc 3.25.1

protoc is needed to generate the Java classes from proto files

1. Go to https://github.com/protocolbuffers/protobuf/releases/tag/v25.1
2. Download "protoc-25.1-win64.zip"
3. If you prefer get it directly from the https://github.com/protocolbuffers/protobuf/releases/download/v25.1/protoc-25.1-win64.zip
4. Extract that

---

## INSTALL protoc-gen-grpc-java 1.60.0

1. GO to https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.60.0/
2. Download "protoc-gen-grpc-java-1.60.0-windows-x86_64.exe"
3. If you prefer get it directly from the https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.60.0/protoc-gen-grpc-java-1.60.0-windows-x86_64.exe
4. Copy the .exe file into the same directory it is located "protoc.exe"
5. Rename "protoc-gen-grpc-java-1.60.0-windows-x86_64.exe" to "protoc-gen-grpc-java.exe" (Protoc does not recognizes another name)

---

## DOWNLOAD CANTON SOURCE CODE (If you hadn't done it yet)

1. Go to the [Canton GitHub releases page](https://github.com/digital-asset/canton/releases/tag/v3.4.11).
2. For Windows 64-bit, download the ZIP file directly: [canton-open-source-3.4.11.zip](https://github.com/digital-asset/canton/releases/download/v3.4.11/canton-open-source-3.4.11.zip)
3. Extract the contents to a convenient directory on your machine.

---

## GATHERING THE PROTO FILES

It will needed to gather proto files from both Canton and Google. It should have both for the Java classes to be sucessfuly generated.

---

### CANTON PROTO FILES

1. Copy the entiry "com" directory from "canton-open-source-3.4.11\protobuf\ledger-api\com" and paste it into the place that "protoc" is located

---

### GOOGLE PROTO FILES

2. Within the place it "protoc" is located, create the following directories "google/rpc"
3. Copy the "status.proto" file at https://github.com/googleapis/googleapis/blob/master/google/rpc/status.proto and paste it into "google/rpc"

---

## CREATING THE JAVA CLASSES FROM PROTO FILES

1. Open the command line tool
2. Navigate until the directory where "protoc" and other stuffs are located
3. execute the command "protoc --java_out=src/main/java --grpc-java_out=src/main/java com/daml/ledger/api/v2/*.proto"
4. It will be created the directories "src\main\java\com\daml\ledger\api\v2" within all Java Classes generated from the proto files. There will be 32 Java files.