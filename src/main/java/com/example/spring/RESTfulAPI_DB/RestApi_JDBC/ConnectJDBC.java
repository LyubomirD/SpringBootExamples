package com.example.spring.RESTfulAPI_DB.RestApi_JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ConnectJDBC {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ConnectJDBC(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
