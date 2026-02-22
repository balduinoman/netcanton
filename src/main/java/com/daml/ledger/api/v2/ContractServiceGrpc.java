package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service is experimental / alpha, therefore no backwards compatibility is guaranteed.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/contract_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContractServiceGrpc {

  private ContractServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.ContractService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest,
      com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest.class,
      responseType = com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest,
      com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse> getGetContractMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest, com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse> getGetContractMethod;
    if ((getGetContractMethod = ContractServiceGrpc.getGetContractMethod) == null) {
      synchronized (ContractServiceGrpc.class) {
        if ((getGetContractMethod = ContractServiceGrpc.getGetContractMethod) == null) {
          ContractServiceGrpc.getGetContractMethod = getGetContractMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest, com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContractServiceMethodDescriptorSupplier("GetContract"))
              .build();
        }
      }
    }
    return getGetContractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContractServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContractServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContractServiceStub>() {
        @java.lang.Override
        public ContractServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContractServiceStub(channel, callOptions);
        }
      };
    return ContractServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContractServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContractServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContractServiceBlockingStub>() {
        @java.lang.Override
        public ContractServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContractServiceBlockingStub(channel, callOptions);
        }
      };
    return ContractServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContractServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContractServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContractServiceFutureStub>() {
        @java.lang.Override
        public ContractServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContractServiceFutureStub(channel, callOptions);
        }
      };
    return ContractServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service is experimental / alpha, therefore no backwards compatibility is guaranteed.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Looking up contract data by contract ID.
     * This endpoint is experimental / alpha, therefore no backwards compatibility is guaranteed.
     * This endpoint must not be used to look up contracts which entered the participant via party replication
     * or repair service.
     * If there is no contract exist with the contract ID, or there is no intersection with the querying_parties,
     * an CONTRACT_PAYLOAD_NOT_FOUND error will be raised.
     * </pre>
     */
    default void getContract(com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContractService.
   * <pre>
   * This service is experimental / alpha, therefore no backwards compatibility is guaranteed.
   * </pre>
   */
  public static abstract class ContractServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContractServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContractService.
   * <pre>
   * This service is experimental / alpha, therefore no backwards compatibility is guaranteed.
   * </pre>
   */
  public static final class ContractServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContractServiceStub> {
    private ContractServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContractServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Looking up contract data by contract ID.
     * This endpoint is experimental / alpha, therefore no backwards compatibility is guaranteed.
     * This endpoint must not be used to look up contracts which entered the participant via party replication
     * or repair service.
     * If there is no contract exist with the contract ID, or there is no intersection with the querying_parties,
     * an CONTRACT_PAYLOAD_NOT_FOUND error will be raised.
     * </pre>
     */
    public void getContract(com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContractService.
   * <pre>
   * This service is experimental / alpha, therefore no backwards compatibility is guaranteed.
   * </pre>
   */
  public static final class ContractServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContractServiceBlockingStub> {
    private ContractServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContractServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Looking up contract data by contract ID.
     * This endpoint is experimental / alpha, therefore no backwards compatibility is guaranteed.
     * This endpoint must not be used to look up contracts which entered the participant via party replication
     * or repair service.
     * If there is no contract exist with the contract ID, or there is no intersection with the querying_parties,
     * an CONTRACT_PAYLOAD_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse getContract(com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContractService.
   * <pre>
   * This service is experimental / alpha, therefore no backwards compatibility is guaranteed.
   * </pre>
   */
  public static final class ContractServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContractServiceFutureStub> {
    private ContractServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContractServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContractServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Looking up contract data by contract ID.
     * This endpoint is experimental / alpha, therefore no backwards compatibility is guaranteed.
     * This endpoint must not be used to look up contracts which entered the participant via party replication
     * or repair service.
     * If there is no contract exist with the contract ID, or there is no intersection with the querying_parties,
     * an CONTRACT_PAYLOAD_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse> getContract(
        com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONTRACT = 0;

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
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse>) responseObserver);
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
          getGetContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractRequest,
              com.daml.ledger.api.v2.ContractServiceOuterClass.GetContractResponse>(
                service, METHODID_GET_CONTRACT)))
        .build();
  }

  private static abstract class ContractServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContractServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.ContractServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContractService");
    }
  }

  private static final class ContractServiceFileDescriptorSupplier
      extends ContractServiceBaseDescriptorSupplier {
    ContractServiceFileDescriptorSupplier() {}
  }

  private static final class ContractServiceMethodDescriptorSupplier
      extends ContractServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContractServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContractServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContractServiceFileDescriptorSupplier())
              .addMethod(getGetContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
