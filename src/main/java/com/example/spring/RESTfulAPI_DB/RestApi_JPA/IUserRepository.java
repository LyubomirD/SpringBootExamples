package com.example.spring.RESTfulAPI_DB.RestApi_JPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Integer> {
}
