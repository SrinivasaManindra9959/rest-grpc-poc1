package com.rest.grpc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Student {
    private Integer id;
    private String name;
    private String college;

}
