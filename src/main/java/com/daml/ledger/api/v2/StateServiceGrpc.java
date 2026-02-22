package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows clients to get state from the ledger.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/state_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StateServiceGrpc {

  private StateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.StateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse> getGetActiveContractsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveContracts",
      requestType = com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest.class,
      responseType = com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse> getGetActiveContractsMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse> getGetActiveContractsMethod;
    if ((getGetActiveContractsMethod = StateServiceGrpc.getGetActiveContractsMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getGetActiveContractsMethod = StateServiceGrpc.getGetActiveContractsMethod) == null) {
          StateServiceGrpc.getGetActiveContractsMethod = getGetActiveContractsMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActiveContracts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("GetActiveContracts"))
              .build();
        }
      }
    }
    return getGetActiveContractsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse> getGetConnectedSynchronizersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnectedSynchronizers",
      requestType = com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest.class,
      responseType = com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse> getGetConnectedSynchronizersMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse> getGetConnectedSynchronizersMethod;
    if ((getGetConnectedSynchronizersMethod = StateServiceGrpc.getGetConnectedSynchronizersMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getGetConnectedSynchronizersMethod = StateServiceGrpc.getGetConnectedSynchronizersMethod) == null) {
          StateServiceGrpc.getGetConnectedSynchronizersMethod = getGetConnectedSynchronizersMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnectedSynchronizers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("GetConnectedSynchronizers"))
              .build();
        }
      }
    }
    return getGetConnectedSynchronizersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse> getGetLedgerEndMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLedgerEnd",
      requestType = com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest.class,
      responseType = com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse> getGetLedgerEndMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse> getGetLedgerEndMethod;
    if ((getGetLedgerEndMethod = StateServiceGrpc.getGetLedgerEndMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getGetLedgerEndMethod = StateServiceGrpc.getGetLedgerEndMethod) == null) {
          StateServiceGrpc.getGetLedgerEndMethod = getGetLedgerEndMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLedgerEnd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("GetLedgerEnd"))
              .build();
        }
      }
    }
    return getGetLedgerEndMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse> getGetLatestPrunedOffsetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestPrunedOffsets",
      requestType = com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest.class,
      responseType = com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest,
      com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse> getGetLatestPrunedOffsetsMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse> getGetLatestPrunedOffsetsMethod;
    if ((getGetLatestPrunedOffsetsMethod = StateServiceGrpc.getGetLatestPrunedOffsetsMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getGetLatestPrunedOffsetsMethod = StateServiceGrpc.getGetLatestPrunedOffsetsMethod) == null) {
          StateServiceGrpc.getGetLatestPrunedOffsetsMethod = getGetLatestPrunedOffsetsMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest, com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestPrunedOffsets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("GetLatestPrunedOffsets"))
              .build();
        }
      }
    }
    return getGetLatestPrunedOffsetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StateServiceStub>() {
        @java.lang.Override
        public StateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StateServiceStub(channel, callOptions);
        }
      };
    return StateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StateServiceBlockingStub>() {
        @java.lang.Override
        public StateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StateServiceBlockingStub(channel, callOptions);
        }
      };
    return StateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StateServiceFutureStub>() {
        @java.lang.Override
        public StateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StateServiceFutureStub(channel, callOptions);
        }
      };
    return StateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows clients to get state from the ledger.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns a stream of the snapshot of the active contracts and incomplete (un)assignments at a ledger offset.
     * Once the stream of GetActiveContractsResponses completes,
     * the client SHOULD begin streaming updates from the update service,
     * starting at the GetActiveContractsRequest.active_at_offset specified in this request.
     * Clients SHOULD NOT assume that the set of active contracts they receive reflects the state at the ledger end.
     * </pre>
     */
    default void getActiveContracts(com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActiveContractsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the list of connected synchronizers at the time of the query.
     * </pre>
     */
    default void getConnectedSynchronizers(com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectedSynchronizersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current ledger end.
     * Subscriptions started with the returned offset will serve events after this RPC was called.
     * </pre>
     */
    default void getLedgerEnd(com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLedgerEndMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the latest successfully pruned ledger offsets
     * </pre>
     */
    default void getLatestPrunedOffsets(com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestPrunedOffsetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StateService.
   * <pre>
   * Allows clients to get state from the ledger.
   * </pre>
   */
  public static abstract class StateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StateService.
   * <pre>
   * Allows clients to get state from the ledger.
   * </pre>
   */
  public static final class StateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StateServiceStub> {
    private StateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a stream of the snapshot of the active contracts and incomplete (un)assignments at a ledger offset.
     * Once the stream of GetActiveContractsResponses completes,
     * the client SHOULD begin streaming updates from the update service,
     * starting at the GetActiveContractsRequest.active_at_offset specified in this request.
     * Clients SHOULD NOT assume that the set of active contracts they receive reflects the state at the ledger end.
     * </pre>
     */
    public void getActiveContracts(com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetActiveContractsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the list of connected synchronizers at the time of the query.
     * </pre>
     */
    public void getConnectedSynchronizers(com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectedSynchronizersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current ledger end.
     * Subscriptions started with the returned offset will serve events after this RPC was called.
     * </pre>
     */
    public void getLedgerEnd(com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLedgerEndMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the latest successfully pruned ledger offsets
     * </pre>
     */
    public void getLatestPrunedOffsets(com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestPrunedOffsetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StateService.
   * <pre>
   * Allows clients to get state from the ledger.
   * </pre>
   */
  public static final class StateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StateServiceBlockingStub> {
    private StateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a stream of the snapshot of the active contracts and incomplete (un)assignments at a ledger offset.
     * Once the stream of GetActiveContractsResponses completes,
     * the client SHOULD begin streaming updates from the update service,
     * starting at the GetActiveContractsRequest.active_at_offset specified in this request.
     * Clients SHOULD NOT assume that the set of active contracts they receive reflects the state at the ledger end.
     * </pre>
     */
    public java.util.Iterator<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse> getActiveContracts(
        com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetActiveContractsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the list of connected synchronizers at the time of the query.
     * </pre>
     */
    public com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse getConnectedSynchronizers(com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectedSynchronizersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current ledger end.
     * Subscriptions started with the returned offset will serve events after this RPC was called.
     * </pre>
     */
    public com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse getLedgerEnd(com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLedgerEndMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the latest successfully pruned ledger offsets
     * </pre>
     */
    public com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse getLatestPrunedOffsets(com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestPrunedOffsetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StateService.
   * <pre>
   * Allows clients to get state from the ledger.
   * </pre>
   */
  public static final class StateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StateServiceFutureStub> {
    private StateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the list of connected synchronizers at the time of the query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse> getConnectedSynchronizers(
        com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectedSynchronizersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current ledger end.
     * Subscriptions started with the returned offset will serve events after this RPC was called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse> getLedgerEnd(
        com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLedgerEndMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the latest successfully pruned ledger offsets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse> getLatestPrunedOffsets(
        com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestPrunedOffsetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACTIVE_CONTRACTS = 0;
  private static final int METHODID_GET_CONNECTED_SYNCHRONIZERS = 1;
  private static final int METHODID_GET_LEDGER_END = 2;
  private static final int METHODID_GET_LATEST_PRUNED_OFFSETS = 3;

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
        case METHODID_GET_ACTIVE_CONTRACTS:
          serviceImpl.getActiveContracts((com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTED_SYNCHRONIZERS:
          serviceImpl.getConnectedSynchronizers((com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse>) responseObserver);
          break;
        case METHODID_GET_LEDGER_END:
          serviceImpl.getLedgerEnd((com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_PRUNED_OFFSETS:
          serviceImpl.getLatestPrunedOffsets((com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse>) responseObserver);
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
          getGetActiveContractsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsRequest,
              com.daml.ledger.api.v2.StateServiceOuterClass.GetActiveContractsResponse>(
                service, METHODID_GET_ACTIVE_CONTRACTS)))
        .addMethod(
          getGetConnectedSynchronizersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersRequest,
              com.daml.ledger.api.v2.StateServiceOuterClass.GetConnectedSynchronizersResponse>(
                service, METHODID_GET_CONNECTED_SYNCHRONIZERS)))
        .addMethod(
          getGetLedgerEndMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndRequest,
              com.daml.ledger.api.v2.StateServiceOuterClass.GetLedgerEndResponse>(
                service, METHODID_GET_LEDGER_END)))
        .addMethod(
          getGetLatestPrunedOffsetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsRequest,
              com.daml.ledger.api.v2.StateServiceOuterClass.GetLatestPrunedOffsetsResponse>(
                service, METHODID_GET_LATEST_PRUNED_OFFSETS)))
        .build();
  }

  private static abstract class StateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.StateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StateService");
    }
  }

  private static final class StateServiceFileDescriptorSupplier
      extends StateServiceBaseDescriptorSupplier {
    StateServiceFileDescriptorSupplier() {}
  }

  private static final class StateServiceMethodDescriptorSupplier
      extends StateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StateServiceFileDescriptorSupplier())
              .addMethod(getGetActiveContractsMethod())
              .addMethod(getGetConnectedSynchronizersMethod())
              .addMethod(getGetLedgerEndMethod())
              .addMethod(getGetLatestPrunedOffsetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
