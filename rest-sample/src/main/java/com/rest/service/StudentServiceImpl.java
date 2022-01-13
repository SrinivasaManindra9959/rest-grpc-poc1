package com.rest.service;

import com.rest.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getAllStudents(Integer offset, Integer limit) {
        System.out.println("Inside getAllStudents() method");
        List<Student> students = new ArrayList<>();
        Student stu = Student.builder().id(1).name("Srinivas").college("Srkr").build();
        students.add(stu);
        Integer index = students.size() > limit ? limit : students.size();
        System.out.println("response>>" + students.toString());
        System.out.println("getAllStudents() method ends");
        return students.subList(offset, index);
    }
}
