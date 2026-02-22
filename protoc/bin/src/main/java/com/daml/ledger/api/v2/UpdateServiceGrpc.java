package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows clients to read updates (transactions, (un)assignments, topology events) from the ledger.
 * ``GetUpdates`` provides a comprehensive stream of updates/changes
 * which happened on the virtual shared ledger. These streams are indexed with ledger
 * offsets, which are strictly increasing.
 * The virtual shared ledger consist of changes happening on multiple synchronizers which are
 * connected to the serving participant. Each update belongs to one synchronizer, this is
 * provided in the result (the ``synchronizer_id`` field in ``Transaction``
 * for transactions, the ``source`` field in ``UnassignedEvent`` and the ``target`` field in ``AssignedEvent``).
 * Consumers can rely on strong causal guarantees on the virtual shared ledger for a single
 * synchronizer: updates which have greater offsets are happened after than updates with smaller
 * offsets for the same synchronizer. Across different synchronizers this is not guaranteed.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/update_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UpdateServiceGrpc {

  private UpdateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.UpdateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest,
      com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse> getGetUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUpdates",
      requestType = com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest.class,
      responseType = com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest,
      com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse> getGetUpdatesMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest, com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse> getGetUpdatesMethod;
    if ((getGetUpdatesMethod = UpdateServiceGrpc.getGetUpdatesMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getGetUpdatesMethod = UpdateServiceGrpc.getGetUpdatesMethod) == null) {
          UpdateServiceGrpc.getGetUpdatesMethod = getGetUpdatesMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest, com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("GetUpdates"))
              .build();
        }
      }
    }
    return getGetUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest,
      com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getGetUpdateByOffsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUpdateByOffset",
      requestType = com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest.class,
      responseType = com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest,
      com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getGetUpdateByOffsetMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest, com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getGetUpdateByOffsetMethod;
    if ((getGetUpdateByOffsetMethod = UpdateServiceGrpc.getGetUpdateByOffsetMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getGetUpdateByOffsetMethod = UpdateServiceGrpc.getGetUpdateByOffsetMethod) == null) {
          UpdateServiceGrpc.getGetUpdateByOffsetMethod = getGetUpdateByOffsetMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest, com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUpdateByOffset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("GetUpdateByOffset"))
              .build();
        }
      }
    }
    return getGetUpdateByOffsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest,
      com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getGetUpdateByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUpdateById",
      requestType = com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest.class,
      responseType = com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest,
      com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getGetUpdateByIdMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest, com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getGetUpdateByIdMethod;
    if ((getGetUpdateByIdMethod = UpdateServiceGrpc.getGetUpdateByIdMethod) == null) {
      synchronized (UpdateServiceGrpc.class) {
        if ((getGetUpdateByIdMethod = UpdateServiceGrpc.getGetUpdateByIdMethod) == null) {
          UpdateServiceGrpc.getGetUpdateByIdMethod = getGetUpdateByIdMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest, com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUpdateById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateServiceMethodDescriptorSupplier("GetUpdateById"))
              .build();
        }
      }
    }
    return getGetUpdateByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateServiceStub>() {
        @java.lang.Override
        public UpdateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateServiceStub(channel, callOptions);
        }
      };
    return UpdateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateServiceBlockingStub>() {
        @java.lang.Override
        public UpdateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateServiceBlockingStub(channel, callOptions);
        }
      };
    return UpdateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateServiceFutureStub>() {
        @java.lang.Override
        public UpdateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateServiceFutureStub(channel, callOptions);
        }
      };
    return UpdateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows clients to read updates (transactions, (un)assignments, topology events) from the ledger.
   * ``GetUpdates`` provides a comprehensive stream of updates/changes
   * which happened on the virtual shared ledger. These streams are indexed with ledger
   * offsets, which are strictly increasing.
   * The virtual shared ledger consist of changes happening on multiple synchronizers which are
   * connected to the serving participant. Each update belongs to one synchronizer, this is
   * provided in the result (the ``synchronizer_id`` field in ``Transaction``
   * for transactions, the ``source`` field in ``UnassignedEvent`` and the ``target`` field in ``AssignedEvent``).
   * Consumers can rely on strong causal guarantees on the virtual shared ledger for a single
   * synchronizer: updates which have greater offsets are happened after than updates with smaller
   * offsets for the same synchronizer. Across different synchronizers this is not guaranteed.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Read the ledger's filtered update stream for the specified contents and filters.
     * It returns the event types in accordance with the stream contents selected. Also the selection criteria
     * for individual events depends on the transaction shape chosen.
     * - ACS delta: a requesting party must be a stakeholder of an event for it to be included.
     * - ledger effects: a requesting party must be a witness of an event for it to be included.
     * </pre>
     */
    default void getUpdates(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUpdatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lookup an update by its offset.
     * If there is no update with this offset, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    default void getUpdateByOffset(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUpdateByOffsetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lookup an update by its ID.
     * If there is no update with this ID, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    default void getUpdateById(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUpdateByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UpdateService.
   * <pre>
   * Allows clients to read updates (transactions, (un)assignments, topology events) from the ledger.
   * ``GetUpdates`` provides a comprehensive stream of updates/changes
   * which happened on the virtual shared ledger. These streams are indexed with ledger
   * offsets, which are strictly increasing.
   * The virtual shared ledger consist of changes happening on multiple synchronizers which are
   * connected to the serving participant. Each update belongs to one synchronizer, this is
   * provided in the result (the ``synchronizer_id`` field in ``Transaction``
   * for transactions, the ``source`` field in ``UnassignedEvent`` and the ``target`` field in ``AssignedEvent``).
   * Consumers can rely on strong causal guarantees on the virtual shared ledger for a single
   * synchronizer: updates which have greater offsets are happened after than updates with smaller
   * offsets for the same synchronizer. Across different synchronizers this is not guaranteed.
   * </pre>
   */
  public static abstract class UpdateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UpdateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UpdateService.
   * <pre>
   * Allows clients to read updates (transactions, (un)assignments, topology events) from the ledger.
   * ``GetUpdates`` provides a comprehensive stream of updates/changes
   * which happened on the virtual shared ledger. These streams are indexed with ledger
   * offsets, which are strictly increasing.
   * The virtual shared ledger consist of changes happening on multiple synchronizers which are
   * connected to the serving participant. Each update belongs to one synchronizer, this is
   * provided in the result (the ``synchronizer_id`` field in ``Transaction``
   * for transactions, the ``source`` field in ``UnassignedEvent`` and the ``target`` field in ``AssignedEvent``).
   * Consumers can rely on strong causal guarantees on the virtual shared ledger for a single
   * synchronizer: updates which have greater offsets are happened after than updates with smaller
   * offsets for the same synchronizer. Across different synchronizers this is not guaranteed.
   * </pre>
   */
  public static final class UpdateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UpdateServiceStub> {
    private UpdateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read the ledger's filtered update stream for the specified contents and filters.
     * It returns the event types in accordance with the stream contents selected. Also the selection criteria
     * for individual events depends on the transaction shape chosen.
     * - ACS delta: a requesting party must be a stakeholder of an event for it to be included.
     * - ledger effects: a requesting party must be a witness of an event for it to be included.
     * </pre>
     */
    public void getUpdates(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lookup an update by its offset.
     * If there is no update with this offset, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    public void getUpdateByOffset(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUpdateByOffsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lookup an update by its ID.
     * If there is no update with this ID, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    public void getUpdateById(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUpdateByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UpdateService.
   * <pre>
   * Allows clients to read updates (transactions, (un)assignments, topology events) from the ledger.
   * ``GetUpdates`` provides a comprehensive stream of updates/changes
   * which happened on the virtual shared ledger. These streams are indexed with ledger
   * offsets, which are strictly increasing.
   * The virtual shared ledger consist of changes happening on multiple synchronizers which are
   * connected to the serving participant. Each update belongs to one synchronizer, this is
   * provided in the result (the ``synchronizer_id`` field in ``Transaction``
   * for transactions, the ``source`` field in ``UnassignedEvent`` and the ``target`` field in ``AssignedEvent``).
   * Consumers can rely on strong causal guarantees on the virtual shared ledger for a single
   * synchronizer: updates which have greater offsets are happened after than updates with smaller
   * offsets for the same synchronizer. Across different synchronizers this is not guaranteed.
   * </pre>
   */
  public static final class UpdateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UpdateServiceBlockingStub> {
    private UpdateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Read the ledger's filtered update stream for the specified contents and filters.
     * It returns the event types in accordance with the stream contents selected. Also the selection criteria
     * for individual events depends on the transaction shape chosen.
     * - ACS delta: a requesting party must be a stakeholder of an event for it to be included.
     * - ledger effects: a requesting party must be a witness of an event for it to be included.
     * </pre>
     */
    public java.util.Iterator<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse> getUpdates(
        com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUpdatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lookup an update by its offset.
     * If there is no update with this offset, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse getUpdateByOffset(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUpdateByOffsetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lookup an update by its ID.
     * If there is no update with this ID, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse getUpdateById(com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUpdateByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UpdateService.
   * <pre>
   * Allows clients to read updates (transactions, (un)assignments, topology events) from the ledger.
   * ``GetUpdates`` provides a comprehensive stream of updates/changes
   * which happened on the virtual shared ledger. These streams are indexed with ledger
   * offsets, which are strictly increasing.
   * The virtual shared ledger consist of changes happening on multiple synchronizers which are
   * connected to the serving participant. Each update belongs to one synchronizer, this is
   * provided in the result (the ``synchronizer_id`` field in ``Transaction``
   * for transactions, the ``source`` field in ``UnassignedEvent`` and the ``target`` field in ``AssignedEvent``).
   * Consumers can rely on strong causal guarantees on the virtual shared ledger for a single
   * synchronizer: updates which have greater offsets are happened after than updates with smaller
   * offsets for the same synchronizer. Across different synchronizers this is not guaranteed.
   * </pre>
   */
  public static final class UpdateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UpdateServiceFutureStub> {
    private UpdateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lookup an update by its offset.
     * If there is no update with this offset, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getUpdateByOffset(
        com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUpdateByOffsetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lookup an update by its ID.
     * If there is no update with this ID, or all the events are filtered, an UPDATE_NOT_FOUND error will be raised.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse> getUpdateById(
        com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUpdateByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_UPDATES = 0;
  private static final int METHODID_GET_UPDATE_BY_OFFSET = 1;
  private static final int METHODID_GET_UPDATE_BY_ID = 2;

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
        case METHODID_GET_UPDATES:
          serviceImpl.getUpdates((com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse>) responseObserver);
          break;
        case METHODID_GET_UPDATE_BY_OFFSET:
          serviceImpl.getUpdateByOffset((com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse>) responseObserver);
          break;
        case METHODID_GET_UPDATE_BY_ID:
          serviceImpl.getUpdateById((com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse>) responseObserver);
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
          getGetUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesRequest,
              com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdatesResponse>(
                service, METHODID_GET_UPDATES)))
        .addMethod(
          getGetUpdateByOffsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByOffsetRequest,
              com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse>(
                service, METHODID_GET_UPDATE_BY_OFFSET)))
        .addMethod(
          getGetUpdateByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateByIdRequest,
              com.daml.ledger.api.v2.UpdateServiceOuterClass.GetUpdateResponse>(
                service, METHODID_GET_UPDATE_BY_ID)))
        .build();
  }

  private static abstract class UpdateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.UpdateServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateService");
    }
  }

  private static final class UpdateServiceFileDescriptorSupplier
      extends UpdateServiceBaseDescriptorSupplier {
    UpdateServiceFileDescriptorSupplier() {}
  }

  private static final class UpdateServiceMethodDescriptorSupplier
      extends UpdateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UpdateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UpdateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateServiceFileDescriptorSupplier())
              .addMethod(getGetUpdatesMethod())
              .addMethod(getGetUpdateByOffsetMethod())
              .addMethod(getGetUpdateByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
