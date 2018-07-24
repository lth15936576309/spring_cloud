package com.cloud.servicefeign.controller;

import com.cloud.servicefeign.service.ScheduleServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ScheduleServiceHello scheduleServiceHello;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name) {
        return scheduleServiceHello.sayHelloFromClient(name);
    }
}
