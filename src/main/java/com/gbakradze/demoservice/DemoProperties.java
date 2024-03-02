package com.gbakradze.demoservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("demo")
@Data
public class DemoProperties {
    /**
     * A welcome message to the users
     */
    private String message;
}
