package com.example.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8090")
public interface ProductServiceClient {
    @GetMapping("/products")
    List<Product> getProducts();

    @GetMapping("/products/{product_id}")
    Product getProductByID(@PathVariable("product_id") int id);
}
