package com.project.kiraroshop.controller;

import com.project.kiraroshop.model.Products;
import com.project.kiraroshop.model.User;
import com.project.kiraroshop.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/users")
public class LogiController {

    private final UserService userService;

    public LogiController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public User addUser (@RequestBody User user) {
        return userService.addUser(user);
    }
}
