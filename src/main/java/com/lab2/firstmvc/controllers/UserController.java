package com.lab2.firstmvc.controllers;

import com.lab2.firstmvc.domain.User;
import com.lab2.firstmvc.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String viewUsers(Model model){
        model.addAttribute("users",userService.findAllUsers());
        return "users";
    }

    @GetMapping("/new")
    public String showAddUserForm(Model model){
        model.addAttribute("user",new User());
        return "addusers";
    }

    @PostMapping("/new")
    public String addUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
}
