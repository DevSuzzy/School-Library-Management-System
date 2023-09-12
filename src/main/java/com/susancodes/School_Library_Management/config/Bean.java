package com.susancodes.School_Library_Management.config;


import com.fasterxml.jackson.databind.ObjectMapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Bean {
    @org.springframework.context.annotation.Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

    @org.springframework.context.annotation.Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
