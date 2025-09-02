package com.angela.framework.config;


import com.angela.framework.sayhello.SayHelloService;
import org.springframework.context.annotation.Bean;

public class SayHelloConfiguration {
    @Bean
    public SayHelloService sayHelloService() {
        return new SayHelloService();
    }
}
