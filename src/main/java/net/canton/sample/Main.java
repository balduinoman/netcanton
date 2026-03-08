package net.canton.sample;

import com.daml.ledger.api.v2.CommandServiceGrpc;
import com.daml.ledger.api.v2.CommandServiceOuterClass;
import com.daml.ledger.api.v2.CommandsOuterClass;
import com.daml.ledger.api.v2.ValueOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Connect to Canton Ledger API
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 7001) // Replace with your Canton Ledger address and port
                .usePlaintext() // Use TLS in production
                .build();

        CommandServiceGrpc.CommandServiceBlockingStub stub = CommandServiceGrpc.newBlockingStub(channel);

        // Generate a unique command ID
        String commandId = UUID.randomUUID().toString();

        // Create a Payment instance
        Payment payment = new Payment(
                "Alice::12209d9019d374bad76f7f603042d57fb587c7c0d456451e4a6cf1ffcb0cbd3c1f55",
                "Bob::12209d9019d374bad76f7f603042d57fb587c7c0d456451e4a6cf1ffcb0cbd3c1f55",
                100L);

        // Convert Payment to Daml Record
        ValueOuterClass.Value record = payment.toValue().toProto();

        // Build the CreateCommand
        CommandsOuterClass.CreateCommand createCommand = CommandsOuterClass.CreateCommand.newBuilder()
                .setTemplateId(
                        ValueOuterClass.Identifier.newBuilder()
                                .setPackageId("2f7c949ffd0d767b3fbd95accd83593781fb57853bd76b15b38ded74241aba3c") // Replace with your Daml package ID
                                .setModuleName("Main") // Replace with your module name
                                .setEntityName("Payment") // Replace with your template name
                                .build()
                )
                .setCreateArguments(record.getRecord())
                .build();

        // Build the Commands
        CommandsOuterClass.Commands commands = CommandsOuterClass.Commands.newBuilder()
                .setCommandId(commandId)
                .addActAs("Alice::12209d9019d374bad76f7f603042d57fb587c7c0d456451e4a6cf1ffcb0cbd3c1f55")
                .addActAs("participant1::12209d9019d374bad76f7f603042d57fb587c7c0d456451e4a6cf1ffcb0cbd3c1f55") // Replace with the party submitting the command
                .setUserId("participant1::12209d9019d374bad76f7f603042d57fb587c7c0d456451e4a6cf1ffcb0cbd3c1f55")
                .addCommands(
                        CommandsOuterClass.Command.newBuilder()
                                .setCreate(createCommand)
                                .build()
                )
                .build();

        // Submit the command
        CommandServiceOuterClass.SubmitAndWaitRequest request = CommandServiceOuterClass.SubmitAndWaitRequest.newBuilder()
                .setCommands(commands)
                .build();

        stub.submitAndWait(request);

        System.out.println("Transaction committed.");

        // Shutdown the channel
        channel.shutdown();
    }
}