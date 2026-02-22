package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows clients to retrieve information about the ledger API version
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/version_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VersionServiceGrpc {

  private VersionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.VersionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest,
      com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse> getGetLedgerApiVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLedgerApiVersion",
      requestType = com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest.class,
      responseType = com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest,
      com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse> getGetLedgerApiVersionMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest, com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse> getGetLedgerApiVersionMethod;
    if ((getGetLedgerApiVersionMethod = VersionServiceGrpc.getGetLedgerApiVersionMethod) == null) {
      synchronized (VersionServiceGrpc.class) {
        if ((getGetLedgerApiVersionMethod = VersionServiceGrpc.getGetLedgerApiVersionMethod) == null) {
          VersionServiceGrpc.getGetLedgerApiVersionMethod = getGetLedgerApiVersionMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest, com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLedgerApiVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VersionServiceMethodDescriptorSupplier("GetLedgerApiVersion"))
              .build();
        }
      }
    }
    return getGetLedgerApiVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionServiceStub>() {
        @java.lang.Override
        public VersionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionServiceStub(channel, callOptions);
        }
      };
    return VersionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionServiceBlockingStub>() {
        @java.lang.Override
        public VersionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionServiceBlockingStub(channel, callOptions);
        }
      };
    return VersionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VersionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VersionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VersionServiceFutureStub>() {
        @java.lang.Override
        public VersionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VersionServiceFutureStub(channel, callOptions);
        }
      };
    return VersionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows clients to retrieve information about the ledger API version
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Read the Ledger API version
     * </pre>
     */
    default void getLedgerApiVersion(com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLedgerApiVersionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VersionService.
   * <pre>
   * Allows clients to retrieve information about the ledger API version
   * </pre>
   */
  public static abstract class VersionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VersionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VersionService.
   * <pre>
   * Allows clients to retrieve information about the ledger API version
   * </pre>
   */
  public static final class VersionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VersionServiceStub> {
    private VersionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read the Ledger API version
     * </pre>
     */
    public void getLedgerApiVersion(com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLedgerApiVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VersionService.
   * <pre>
   * Allows clients to retrieve information about the ledger API version
   * </pre>
   */
  public static final class VersionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VersionServiceBlockingStub> {
    private VersionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read the Ledger API version
     * </pre>
     */
    public com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse getLedgerApiVersion(com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLedgerApiVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VersionService.
   * <pre>
   * Allows clients to retrieve information about the ledger API version
   * </pre>
   */
  public static final class VersionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VersionServiceFutureStub> {
    private VersionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VersionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read the Ledger API version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse> getLedgerApiVersion(
        com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLedgerApiVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LEDGER_API_VERSION = 0;

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
        case METHODID_GET_LEDGER_API_VERSION:
          serviceImpl.getLedgerApiVersion((com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse>) responseObserver);
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
          getGetLedgerApiVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionRequest,
              com.daml.ledger.api.v2.VersionServiceOuterClass.GetLedgerApiVersionResponse>(
                service, METHODID_GET_LEDGER_API_VERSION)))
        .build();
  }

  private static abstract class VersionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VersionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.VersionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VersionService");
    }
  }

  private static final class VersionServiceFileDescriptorSupplier
      extends VersionServiceBaseDescriptorSupplier {
    VersionServiceFileDescriptorSupplier() {}
  }

  private static final class VersionServiceMethodDescriptorSupplier
      extends VersionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VersionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VersionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VersionServiceFileDescriptorSupplier())
              .addMethod(getGetLedgerApiVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
