package com.example.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private ProductServiceClient productServiceClient;

    public List<Product> getProducts() {
        List<Product> productList = productServiceClient.getProducts();
        return productList;
    }

    public Product getProductByID(int id) {
        return productServiceClient.getProductByID(id);
    }
}
