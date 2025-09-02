package com.angela.framework.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="my.framework.hello")
@Data
public class SayHelloApproperties {
    private String name;
    private String sex;
}
