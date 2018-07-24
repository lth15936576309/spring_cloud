package com.cloud.servicefeign.service.hystrix;

import com.cloud.servicefeign.service.ScheduleServiceHello;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHelloHystrix implements ScheduleServiceHello {

    @Override
    public String sayHelloFromClient(String name) {
        return name + ", Error";
    }
}
