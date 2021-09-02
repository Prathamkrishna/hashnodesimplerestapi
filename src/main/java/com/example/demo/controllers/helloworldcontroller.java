package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
    @GetMapping
    public String helloworld(){
        return "Hello world";
    }
}
