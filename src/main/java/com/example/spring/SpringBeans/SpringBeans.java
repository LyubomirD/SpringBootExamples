package com.example.spring.SpringBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeans {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBeans.class, args);

        for (String s : applicationContext.getBeanDefinitionNames()) {
            System.out.println("Spring bean: " + s);
        }
    }

}

