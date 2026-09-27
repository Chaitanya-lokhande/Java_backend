package com.blogapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapplication.blog.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
