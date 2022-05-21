package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Product;

public interface ProductService {
    Iterable<Product> findAll();
    Product save(Product p);
    String findByPrice(double price);
    //take only the product that respect the criteria
}