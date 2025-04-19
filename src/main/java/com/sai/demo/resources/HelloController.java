package com.sai.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloController {


    @GetMapping("hello")
    public String helloMethod(){
        return "Hello World!";
    }

    @GetMapping("health")
    public String healthCheckEndpoint() {
        return "status: up";
    }
    
}
