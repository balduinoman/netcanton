package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query events by contract id.
 * Note that querying by contract key is not (yet) supported, as contract keys
 * are not supported (yet) in multi-synchronizer scenarios.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/event_query_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventQueryServiceGrpc {

  private EventQueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.EventQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest,
      com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse> getGetEventsByContractIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventsByContractId",
      requestType = com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest.class,
      responseType = com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest,
      com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse> getGetEventsByContractIdMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest, com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse> getGetEventsByContractIdMethod;
    if ((getGetEventsByContractIdMethod = EventQueryServiceGrpc.getGetEventsByContractIdMethod) == null) {
      synchronized (EventQueryServiceGrpc.class) {
        if ((getGetEventsByContractIdMethod = EventQueryServiceGrpc.getGetEventsByContractIdMethod) == null) {
          EventQueryServiceGrpc.getGetEventsByContractIdMethod = getGetEventsByContractIdMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest, com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEventsByContractId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventQueryServiceMethodDescriptorSupplier("GetEventsByContractId"))
              .build();
        }
      }
    }
    return getGetEventsByContractIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventQueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventQueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventQueryServiceStub>() {
        @java.lang.Override
        public EventQueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventQueryServiceStub(channel, callOptions);
        }
      };
    return EventQueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventQueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventQueryServiceBlockingStub>() {
        @java.lang.Override
        public EventQueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventQueryServiceBlockingStub(channel, callOptions);
        }
      };
    return EventQueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventQueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventQueryServiceFutureStub>() {
        @java.lang.Override
        public EventQueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventQueryServiceFutureStub(channel, callOptions);
        }
      };
    return EventQueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query events by contract id.
   * Note that querying by contract key is not (yet) supported, as contract keys
   * are not supported (yet) in multi-synchronizer scenarios.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get the create and the consuming exercise event for the contract with the provided ID.
     * No events will be returned for contracts that have been pruned because they
     * have already been archived before the latest pruning offset.
     * If the contract cannot be found for the request, or all the contract-events are filtered, a CONTRACT_EVENTS_NOT_FOUND error will be raised.
     * </pre>
     */
    default void getEventsByContractId(com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsByContractIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventQueryService.
   * <pre>
   * Query events by contract id.
   * Note that querying by contract key is not (yet) supported, as contract keys
   * are not supported (yet) in multi-synchronizer scenarios.
   * </pre>
   */
  public static abstract class EventQueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventQueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventQueryService.
   * <pre>
   * Query events by contract id.
   * Note that querying by contract key is not (yet) supported, as contract keys
   * are not supported (yet) in multi-synchronizer scenarios.
   * </pre>
   */
  public static final class EventQueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventQueryServiceStub> {
    private EventQueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventQueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventQueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the create and the consuming exercise event for the contract with the provided ID.
     * No events will be returned for contracts that have been pruned because they
     * have already been archived before the latest pruning offset.
     * If the contract cannot be found for the request, or all the contract-events are filtered, a CONTRACT_EVENTS_NOT_FOUND error will be raised.
     * </pre>
     */
    public void getEventsByContractId(com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsByContractIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventQueryService.
   * <pre>
   * Query events by contract id.
   * Note that querying by contract key is not (yet) supported, as contract keys
   * are not supported (yet) in multi-synchronizer scenarios.
   * </pre>
   */
  public static final class EventQueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventQueryServiceBlockingStub> {
    private EventQueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventQueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the create and the consuming exercise event for the contract with the provided ID.
     * No events will be returned for contracts that have been pruned because they
     * have already been archived before the latest pruning offset.
     * If the contract cannot be found for the request, or all the contract-events are filtered, a CONTRACT_EVENTS_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse getEventsByContractId(com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsByContractIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventQueryService.
   * <pre>
   * Query events by contract id.
   * Note that querying by contract key is not (yet) supported, as contract keys
   * are not supported (yet) in multi-synchronizer scenarios.
   * </pre>
   */
  public static final class EventQueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventQueryServiceFutureStub> {
    private EventQueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventQueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventQueryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the create and the consuming exercise event for the contract with the provided ID.
     * No events will be returned for contracts that have been pruned because they
     * have already been archived before the latest pruning offset.
     * If the contract cannot be found for the request, or all the contract-events are filtered, a CONTRACT_EVENTS_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse> getEventsByContractId(
        com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsByContractIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EVENTS_BY_CONTRACT_ID = 0;

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
        case METHODID_GET_EVENTS_BY_CONTRACT_ID:
          serviceImpl.getEventsByContractId((com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse>) responseObserver);
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
          getGetEventsByContractIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdRequest,
              com.daml.ledger.api.v2.EventQueryServiceOuterClass.GetEventsByContractIdResponse>(
                service, METHODID_GET_EVENTS_BY_CONTRACT_ID)))
        .build();
  }

  private static abstract class EventQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.EventQueryServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventQueryService");
    }
  }

  private static final class EventQueryServiceFileDescriptorSupplier
      extends EventQueryServiceBaseDescriptorSupplier {
    EventQueryServiceFileDescriptorSupplier() {}
  }

  private static final class EventQueryServiceMethodDescriptorSupplier
      extends EventQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventQueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventQueryServiceFileDescriptorSupplier())
              .addMethod(getGetEventsByContractIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
