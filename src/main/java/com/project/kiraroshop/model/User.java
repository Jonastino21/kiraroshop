package com.project.kiraroshop.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name= "Users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
}
