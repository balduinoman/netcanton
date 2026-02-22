package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Command Service is able to correlate submitted commands with completion data, identify timeouts, and return contextual
 * information with each tracking result. This supports the implementation of stateless clients.
 * Note that submitted commands generally produce completion events as well, even in case a command gets rejected.
 * For example, the participant SHOULD produce a completion event for a rejection of a duplicate command.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/command_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommandServiceGrpc {

  private CommandServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.CommandService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest,
      com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse> getSubmitAndWaitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitAndWait",
      requestType = com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest.class,
      responseType = com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest,
      com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse> getSubmitAndWaitMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest, com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse> getSubmitAndWaitMethod;
    if ((getSubmitAndWaitMethod = CommandServiceGrpc.getSubmitAndWaitMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getSubmitAndWaitMethod = CommandServiceGrpc.getSubmitAndWaitMethod) == null) {
          CommandServiceGrpc.getSubmitAndWaitMethod = getSubmitAndWaitMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest, com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitAndWait"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("SubmitAndWait"))
              .build();
        }
      }
    }
    return getSubmitAndWaitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest,
      com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse> getSubmitAndWaitForTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitAndWaitForTransaction",
      requestType = com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest.class,
      responseType = com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest,
      com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse> getSubmitAndWaitForTransactionMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest, com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse> getSubmitAndWaitForTransactionMethod;
    if ((getSubmitAndWaitForTransactionMethod = CommandServiceGrpc.getSubmitAndWaitForTransactionMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getSubmitAndWaitForTransactionMethod = CommandServiceGrpc.getSubmitAndWaitForTransactionMethod) == null) {
          CommandServiceGrpc.getSubmitAndWaitForTransactionMethod = getSubmitAndWaitForTransactionMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest, com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitAndWaitForTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("SubmitAndWaitForTransaction"))
              .build();
        }
      }
    }
    return getSubmitAndWaitForTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest,
      com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse> getSubmitAndWaitForReassignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitAndWaitForReassignment",
      requestType = com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest.class,
      responseType = com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest,
      com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse> getSubmitAndWaitForReassignmentMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest, com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse> getSubmitAndWaitForReassignmentMethod;
    if ((getSubmitAndWaitForReassignmentMethod = CommandServiceGrpc.getSubmitAndWaitForReassignmentMethod) == null) {
      synchronized (CommandServiceGrpc.class) {
        if ((getSubmitAndWaitForReassignmentMethod = CommandServiceGrpc.getSubmitAndWaitForReassignmentMethod) == null) {
          CommandServiceGrpc.getSubmitAndWaitForReassignmentMethod = getSubmitAndWaitForReassignmentMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest, com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitAndWaitForReassignment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandServiceMethodDescriptorSupplier("SubmitAndWaitForReassignment"))
              .build();
        }
      }
    }
    return getSubmitAndWaitForReassignmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceStub>() {
        @java.lang.Override
        public CommandServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceStub(channel, callOptions);
        }
      };
    return CommandServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceBlockingStub>() {
        @java.lang.Override
        public CommandServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceBlockingStub(channel, callOptions);
        }
      };
    return CommandServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandServiceFutureStub>() {
        @java.lang.Override
        public CommandServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandServiceFutureStub(channel, callOptions);
        }
      };
    return CommandServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Command Service is able to correlate submitted commands with completion data, identify timeouts, and return contextual
   * information with each tracking result. This supports the implementation of stateless clients.
   * Note that submitted commands generally produce completion events as well, even in case a command gets rejected.
   * For example, the participant SHOULD produce a completion event for a rejection of a duplicate command.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Submits a single composite command and waits for its result.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    default void submitAndWait(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitAndWaitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submits a single composite command, waits for its result, and returns the transaction.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    default void submitAndWaitForTransaction(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitAndWaitForTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submits a single composite reassignment command, waits for its result, and returns the reassignment.
     * Propagates the gRPC error of failed submission.
     * </pre>
     */
    default void submitAndWaitForReassignment(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitAndWaitForReassignmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommandService.
   * <pre>
   * Command Service is able to correlate submitted commands with completion data, identify timeouts, and return contextual
   * information with each tracking result. This supports the implementation of stateless clients.
   * Note that submitted commands generally produce completion events as well, even in case a command gets rejected.
   * For example, the participant SHOULD produce a completion event for a rejection of a duplicate command.
   * </pre>
   */
  public static abstract class CommandServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommandServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommandService.
   * <pre>
   * Command Service is able to correlate submitted commands with completion data, identify timeouts, and return contextual
   * information with each tracking result. This supports the implementation of stateless clients.
   * Note that submitted commands generally produce completion events as well, even in case a command gets rejected.
   * For example, the participant SHOULD produce a completion event for a rejection of a duplicate command.
   * </pre>
   */
  public static final class CommandServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommandServiceStub> {
    private CommandServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submits a single composite command and waits for its result.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    public void submitAndWait(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitAndWaitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submits a single composite command, waits for its result, and returns the transaction.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    public void submitAndWaitForTransaction(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitAndWaitForTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submits a single composite reassignment command, waits for its result, and returns the reassignment.
     * Propagates the gRPC error of failed submission.
     * </pre>
     */
    public void submitAndWaitForReassignment(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitAndWaitForReassignmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommandService.
   * <pre>
   * Command Service is able to correlate submitted commands with completion data, identify timeouts, and return contextual
   * information with each tracking result. This supports the implementation of stateless clients.
   * Note that submitted commands generally produce completion events as well, even in case a command gets rejected.
   * For example, the participant SHOULD produce a completion event for a rejection of a duplicate command.
   * </pre>
   */
  public static final class CommandServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommandServiceBlockingStub> {
    private CommandServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submits a single composite command and waits for its result.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    public com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse submitAndWait(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitAndWaitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submits a single composite command, waits for its result, and returns the transaction.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    public com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse submitAndWaitForTransaction(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitAndWaitForTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submits a single composite reassignment command, waits for its result, and returns the reassignment.
     * Propagates the gRPC error of failed submission.
     * </pre>
     */
    public com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse submitAndWaitForReassignment(com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitAndWaitForReassignmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommandService.
   * <pre>
   * Command Service is able to correlate submitted commands with completion data, identify timeouts, and return contextual
   * information with each tracking result. This supports the implementation of stateless clients.
   * Note that submitted commands generally produce completion events as well, even in case a command gets rejected.
   * For example, the participant SHOULD produce a completion event for a rejection of a duplicate command.
   * </pre>
   */
  public static final class CommandServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommandServiceFutureStub> {
    private CommandServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submits a single composite command and waits for its result.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse> submitAndWait(
        com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitAndWaitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submits a single composite command, waits for its result, and returns the transaction.
     * Propagates the gRPC error of failed submissions including Daml interpretation errors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse> submitAndWaitForTransaction(
        com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitAndWaitForTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submits a single composite reassignment command, waits for its result, and returns the reassignment.
     * Propagates the gRPC error of failed submission.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse> submitAndWaitForReassignment(
        com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitAndWaitForReassignmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_AND_WAIT = 0;
  private static final int METHODID_SUBMIT_AND_WAIT_FOR_TRANSACTION = 1;
  private static final int METHODID_SUBMIT_AND_WAIT_FOR_REASSIGNMENT = 2;

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
        case METHODID_SUBMIT_AND_WAIT:
          serviceImpl.submitAndWait((com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_AND_WAIT_FOR_TRANSACTION:
          serviceImpl.submitAndWaitForTransaction((com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_AND_WAIT_FOR_REASSIGNMENT:
          serviceImpl.submitAndWaitForReassignment((com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse>) responseObserver);
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
          getSubmitAndWaitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitRequest,
              com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitResponse>(
                service, METHODID_SUBMIT_AND_WAIT)))
        .addMethod(
          getSubmitAndWaitForTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionRequest,
              com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForTransactionResponse>(
                service, METHODID_SUBMIT_AND_WAIT_FOR_TRANSACTION)))
        .addMethod(
          getSubmitAndWaitForReassignmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentRequest,
              com.daml.ledger.api.v2.CommandServiceOuterClass.SubmitAndWaitForReassignmentResponse>(
                service, METHODID_SUBMIT_AND_WAIT_FOR_REASSIGNMENT)))
        .build();
  }

  private static abstract class CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.CommandServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandService");
    }
  }

  private static final class CommandServiceFileDescriptorSupplier
      extends CommandServiceBaseDescriptorSupplier {
    CommandServiceFileDescriptorSupplier() {}
  }

  private static final class CommandServiceMethodDescriptorSupplier
      extends CommandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommandServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CommandServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandServiceFileDescriptorSupplier())
              .addMethod(getSubmitAndWaitMethod())
              .addMethod(getSubmitAndWaitForTransactionMethod())
              .addMethod(getSubmitAndWaitForReassignmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
