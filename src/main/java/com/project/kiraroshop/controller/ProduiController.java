package com.project.kiraroshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduiController{
    @GetMapping("/admin")
    public String admin() {
        return "/admin/admin";
    }

    @GetMapping("products")
    public String produits() {
        return "/admin/products";
    }
}
