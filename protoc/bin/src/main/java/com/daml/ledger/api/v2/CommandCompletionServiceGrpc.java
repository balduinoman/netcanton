package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows clients to observe the status of their submissions.
 * Commands may be submitted via the Command Submission Service.
 * The on-ledger effects of their submissions are disclosed by the Update Service.
 * Commands may fail in 2 distinct manners:
 * 1. Failure communicated synchronously in the gRPC error of the submission.
 * 2. Failure communicated asynchronously in a Completion, see ``completion.proto``.
 * Note that not only successfully submitted commands MAY produce a completion event. For example, the participant MAY
 * choose to produce a completion event for a rejection of a duplicate command.
 * Clients that do not receive a successful completion about their submission MUST NOT assume that it was successful.
 * Clients SHOULD subscribe to the CompletionStream before starting to submit commands to prevent race conditions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/command_completion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommandCompletionServiceGrpc {

  private CommandCompletionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.CommandCompletionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest,
      com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse> getCompletionStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompletionStream",
      requestType = com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest.class,
      responseType = com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest,
      com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse> getCompletionStreamMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest, com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse> getCompletionStreamMethod;
    if ((getCompletionStreamMethod = CommandCompletionServiceGrpc.getCompletionStreamMethod) == null) {
      synchronized (CommandCompletionServiceGrpc.class) {
        if ((getCompletionStreamMethod = CommandCompletionServiceGrpc.getCompletionStreamMethod) == null) {
          CommandCompletionServiceGrpc.getCompletionStreamMethod = getCompletionStreamMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest, com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompletionStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandCompletionServiceMethodDescriptorSupplier("CompletionStream"))
              .build();
        }
      }
    }
    return getCompletionStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandCompletionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandCompletionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandCompletionServiceStub>() {
        @java.lang.Override
        public CommandCompletionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandCompletionServiceStub(channel, callOptions);
        }
      };
    return CommandCompletionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandCompletionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandCompletionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandCompletionServiceBlockingStub>() {
        @java.lang.Override
        public CommandCompletionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandCompletionServiceBlockingStub(channel, callOptions);
        }
      };
    return CommandCompletionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandCompletionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandCompletionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandCompletionServiceFutureStub>() {
        @java.lang.Override
        public CommandCompletionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandCompletionServiceFutureStub(channel, callOptions);
        }
      };
    return CommandCompletionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows clients to observe the status of their submissions.
   * Commands may be submitted via the Command Submission Service.
   * The on-ledger effects of their submissions are disclosed by the Update Service.
   * Commands may fail in 2 distinct manners:
   * 1. Failure communicated synchronously in the gRPC error of the submission.
   * 2. Failure communicated asynchronously in a Completion, see ``completion.proto``.
   * Note that not only successfully submitted commands MAY produce a completion event. For example, the participant MAY
   * choose to produce a completion event for a rejection of a duplicate command.
   * Clients that do not receive a successful completion about their submission MUST NOT assume that it was successful.
   * Clients SHOULD subscribe to the CompletionStream before starting to submit commands to prevent race conditions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to command completion events.
     * </pre>
     */
    default void completionStream(com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompletionStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommandCompletionService.
   * <pre>
   * Allows clients to observe the status of their submissions.
   * Commands may be submitted via the Command Submission Service.
   * The on-ledger effects of their submissions are disclosed by the Update Service.
   * Commands may fail in 2 distinct manners:
   * 1. Failure communicated synchronously in the gRPC error of the submission.
   * 2. Failure communicated asynchronously in a Completion, see ``completion.proto``.
   * Note that not only successfully submitted commands MAY produce a completion event. For example, the participant MAY
   * choose to produce a completion event for a rejection of a duplicate command.
   * Clients that do not receive a successful completion about their submission MUST NOT assume that it was successful.
   * Clients SHOULD subscribe to the CompletionStream before starting to submit commands to prevent race conditions.
   * </pre>
   */
  public static abstract class CommandCompletionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommandCompletionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommandCompletionService.
   * <pre>
   * Allows clients to observe the status of their submissions.
   * Commands may be submitted via the Command Submission Service.
   * The on-ledger effects of their submissions are disclosed by the Update Service.
   * Commands may fail in 2 distinct manners:
   * 1. Failure communicated synchronously in the gRPC error of the submission.
   * 2. Failure communicated asynchronously in a Completion, see ``completion.proto``.
   * Note that not only successfully submitted commands MAY produce a completion event. For example, the participant MAY
   * choose to produce a completion event for a rejection of a duplicate command.
   * Clients that do not receive a successful completion about their submission MUST NOT assume that it was successful.
   * Clients SHOULD subscribe to the CompletionStream before starting to submit commands to prevent race conditions.
   * </pre>
   */
  public static final class CommandCompletionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommandCompletionServiceStub> {
    private CommandCompletionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandCompletionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandCompletionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to command completion events.
     * </pre>
     */
    public void completionStream(com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCompletionStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommandCompletionService.
   * <pre>
   * Allows clients to observe the status of their submissions.
   * Commands may be submitted via the Command Submission Service.
   * The on-ledger effects of their submissions are disclosed by the Update Service.
   * Commands may fail in 2 distinct manners:
   * 1. Failure communicated synchronously in the gRPC error of the submission.
   * 2. Failure communicated asynchronously in a Completion, see ``completion.proto``.
   * Note that not only successfully submitted commands MAY produce a completion event. For example, the participant MAY
   * choose to produce a completion event for a rejection of a duplicate command.
   * Clients that do not receive a successful completion about their submission MUST NOT assume that it was successful.
   * Clients SHOULD subscribe to the CompletionStream before starting to submit commands to prevent race conditions.
   * </pre>
   */
  public static final class CommandCompletionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommandCompletionServiceBlockingStub> {
    private CommandCompletionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandCompletionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandCompletionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to command completion events.
     * </pre>
     */
    public java.util.Iterator<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse> completionStream(
        com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCompletionStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommandCompletionService.
   * <pre>
   * Allows clients to observe the status of their submissions.
   * Commands may be submitted via the Command Submission Service.
   * The on-ledger effects of their submissions are disclosed by the Update Service.
   * Commands may fail in 2 distinct manners:
   * 1. Failure communicated synchronously in the gRPC error of the submission.
   * 2. Failure communicated asynchronously in a Completion, see ``completion.proto``.
   * Note that not only successfully submitted commands MAY produce a completion event. For example, the participant MAY
   * choose to produce a completion event for a rejection of a duplicate command.
   * Clients that do not receive a successful completion about their submission MUST NOT assume that it was successful.
   * Clients SHOULD subscribe to the CompletionStream before starting to submit commands to prevent race conditions.
   * </pre>
   */
  public static final class CommandCompletionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommandCompletionServiceFutureStub> {
    private CommandCompletionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandCompletionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandCompletionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COMPLETION_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPLETION_STREAM:
          serviceImpl.completionStream((com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCompletionStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamRequest,
              com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.CompletionStreamResponse>(
                service, METHODID_COMPLETION_STREAM)))
        .build();
  }

  private static abstract class CommandCompletionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandCompletionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.CommandCompletionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandCompletionService");
    }
  }

  private static final class CommandCompletionServiceFileDescriptorSupplier
      extends CommandCompletionServiceBaseDescriptorSupplier {
    CommandCompletionServiceFileDescriptorSupplier() {}
  }

  private static final class CommandCompletionServiceMethodDescriptorSupplier
      extends CommandCompletionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommandCompletionServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CommandCompletionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandCompletionServiceFileDescriptorSupplier())
              .addMethod(getCompletionStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
