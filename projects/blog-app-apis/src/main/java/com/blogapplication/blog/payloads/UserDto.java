package com.blogapplication.blog.payloads;


import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@Getter 
@Setter
public class UserDto {
    
    private int id;

    @NotEmpty (message = "User name cannot be blank")
    private String name;

    @Email (regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Enter valid email address format")
    private String email;

    @Pattern (regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Password must contain at least 8 characters, one uppercase letter, one lowercase letter, one number, and one special character")
    private String password;
    
    @NotEmpty (message = "Please mention something about user")
    private String about;
}
