package com.smart.home.common.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@CrossOrigin
public class SystemRestController {


    @GetMapping(value = "/hello")
    public String hello(){
        return UUID.randomUUID().toString();
    }

}
