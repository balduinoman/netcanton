package net.canton.sample;

import com.daml.ledger.api.v2.CommandServiceGrpc;
import com.daml.ledger.api.v2.CommandServiceOuterClass;
import com.daml.ledger.api.v2.CommandsOuterClass;
import com.daml.ledger.api.v2.ValueOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ManagedChannel channel =
                ManagedChannelBuilder
                        .forAddress("localhost", 6865)
                        .usePlaintext() // use TLS in production
                        .build();

        CommandServiceGrpc.CommandServiceBlockingStub stub =
                CommandServiceGrpc.newBlockingStub(channel);

        String commandId = UUID.randomUUID().toString();

        // Build template arguments
        ValueOuterClass.Record record =
                ValueOuterClass.Record.newBuilder()
                        .addFields(
                                ValueOuterClass.RecordField.newBuilder()
                                        .setLabel("sender")
                                        .setValue(ValueOuterClass.Value.newBuilder()
                                                .setParty("Alice")
                                                .build())
                                        .build()
                        )
                        .addFields(
                                ValueOuterClass.RecordField.newBuilder()
                                        .setLabel("receiver")
                                        .setValue(ValueOuterClass.Value.newBuilder()
                                                .setParty("Bob")
                                                .build())
                                        .build()
                        )
                        .build();

        CommandsOuterClass.CreateCommand createCommand =
                CommandsOuterClass.CreateCommand.newBuilder()
                        .setTemplateId(
                                ValueOuterClass.Identifier.newBuilder()
                                        .setPackageId("your-package-id")
                                        .setModuleName("YourModule")
                                        .setEntityName("Payment")
                                        .build()
                        )
                        .setCreateArguments(record)
                        .build();

        CommandsOuterClass.Commands commands =
                CommandsOuterClass.Commands.newBuilder()
                        .setCommandId(commandId)
                        .addActAs("Alice")   // v2 replacement for setParty
                        .addCommands(
                                CommandsOuterClass.Command.newBuilder()
                                        .setCreate(createCommand)
                                        .build()
                        )
                        .build();

        CommandServiceOuterClass.SubmitAndWaitRequest request =
                CommandServiceOuterClass.SubmitAndWaitRequest.newBuilder()
                        .setCommands(commands)
                        .build();

        stub.submitAndWait(request);

        System.out.println("Transaction committed.");

        channel.shutdown();
    }
}