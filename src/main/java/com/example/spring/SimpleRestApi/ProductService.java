package com.example.spring.SimpleRestApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product(1, "Mobile"));
        products.add(new Product(2, "Smart TV"));
        products.add(new Product(3, "Washing Machine"));
        products.add(new Product(4, "Laptop"));
        products.add(new Product(5, "Air Conditioner"));
        products.add(new Product(6, "Refrigerator "));

        return products;
    }
}
