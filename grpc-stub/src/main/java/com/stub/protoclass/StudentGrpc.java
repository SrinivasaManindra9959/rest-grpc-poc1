package com.stub.protoclass;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: studentdata.proto")
public final class StudentGrpc {

  private StudentGrpc() {}

  public static final String SERVICE_NAME = "com.stub.Student";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stub.protoclass.StudentModelGRPC.StudentRequest,
      com.stub.protoclass.StudentModelGRPC.StudentResponse> getCreateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createStudent",
      requestType = com.stub.protoclass.StudentModelGRPC.StudentRequest.class,
      responseType = com.stub.protoclass.StudentModelGRPC.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stub.protoclass.StudentModelGRPC.StudentRequest,
      com.stub.protoclass.StudentModelGRPC.StudentResponse> getCreateStudentMethod() {
    io.grpc.MethodDescriptor<com.stub.protoclass.StudentModelGRPC.StudentRequest, com.stub.protoclass.StudentModelGRPC.StudentResponse> getCreateStudentMethod;
    if ((getCreateStudentMethod = StudentGrpc.getCreateStudentMethod) == null) {
      synchronized (StudentGrpc.class) {
        if ((getCreateStudentMethod = StudentGrpc.getCreateStudentMethod) == null) {
          StudentGrpc.getCreateStudentMethod = getCreateStudentMethod = 
              io.grpc.MethodDescriptor.<com.stub.protoclass.StudentModelGRPC.StudentRequest, com.stub.protoclass.StudentModelGRPC.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.stub.Student", "createStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.protoclass.StudentModelGRPC.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.protoclass.StudentModelGRPC.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentMethodDescriptorSupplier("createStudent"))
                  .build();
          }
        }
     }
     return getCreateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stub.protoclass.StudentModelGRPC.Empty,
      com.stub.protoclass.StudentModelGRPC.StudentResponse> getGetStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudents",
      requestType = com.stub.protoclass.StudentModelGRPC.Empty.class,
      responseType = com.stub.protoclass.StudentModelGRPC.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stub.protoclass.StudentModelGRPC.Empty,
      com.stub.protoclass.StudentModelGRPC.StudentResponse> getGetStudentsMethod() {
    io.grpc.MethodDescriptor<com.stub.protoclass.StudentModelGRPC.Empty, com.stub.protoclass.StudentModelGRPC.StudentResponse> getGetStudentsMethod;
    if ((getGetStudentsMethod = StudentGrpc.getGetStudentsMethod) == null) {
      synchronized (StudentGrpc.class) {
        if ((getGetStudentsMethod = StudentGrpc.getGetStudentsMethod) == null) {
          StudentGrpc.getGetStudentsMethod = getGetStudentsMethod = 
              io.grpc.MethodDescriptor.<com.stub.protoclass.StudentModelGRPC.Empty, com.stub.protoclass.StudentModelGRPC.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.stub.Student", "getStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.protoclass.StudentModelGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stub.protoclass.StudentModelGRPC.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentMethodDescriptorSupplier("getStudents"))
                  .build();
          }
        }
     }
     return getGetStudentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentStub newStub(io.grpc.Channel channel) {
    return new StudentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentImplBase implements io.grpc.BindableService {

    /**
     */
    public void createStudent(com.stub.protoclass.StudentModelGRPC.StudentRequest request,
        io.grpc.stub.StreamObserver<com.stub.protoclass.StudentModelGRPC.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStudentMethod(), responseObserver);
    }

    /**
     */
    public void getStudents(com.stub.protoclass.StudentModelGRPC.Empty request,
        io.grpc.stub.StreamObserver<com.stub.protoclass.StudentModelGRPC.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stub.protoclass.StudentModelGRPC.StudentRequest,
                com.stub.protoclass.StudentModelGRPC.StudentResponse>(
                  this, METHODID_CREATE_STUDENT)))
          .addMethod(
            getGetStudentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stub.protoclass.StudentModelGRPC.Empty,
                com.stub.protoclass.StudentModelGRPC.StudentResponse>(
                  this, METHODID_GET_STUDENTS)))
          .build();
    }
  }

  /**
   */
  public static final class StudentStub extends io.grpc.stub.AbstractStub<StudentStub> {
    private StudentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentStub(channel, callOptions);
    }

    /**
     */
    public void createStudent(com.stub.protoclass.StudentModelGRPC.StudentRequest request,
        io.grpc.stub.StreamObserver<com.stub.protoclass.StudentModelGRPC.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudents(com.stub.protoclass.StudentModelGRPC.Empty request,
        io.grpc.stub.StreamObserver<com.stub.protoclass.StudentModelGRPC.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStudentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentBlockingStub extends io.grpc.stub.AbstractStub<StudentBlockingStub> {
    private StudentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stub.protoclass.StudentModelGRPC.StudentResponse createStudent(com.stub.protoclass.StudentModelGRPC.StudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stub.protoclass.StudentModelGRPC.StudentResponse getStudents(com.stub.protoclass.StudentModelGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentFutureStub extends io.grpc.stub.AbstractStub<StudentFutureStub> {
    private StudentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stub.protoclass.StudentModelGRPC.StudentResponse> createStudent(
        com.stub.protoclass.StudentModelGRPC.StudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stub.protoclass.StudentModelGRPC.StudentResponse> getStudents(
        com.stub.protoclass.StudentModelGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STUDENT = 0;
  private static final int METHODID_GET_STUDENTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((com.stub.protoclass.StudentModelGRPC.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.stub.protoclass.StudentModelGRPC.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENTS:
          serviceImpl.getStudents((com.stub.protoclass.StudentModelGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<com.stub.protoclass.StudentModelGRPC.StudentResponse>) responseObserver);
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

  private static abstract class StudentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stub.protoclass.StudentModelGRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Student");
    }
  }

  private static final class StudentFileDescriptorSupplier
      extends StudentBaseDescriptorSupplier {
    StudentFileDescriptorSupplier() {}
  }

  private static final class StudentMethodDescriptorSupplier
      extends StudentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentFileDescriptorSupplier())
              .addMethod(getCreateStudentMethod())
              .addMethod(getGetStudentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
