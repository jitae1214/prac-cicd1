package com.example.prac_cicd1;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloContoroller {
    public String hello() {
        return "hello";
    }
}
