package com.lab2.firstmvc.bootstrap;

import com.lab2.firstmvc.services.TrackService;
import com.lab2.firstmvc.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserService userService;
    private final TrackService trackService;

    public DataLoader(UserService userService, TrackService trackService) {
        this.userService = userService;
        this.trackService = trackService;
    }

    @Override
    public void run(String... args) throws Exception {
        //Product p1 = new Product("apple", 10, "fruit");
        //productService.save(p1);

        //User u1 = new User("Maria", "maria@gmail.com");
        //userService.saveUser(u1);


    }
}
