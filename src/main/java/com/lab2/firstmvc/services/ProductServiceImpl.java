package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Product;
import com.lab2.firstmvc.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepo;

    List<Product> products = new ArrayList(List.of(
            new Product(13L, "ice cream", 15, "food"),
            new Product(15L, "bike", 2000, "transport"),
            new Product(19L, "car",6500,"transport"))
    );
    List<Product> found=new ArrayList<Product>();

    public ProductServiceImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product save(Product p) {
        return productRepo.save(p);
    }

    @Override
    public String findByPrice(double price) {
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getPrice() == price) {
                return products.get(i).getName();
            }
        }
        return null;
    }
}