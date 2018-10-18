package com.pivaiot.starter.project.web.controller;

import com.pivaiot.starter.project.service.hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController {

    @Autowired
    protected HelloService helloService;

}
