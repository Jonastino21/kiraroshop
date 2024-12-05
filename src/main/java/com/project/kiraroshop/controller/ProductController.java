package com.project.kiraroshop.controller;

import com.project.kiraroshop.model.Products;
import com.project.kiraroshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Products addProduct(@RequestBody Products products) {
        return productService.addProduct(products);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

