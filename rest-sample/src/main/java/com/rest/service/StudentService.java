package com.rest.service;

import com.rest.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents(Integer offset,Integer limit);
}
