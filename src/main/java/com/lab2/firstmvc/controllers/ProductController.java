package com.lab2.firstmvc.controllers;


import com.lab2.firstmvc.domain.Product;
import com.lab2.firstmvc.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
@Slf4j
@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    //-populate the model with the retrieved products!
    //-select the appropriate view (navigation)
    @GetMapping
    public String viewProducts(Model model){
        model.addAttribute("products",productService.findAll());
        return "products";
    }

    @GetMapping("/new")
    public String showAddProductForm(Model model){
        model.addAttribute("product",new Product());
        return "addproducts";
    }

    @PostMapping("/new")
    public String addProduct(Product product){
        productService.save(product);
        return "redirect:/products";
    }


    @GetMapping("/find")
    public String showFindProduct(){
        return "findproduct";
    }

    @PostMapping("/find")
    public String showFoundProduct(@RequestParam double price){
        productService.findByPrice(price);
        return "redirect:/foundproducts";
    }
}