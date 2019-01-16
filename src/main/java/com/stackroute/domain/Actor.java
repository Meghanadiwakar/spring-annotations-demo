package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:Application.properties")
public class Actor {

    @Autowired

    @Value("${actor.name}")
    private String name;

    @Value("${actor.age}")
    private String age;

    @Value("${actor.gender}")
    private String gender;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

