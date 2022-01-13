package com.rest.grpc.service;

import com.stub.protoclass.StudentModelGRPC;

public interface StudentGrpcService {
    public StudentModelGRPC.StudentResponse createStudent(StudentModelGRPC.StudentRequest request);
    public StudentModelGRPC.StudentResponse getStudent(StudentModelGRPC.Empty request);

}
