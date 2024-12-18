package com.project.kiraroshop.repository;

import com.project.kiraroshop.model.Products;
import com.project.kiraroshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
    List<Products> findByCategory(String category);
}
