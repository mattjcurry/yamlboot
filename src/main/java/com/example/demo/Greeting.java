package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@Getter @Setter
public class Greeting implements Serializable {

    private GreetingConfiguration greetingConfiguration;
    private final long id;
    private final String content;

    public Greeting(GreetingConfiguration greetingConfiguration, long id, String content) {
        this.greetingConfiguration = greetingConfiguration;
        this.id = id;
        this.content = content;
    }
}
