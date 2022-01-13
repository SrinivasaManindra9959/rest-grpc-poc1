package com.stub;

import com.stub.service.StudentGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcServerApplication {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Inside Main");
        SpringApplication.run(GrpcServerApplication.class,args);
        Server server = ServerBuilder.forPort(8000).addService(new StudentGrpcServiceImpl()).build();
        server.start();
        System.out.println("Server port "+server.getPort());
        server.awaitTermination();

    }
}
