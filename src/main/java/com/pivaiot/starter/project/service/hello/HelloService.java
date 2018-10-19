package com.pivaiot.starter.project.service.hello;

import com.pivaiot.starter.project.data.hello.Greeting;

import java.util.List;

public interface HelloService {

    String sayHello(String says);

    List<Greeting> findAllGreetings();

}
