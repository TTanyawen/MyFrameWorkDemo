package com.angela.controller;

import com.angela.sayhello.SayHelloSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SayHelloSrv sayHelloSrv;

    @RequestMapping("/sayhello")
    public String sayHelloToName()
    {
        return sayHelloSrv.sayHelloToName("Angela");
    }
}
