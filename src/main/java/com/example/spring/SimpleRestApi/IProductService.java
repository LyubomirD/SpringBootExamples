package com.example.spring.SimpleRestApi;
import java.util.List;

@FunctionalInterface
public interface IProductService {
List<Product> findAll();
}
