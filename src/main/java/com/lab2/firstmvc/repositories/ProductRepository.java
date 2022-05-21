package com.lab2.firstmvc.repositories;


import com.lab2.firstmvc.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
