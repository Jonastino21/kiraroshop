package com.project.kiraroshop.service;

import com.project.kiraroshop.model.Products;
import com.project.kiraroshop.model.User;
import com.project.kiraroshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public boolean validateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public User addUser(User user) {
        User userr = new User();
        userr.setUsername(user.getUsername());
        userr.setPassword(user.getPassword());
        return userRepository.save(user);
    }
}
