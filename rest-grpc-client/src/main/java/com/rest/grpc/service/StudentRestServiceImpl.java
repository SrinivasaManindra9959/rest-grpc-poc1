package com.rest.grpc.service;

import com.rest.grpc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentRestServiceImpl implements StudentRestService{

    private RestTemplate restTemplate;

    public StudentRestServiceImpl(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Student> getAllStudents(Integer offset, Integer limit) {
        System.out.println("Inside getAllStudents() method");
        try {
            HttpEntity<Student> httpEntity = new HttpEntity(Student.class);
            String url = "http://localhost:8080/student/allStudents?offset=" + offset + "&limit=" + limit;
            ResponseEntity<Student[]> response = restTemplate.exchange(url, HttpMethod.GET,
                    httpEntity, Student[].class);
            return Arrays.asList(response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Occurred " + e.getMessage());
            throw new RuntimeException();
        }
    }
}
