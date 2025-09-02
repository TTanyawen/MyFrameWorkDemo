package com.angela.framework.sayhello;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SayHelloService {

    public String sayHello(String name)
    {
        return "Hello " + name;
    }
}
