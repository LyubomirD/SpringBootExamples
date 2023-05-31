package com.example.spring.RESTfulAPI_DB.RestApi_JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:2323/rest_jdbc_items");
        dataSource.setUsername("lubodimoff");
        dataSource.setPassword("");

        return dataSource;
    }

}
