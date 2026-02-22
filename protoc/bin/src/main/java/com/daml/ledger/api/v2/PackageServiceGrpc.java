package com.daml.ledger.api.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows clients to query the Daml-LF packages that are supported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: com/daml/ledger/api/v2/package_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PackageServiceGrpc {

  private PackageServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.daml.ledger.api.v2.PackageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse> getListPackagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPackages",
      requestType = com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest.class,
      responseType = com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse> getListPackagesMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse> getListPackagesMethod;
    if ((getListPackagesMethod = PackageServiceGrpc.getListPackagesMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getListPackagesMethod = PackageServiceGrpc.getListPackagesMethod) == null) {
          PackageServiceGrpc.getListPackagesMethod = getListPackagesMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPackages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("ListPackages"))
              .build();
        }
      }
    }
    return getListPackagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse> getGetPackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPackage",
      requestType = com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest.class,
      responseType = com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse> getGetPackageMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse> getGetPackageMethod;
    if ((getGetPackageMethod = PackageServiceGrpc.getGetPackageMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getGetPackageMethod = PackageServiceGrpc.getGetPackageMethod) == null) {
          PackageServiceGrpc.getGetPackageMethod = getGetPackageMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("GetPackage"))
              .build();
        }
      }
    }
    return getGetPackageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse> getGetPackageStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPackageStatus",
      requestType = com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest.class,
      responseType = com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse> getGetPackageStatusMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse> getGetPackageStatusMethod;
    if ((getGetPackageStatusMethod = PackageServiceGrpc.getGetPackageStatusMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getGetPackageStatusMethod = PackageServiceGrpc.getGetPackageStatusMethod) == null) {
          PackageServiceGrpc.getGetPackageStatusMethod = getGetPackageStatusMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPackageStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("GetPackageStatus"))
              .build();
        }
      }
    }
    return getGetPackageStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse> getListVettedPackagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVettedPackages",
      requestType = com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest.class,
      responseType = com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest,
      com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse> getListVettedPackagesMethod() {
    io.grpc.MethodDescriptor<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse> getListVettedPackagesMethod;
    if ((getListVettedPackagesMethod = PackageServiceGrpc.getListVettedPackagesMethod) == null) {
      synchronized (PackageServiceGrpc.class) {
        if ((getListVettedPackagesMethod = PackageServiceGrpc.getListVettedPackagesMethod) == null) {
          PackageServiceGrpc.getListVettedPackagesMethod = getListVettedPackagesMethod =
              io.grpc.MethodDescriptor.<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest, com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVettedPackages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PackageServiceMethodDescriptorSupplier("ListVettedPackages"))
              .build();
        }
      }
    }
    return getListVettedPackagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PackageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageServiceStub>() {
        @java.lang.Override
        public PackageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageServiceStub(channel, callOptions);
        }
      };
    return PackageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PackageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageServiceBlockingStub>() {
        @java.lang.Override
        public PackageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageServiceBlockingStub(channel, callOptions);
        }
      };
    return PackageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PackageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageServiceFutureStub>() {
        @java.lang.Override
        public PackageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageServiceFutureStub(channel, callOptions);
        }
      };
    return PackageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows clients to query the Daml-LF packages that are supported by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the identifiers of all supported packages.
     * </pre>
     */
    default void listPackages(com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPackagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the contents of a single package.
     * </pre>
     */
    default void getPackage(com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPackageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the status of a single package.
     * </pre>
     */
    default void getPackageStatus(com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPackageStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists which participant node vetted what packages on which synchronizer.
     * Can be called by any authenticated user.
     * </pre>
     */
    default void listVettedPackages(com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVettedPackagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PackageService.
   * <pre>
   * Allows clients to query the Daml-LF packages that are supported by the server.
   * </pre>
   */
  public static abstract class PackageServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PackageServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PackageService.
   * <pre>
   * Allows clients to query the Daml-LF packages that are supported by the server.
   * </pre>
   */
  public static final class PackageServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PackageServiceStub> {
    private PackageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the identifiers of all supported packages.
     * </pre>
     */
    public void listPackages(com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPackagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the contents of a single package.
     * </pre>
     */
    public void getPackage(com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the status of a single package.
     * </pre>
     */
    public void getPackageStatus(com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPackageStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists which participant node vetted what packages on which synchronizer.
     * Can be called by any authenticated user.
     * </pre>
     */
    public void listVettedPackages(com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest request,
        io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVettedPackagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PackageService.
   * <pre>
   * Allows clients to query the Daml-LF packages that are supported by the server.
   * </pre>
   */
  public static final class PackageServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PackageServiceBlockingStub> {
    private PackageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the identifiers of all supported packages.
     * </pre>
     */
    public com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse listPackages(com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPackagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the contents of a single package.
     * </pre>
     */
    public com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse getPackage(com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPackageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the status of a single package.
     * </pre>
     */
    public com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse getPackageStatus(com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPackageStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists which participant node vetted what packages on which synchronizer.
     * Can be called by any authenticated user.
     * </pre>
     */
    public com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse listVettedPackages(com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVettedPackagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PackageService.
   * <pre>
   * Allows clients to query the Daml-LF packages that are supported by the server.
   * </pre>
   */
  public static final class PackageServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PackageServiceFutureStub> {
    private PackageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the identifiers of all supported packages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse> listPackages(
        com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPackagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the contents of a single package.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse> getPackage(
        com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the status of a single package.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse> getPackageStatus(
        com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPackageStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists which participant node vetted what packages on which synchronizer.
     * Can be called by any authenticated user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse> listVettedPackages(
        com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVettedPackagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PACKAGES = 0;
  private static final int METHODID_GET_PACKAGE = 1;
  private static final int METHODID_GET_PACKAGE_STATUS = 2;
  private static final int METHODID_LIST_VETTED_PACKAGES = 3;

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
        case METHODID_LIST_PACKAGES:
          serviceImpl.listPackages((com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse>) responseObserver);
          break;
        case METHODID_GET_PACKAGE:
          serviceImpl.getPackage((com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse>) responseObserver);
          break;
        case METHODID_GET_PACKAGE_STATUS:
          serviceImpl.getPackageStatus((com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse>) responseObserver);
          break;
        case METHODID_LIST_VETTED_PACKAGES:
          serviceImpl.listVettedPackages((com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest) request,
              (io.grpc.stub.StreamObserver<com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse>) responseObserver);
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
          getListPackagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesRequest,
              com.daml.ledger.api.v2.PackageServiceOuterClass.ListPackagesResponse>(
                service, METHODID_LIST_PACKAGES)))
        .addMethod(
          getGetPackageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageRequest,
              com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageResponse>(
                service, METHODID_GET_PACKAGE)))
        .addMethod(
          getGetPackageStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusRequest,
              com.daml.ledger.api.v2.PackageServiceOuterClass.GetPackageStatusResponse>(
                service, METHODID_GET_PACKAGE_STATUS)))
        .addMethod(
          getListVettedPackagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesRequest,
              com.daml.ledger.api.v2.PackageServiceOuterClass.ListVettedPackagesResponse>(
                service, METHODID_LIST_VETTED_PACKAGES)))
        .build();
  }

  private static abstract class PackageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PackageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.daml.ledger.api.v2.PackageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PackageService");
    }
  }

  private static final class PackageServiceFileDescriptorSupplier
      extends PackageServiceBaseDescriptorSupplier {
    PackageServiceFileDescriptorSupplier() {}
  }

  private static final class PackageServiceMethodDescriptorSupplier
      extends PackageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PackageServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PackageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PackageServiceFileDescriptorSupplier())
              .addMethod(getListPackagesMethod())
              .addMethod(getGetPackageMethod())
              .addMethod(getGetPackageStatusMethod())
              .addMethod(getListVettedPackagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
