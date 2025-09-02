package com.angela.framework.sayhello;

import com.angela.framework.config.SayHelloApproperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class SayHelloService {


    private final String name;
    private final String sex;

    public String sayHello(String name)
    {
        return "Hello " + name;
    }
    public String sayHelloWithConfigName()
    {
        return "Hello ";
    }
    public String autoHello()
    {
        return "Hello "
                +name+" ("
                +sex+")"
                ;
    }
}
