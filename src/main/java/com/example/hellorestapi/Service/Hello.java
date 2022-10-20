package com.example.hellorestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class Hello {
    public String hello(String userId){
        return "Hello, "+userId+"!! This is Test RESTFUL API:)";
    }
}

