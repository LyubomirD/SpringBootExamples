package com.example.spring.RESTfulAPI_DB.RestApi_JDBC;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public ItemModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ItemModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
