package com.pivaiot.starter.project.service.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DefaultHelloService implements HelloService {
    @Override
    public String sayHello(String says) {

        // 这样打印日志
        LOGGER.info("Client received: {}", says);

        return "Pong: " + says;
    }
}
