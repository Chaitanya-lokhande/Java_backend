package com.blogapplication.blog.services;

import java.util.List;

import com.blogapplication.blog.payloads.CategoryDto;

public interface CategoryServices {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto, int id);

    CategoryDto getCategoryDtoById(int id);

    List<CategoryDto> getAllCategories();
    
    void deleteCategory(int id);
}
