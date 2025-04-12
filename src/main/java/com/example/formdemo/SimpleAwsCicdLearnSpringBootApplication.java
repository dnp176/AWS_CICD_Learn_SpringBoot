package com.example.formdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleAwsCicdLearnSpringBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAwsCicdLearnSpringBootApplication.class, args);
        System.out.println("SimpleAwsCicdLearnSpringBootApplication Starting now...!!!");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimpleAwsCicdLearnSpringBootApplication.class);
    }
}
