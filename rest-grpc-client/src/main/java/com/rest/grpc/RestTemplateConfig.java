package com.rest.grpc;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufJsonFormatHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Configuration
@EnableScheduling
@ComponentScan(basePackages = {"com.rest.grpc.*"})
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    /*@Bean
    public ProtobufJsonFormatHttpMessageConverter protobufJsonFormatHttpMessageConverter()
    {
        return new ProtobufJsonFormatHttpMessageConverter();
    }*/

    @Bean
    public RestTemplate restTemplate(ProtobufJsonFormatHttpMessageConverter protobufJsonFormatHttpMessageConverter)
    {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(protobufJsonFormatHttpMessageConverter);

        return restTemplate;
    }

}
