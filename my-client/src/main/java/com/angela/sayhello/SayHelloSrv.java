package com.angela.sayhello;

import com.angela.framework.sayhello.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SayHelloSrv {
    @Autowired
    private SayHelloService sayHelloService;

    public String sayHelloToName(String name)
    {
        return sayHelloService.sayHello(name);
    }

}
