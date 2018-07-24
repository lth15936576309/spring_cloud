package com.cloud.servicefeign.service;

import com.cloud.servicefeign.service.hystrix.ScheduleServiceHelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-client", fallback = ScheduleServiceHelloHystrix.class)
public interface ScheduleServiceHello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHelloFromClient(String name);
}
