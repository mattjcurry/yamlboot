package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;


@Getter @Setter
@PropertySource(value = "classpath:config.yml")
@ComponentScan(basePackages = { "com.example.*" })
@ConfigurationProperties(prefix="test", ignoreUnknownFields = false)

public class GreetingConfiguration {

    @NotNull
    private List<String> endpoints;
    @NotNull
    private String name;
}
