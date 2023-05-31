package com.example.spring.SpringBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {

    @Bean
    public String strBean() {
        return staticBean();
    }

    @Bean
    public MyBean beanBean() {
        return new MyBean();
    }

    @Bean
    public static String staticBean() {
        return "Text";
    }
}


/*
@Bean

A bean can NOT be private or void.
A bean could be used without the annotation @Configuration
A bean has to return something always
Beans are usually methods defined in class that has the @Configuration,
or other type of annotation like @Component, @Service, @Repository

What is @Configuration
- Bean defining class
- can be important for import configurations
- external configuration
 */