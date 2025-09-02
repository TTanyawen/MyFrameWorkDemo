package com.angela.controller;

import com.angela.sayhello.SayHelloSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SayHelloSrv sayHelloSrv;

    @RequestMapping("/sayhello/toname")
    public String sayHelloToName(String name)
    {
        return sayHelloSrv.sayHelloToName(name);
    }
    @RequestMapping("/sayhello")
    public String sayHello()
    {
        return sayHelloSrv.sayHello();
    }
    @RequestMapping("/autohello")
    public String autoHello()
    {
        return sayHelloSrv.autoHello();
    }
}
