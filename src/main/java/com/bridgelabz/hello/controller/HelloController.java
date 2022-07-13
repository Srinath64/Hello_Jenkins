package com.bridgelabz.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = {"/hello"})
    public String Hello(){
        return "Deployment of SpringBoot App in Tomcat server using Jenkins is Successfull !!!";
    }

}
