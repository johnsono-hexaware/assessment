package com.example.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return userService.getProducts();
    }

    @GetMapping("/products/{product_id}")
    public Product getProductByID(@PathVariable("product_id") int id) {
        return userService.getProductByID(id);
    }
}
