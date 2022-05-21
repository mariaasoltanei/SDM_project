package com.lab2.firstmvc.bootstrap;

import com.lab2.firstmvc.services.ProductService;
import com.lab2.firstmvc.domain.User;
import com.lab2.firstmvc.services.ProductService;
import com.lab2.firstmvc.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final ProductService productService;
    private final UserService userService;

    public DataLoader(ProductService productService, UserService userService) {

        this.productService = productService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        //Product p1 = new Product("apple", 10, "fruit");
        //productService.save(p1);

        //User u1 = new User("Maria", "maria@gmail.com");
        //userService.saveUser(u1);


    }
}
