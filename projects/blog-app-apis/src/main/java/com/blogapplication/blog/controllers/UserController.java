package com.blogapplication.blog.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapplication.blog.payloads.UserDto;
import com.blogapplication.blog.services.UserServices;

import jakarta.validation.Valid;




@RestController 
@RequestMapping ("/api/users")
public class UserController {

    @Autowired 
    private UserServices userServices;

    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
        
        UserDto createdUserDto = this.userServices.createUser(userDto);

        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable("id") Integer userId) {
        
        UserDto updatedUser = this.userServices.updateuser(userDto, userId);
        return ResponseEntity.ok(updatedUser);

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@Valid @PathVariable("id") int userId) {
        UserDto userDto = this.userServices.getUserById(userId);
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteUser(@Valid @PathVariable ("id") int userId) {
        this.userServices.deleteUser(userId);

        return ResponseEntity.ok(Map.of("message", "User deleted successfully..!!"));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(this.userServices.getAllUsers());
    
    }
       
}
