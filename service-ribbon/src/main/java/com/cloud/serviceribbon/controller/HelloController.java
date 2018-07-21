package com.cloud.serviceribbon.controller;

import com.cloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @GetMapping(value = "hello")
    public String hello(@RequestParam String name) {
        return service.helloService(name);
    }
}
