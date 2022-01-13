package com.rest.grpc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.rest.grpc.model.Student;
import com.rest.grpc.service.StudentGrpcService;
import com.rest.grpc.service.StudentRestService;
import com.stub.protoclass.StudentModelGRPC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class AppController {

    @Autowired
    private StudentRestService studentRestService;

    @Autowired
    private StudentGrpcService studentGrpcService;

    @GetMapping(value = "/rest/allStudents",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllStudents(Integer offset,Integer limit){
        return studentRestService.getAllStudents(offset,limit);
    }

    @PostMapping(value="/grpc/createStudent",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Student createStudent(@RequestBody Student request) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        StudentModelGRPC.StudentRequest.Builder req = StudentModelGRPC.StudentRequest.newBuilder();
        try {
            json = mapper.writeValueAsString(request);
            JsonFormat.parser().ignoringUnknownFields().merge(json, req);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        StudentModelGRPC.StudentResponse res = studentGrpcService.createStudent(req.build());

        System.out.println("response" + res.toString());
        Student student = new Student();
        String jsonString = "";
        try {
             jsonString = JsonFormat.printer()
                    .preservingProtoFieldNames()
                    .includingDefaultValueFields()
                     .omittingInsignificantWhitespace()
                    .print(res);
            student=  mapper.readValue(jsonString,Student.class);
        }catch(Exception e){
            e.printStackTrace();
        }
        //Gson gson = new Gson();
        //Student  s= gson.fromJson(jsonString,Student.class);

        return student;
    }

    @GetMapping(value="/grpc/getStudent")
    public Student getStudent(@RequestParam("id") Integer id){
        ObjectMapper mapper = new ObjectMapper();
        StudentModelGRPC.Empty request = StudentModelGRPC.Empty.newBuilder().setId(id).build();
        StudentModelGRPC.StudentResponse response = studentGrpcService.getStudent(request);
        System.out.println("response" + response.toString());
        Student student = new Student();
        String jsonString = "";
        try {
            jsonString = JsonFormat.printer()
                    .preservingProtoFieldNames()
                    .includingDefaultValueFields()
                    .omittingInsignificantWhitespace()
                    .print(response);
            student=  mapper.readValue(jsonString,Student.class);
        }catch(Exception e){
            e.printStackTrace();
        }
        return student;
    }

}
