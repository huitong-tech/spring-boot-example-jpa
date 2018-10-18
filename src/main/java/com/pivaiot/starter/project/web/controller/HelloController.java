package com.pivaiot.starter.project.web.controller;

import com.pivaiot.starter.project.common.http.ResponseJson;
import com.pivaiot.starter.project.data.hello.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.pivaiot.starter.project.common.http.ResponseJson.ok;

@RestController
@RequestMapping("/api")
public class HelloController extends BaseController {

    @GetMapping("/hello")
    public String says(@RequestParam String says) {
        return helloService.sayHello(says);
    }

    @GetMapping("/greeting")
    public ResponseJson<Greeting> greeting() {

        return ok(Greeting.builder().says("hello").build());

    }
}
