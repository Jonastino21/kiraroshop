package com.project.kiraroshop.service;

import com.project.kiraroshop.model.Products;
import com.project.kiraroshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Products addProduct(Products product) {
        Products prod = new Products();
        prod.setName(product.getName());
        prod.setPrice(product.getPrice());
        prod.setDescription(product.getDescription());
        prod.setCategory(product.getCategory());
        prod.setStock(product.getStock());
        prod.setId(this.productRepository.save(prod).getId());
        prod.setImage(product.getImage());
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
