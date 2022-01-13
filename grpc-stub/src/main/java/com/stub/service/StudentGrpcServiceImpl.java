package com.stub.service;

import com.stub.protoclass.StudentGrpc;
import com.stub.protoclass.StudentModelGRPC;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
@GRpcService
public class StudentGrpcServiceImpl extends StudentGrpc.StudentImplBase {
    @Override
    public void createStudent(StudentModelGRPC.StudentRequest request, StreamObserver<StudentModelGRPC.StudentResponse> responseObserver) {
        System.out.println("Inside createStudent() method");
        StudentModelGRPC.StudentResponse.Builder studentResponse = StudentModelGRPC.StudentResponse.newBuilder();
        studentResponse.setId(request.getId()).setCollege(request.getCollege()).
                setName(request.getName());

        System.out.println("response>>"+studentResponse.toString());

        responseObserver.onNext(studentResponse.build());
        responseObserver.onCompleted();
        responseObserver.onError(new StatusRuntimeException(Status.ABORTED));
        System.out.println("createStudent() method ends");

    }

    @Override
    public void getStudents(StudentModelGRPC.Empty request, StreamObserver<StudentModelGRPC.StudentResponse> responseObserver) {
        System.out.println("Inside getStudents() method");
        StudentModelGRPC.StudentResponse.Builder studentResponse = StudentModelGRPC.StudentResponse.newBuilder();
        studentResponse.setId(request.getId()).setCollege("SRKR").setName("Srinivas");

        System.out.println("response>>"+studentResponse.toString());

        responseObserver.onNext(studentResponse.build());
        responseObserver.onCompleted();
        responseObserver.onError(new StatusRuntimeException(Status.ABORTED));
        System.out.println("getStudents() method ends");
    }
}
