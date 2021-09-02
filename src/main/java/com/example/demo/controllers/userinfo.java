package com.example.demo.controllers;

import com.example.demo.model.userdetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userinfo {
    @PostMapping("/user/addinfo")
    public String addUserInfo(@RequestBody userdetails details){
        System.out.println(details.getUsername());
        return details.getUsername();
    }
}
