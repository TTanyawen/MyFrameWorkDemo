package com.angela.framework.config;


import com.angela.framework.sayhello.SayHelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
@EnableConfigurationProperties(SayHelloApproperties.class)
public class SayHelloConfiguration {
    private final SayHelloApproperties sayHelloApproperties;
    @Bean
    public SayHelloService sayHelloService() {
        return new SayHelloService(sayHelloApproperties.getName(), sayHelloApproperties.getSex());
    }
}
