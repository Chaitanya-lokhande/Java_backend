package com.blogapplication.blog.services;

import java.util.List;

import com.blogapplication.blog.payloads.UserDto;

public interface UserServices {
    UserDto createUser(UserDto user);
    UserDto updateuser(UserDto user, int userId);
    UserDto getUserById(int userId);
    void  deleteUser(int userId);
    List<UserDto> getAllUsers();
}
