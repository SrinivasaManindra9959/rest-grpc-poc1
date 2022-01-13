package com.rest.grpc.service;

import com.rest.grpc.model.Student;

import java.util.List;

public interface StudentRestService {
    public List<Student> getAllStudents(Integer offset, Integer limit);
}
