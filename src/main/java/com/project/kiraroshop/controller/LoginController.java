package com.project.kiraroshop.controller;

import com.project.kiraroshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginPage(){
        return "/admin/login";
    }

    @PostMapping("/login")
    public String handleLogin(String username, String password, Model model){
        boolean isValid = userService.validateUser(username, password);
        if(isValid){
            return "redirect:/admin/admin";
        } else {
            model.addAttribute("message", "Invalid username or password");
            return "/admin/login";
        }
    }

}
