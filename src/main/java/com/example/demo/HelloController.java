package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${from}")
    private  String env;

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot8";
    }

    @RequestMapping("/env")
    public String helloEnv(){
        return "Hello env "+env;
    }
}
