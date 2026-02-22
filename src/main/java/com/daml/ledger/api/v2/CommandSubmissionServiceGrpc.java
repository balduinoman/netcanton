package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows clients to attempt advancing the ledger's state by submitting commands.
 * The final states of their submissions are disclosed by the Command Completion Service.
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
    comments = "Source: com/daml/ledger/api/v2/command_submission_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommandSubmissionServiceGrpc {

  private CommandSubmissionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.CommandSubmissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest,
      com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse> getSubmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Submit",
      requestType = com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest.class,
      responseType = com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest,
      com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse> getSubmitMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest, com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse> getSubmitMethod;
    if ((getSubmitMethod = CommandSubmissionServiceGrpc.getSubmitMethod) == null) {
      synchronized (CommandSubmissionServiceGrpc.class) {
        if ((getSubmitMethod = CommandSubmissionServiceGrpc.getSubmitMethod) == null) {
          CommandSubmissionServiceGrpc.getSubmitMethod = getSubmitMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest, com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Submit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandSubmissionServiceMethodDescriptorSupplier("Submit"))
              .build();
        }
      }
    }
    return getSubmitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest,
      com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse> getSubmitReassignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitReassignment",
      requestType = com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest.class,
      responseType = com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest,
      com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse> getSubmitReassignmentMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest, com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse> getSubmitReassignmentMethod;
    if ((getSubmitReassignmentMethod = CommandSubmissionServiceGrpc.getSubmitReassignmentMethod) == null) {
      synchronized (CommandSubmissionServiceGrpc.class) {
        if ((getSubmitReassignmentMethod = CommandSubmissionServiceGrpc.getSubmitReassignmentMethod) == null) {
          CommandSubmissionServiceGrpc.getSubmitReassignmentMethod = getSubmitReassignmentMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest, com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitReassignment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommandSubmissionServiceMethodDescriptorSupplier("SubmitReassignment"))
              .build();
        }
      }
    }
    return getSubmitReassignmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandSubmissionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandSubmissionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandSubmissionServiceStub>() {
        @java.lang.Override
        public CommandSubmissionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandSubmissionServiceStub(channel, callOptions);
        }
      };
    return CommandSubmissionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandSubmissionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandSubmissionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandSubmissionServiceBlockingStub>() {
        @java.lang.Override
        public CommandSubmissionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandSubmissionServiceBlockingStub(channel, callOptions);
        }
      };
    return CommandSubmissionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommandSubmissionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommandSubmissionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommandSubmissionServiceFutureStub>() {
        @java.lang.Override
        public CommandSubmissionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommandSubmissionServiceFutureStub(channel, callOptions);
        }
      };
    return CommandSubmissionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows clients to attempt advancing the ledger's state by submitting commands.
   * The final states of their submissions are disclosed by the Command Completion Service.
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
     * Submit a single composite command.
     * </pre>
     */
    default void submit(com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit a single reassignment.
     * </pre>
     */
    default void submitReassignment(com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitReassignmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommandSubmissionService.
   * <pre>
   * Allows clients to attempt advancing the ledger's state by submitting commands.
   * The final states of their submissions are disclosed by the Command Completion Service.
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
  public static abstract class CommandSubmissionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommandSubmissionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommandSubmissionService.
   * <pre>
   * Allows clients to attempt advancing the ledger's state by submitting commands.
   * The final states of their submissions are disclosed by the Command Completion Service.
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
  public static final class CommandSubmissionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommandSubmissionServiceStub> {
    private CommandSubmissionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandSubmissionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandSubmissionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submit a single composite command.
     * </pre>
     */
    public void submit(com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit a single reassignment.
     * </pre>
     */
    public void submitReassignment(com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitReassignmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommandSubmissionService.
   * <pre>
   * Allows clients to attempt advancing the ledger's state by submitting commands.
   * The final states of their submissions are disclosed by the Command Completion Service.
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
  public static final class CommandSubmissionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommandSubmissionServiceBlockingStub> {
    private CommandSubmissionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandSubmissionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandSubmissionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submit a single composite command.
     * </pre>
     */
    public com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse submit(com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit a single reassignment.
     * </pre>
     */
    public com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse submitReassignment(com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitReassignmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommandSubmissionService.
   * <pre>
   * Allows clients to attempt advancing the ledger's state by submitting commands.
   * The final states of their submissions are disclosed by the Command Completion Service.
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
  public static final class CommandSubmissionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommandSubmissionServiceFutureStub> {
    private CommandSubmissionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandSubmissionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommandSubmissionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submit a single composite command.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse> submit(
        com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit a single reassignment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse> submitReassignment(
        com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitReassignmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT = 0;
  private static final int METHODID_SUBMIT_REASSIGNMENT = 1;

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
        case METHODID_SUBMIT:
          serviceImpl.submit((com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_REASSIGNMENT:
          serviceImpl.submitReassignment((com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse>) responseObserver);
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
          getSubmitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitRequest,
              com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitResponse>(
                service, METHODID_SUBMIT)))
        .addMethod(
          getSubmitReassignmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentRequest,
              com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.SubmitReassignmentResponse>(
                service, METHODID_SUBMIT_REASSIGNMENT)))
        .build();
  }

  private static abstract class CommandSubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommandSubmissionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.CommandSubmissionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommandSubmissionService");
    }
  }

  private static final class CommandSubmissionServiceFileDescriptorSupplier
      extends CommandSubmissionServiceBaseDescriptorSupplier {
    CommandSubmissionServiceFileDescriptorSupplier() {}
  }

  private static final class CommandSubmissionServiceMethodDescriptorSupplier
      extends CommandSubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommandSubmissionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CommandSubmissionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommandSubmissionServiceFileDescriptorSupplier())
              .addMethod(getSubmitMethod())
              .addMethod(getSubmitReassignmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
