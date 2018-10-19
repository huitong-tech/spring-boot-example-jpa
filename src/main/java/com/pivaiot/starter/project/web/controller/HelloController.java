package com.pivaiot.starter.project.web.controller;

import com.pivaiot.common.http.ResponseJson;
import com.pivaiot.starter.project.data.hello.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pivaiot.common.http.ResponseJson.ok;


@RestController
@RequestMapping("/api")
public class HelloController extends BaseController {

    @PostMapping("/hello")
    public String says(@RequestParam String says) {
        return helloService.sayHello(says);
    }

    @GetMapping("/greeting")
    public ResponseJson<Greeting> greeting() {

        return ok(Greeting.builder().says("hello").build());

    }

    @GetMapping("/greetings")
    public ResponseJson<List<Greeting>> findAllGreetings() {

        return ok(helloService.findAllGreetings());

    }

}
