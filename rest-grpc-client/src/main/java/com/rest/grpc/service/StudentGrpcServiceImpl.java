package com.rest.grpc.service;

import com.stub.protoclass.StudentGrpc;
import com.stub.protoclass.StudentModelGRPC;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class StudentGrpcServiceImpl implements StudentGrpcService {

    @Override
    public StudentModelGRPC.StudentResponse createStudent(StudentModelGRPC.StudentRequest request) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).
                usePlaintext().build();
        StudentGrpc.StudentBlockingStub studentGrpc = StudentGrpc.newBlockingStub(channel);
        StudentModelGRPC.StudentResponse response = studentGrpc.createStudent(request);

        channel.shutdownNow();
        return response;
    }

    @Override
    public StudentModelGRPC.StudentResponse getStudent(StudentModelGRPC.Empty request) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8000).
                usePlaintext().build();
        StudentGrpc.StudentBlockingStub studentGrpc = StudentGrpc.newBlockingStub(channel);
        StudentModelGRPC.StudentResponse response = studentGrpc.getStudents(request);

        channel.shutdownNow();
        return response;
    }
}
