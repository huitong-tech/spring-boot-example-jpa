package com.pivaiot.starter.project.service.hello;

import com.pivaiot.starter.project.data.hello.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class DefaultHelloService implements HelloService {
    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String sayHello(String says) {

        GreetingEntity greeting = new GreetingEntity();
        greeting.setSays(says);
        greetingRepository.save(greeting);

        // 这样打印日志
        LOGGER.info("Client received: {}", says);

        return "Pong: " + says;
    }

    @Override
    public List<Greeting> findAllGreetings() {
        return greetingRepository.findAll().stream()
            .map(GreetingEntity::toData)
            .collect(Collectors.toList());
    }
}
