package com.blogapplication.blog.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapplication.blog.entities.Category;
import com.blogapplication.blog.exceptions.ResourceNotFoundException;
import com.blogapplication.blog.payloads.CategoryDto;
import com.blogapplication.blog.repositories.CategoryRepository;
import com.blogapplication.blog.services.CategoryServices;

@Service 
public class CategoryServiceImpl implements CategoryServices{

    @Autowired 
    private CategoryRepository categoryRepository;

    @Autowired 
    private ModelMapper modelMapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = this.categoryDtoToCategory(categoryDto);
        Category savedCategory = this.categoryRepository.save(category);
        return this.categoryToCategoryDto(savedCategory);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, int id) {
        Category category = this.categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("category", "id", id));
        
        category.setCategoryDescription(categoryDto.getCategoryDescription());
        category.setCategoryTitle(categoryDto.getCategoryTitle());

        Category updatedCategory = this.categoryRepository.save(category);

        return this.categoryToCategoryDto(updatedCategory);

    }

    @Override
    public CategoryDto getCategoryDtoById(int id) {
        Category category = this.categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("category", "id", id));
        return this.categoryToCategoryDto(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> allCategories = this.categoryRepository.findAll();

        List<CategoryDto> allCategoryDtos = allCategories.stream().map(category->this.categoryToCategoryDto(category)).collect(Collectors.toList());

        return allCategoryDtos;
    }

    @Override
    public void deleteCategory(int id) {
        Category category = this.categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("category", "id", id));
        this.categoryRepository.delete(category);
    }

    public Category categoryDtoToCategory(CategoryDto categoryDto){
        return this.modelMapper.map(categoryDto, Category.class);
    }

    public CategoryDto categoryToCategoryDto(Category category){
        return this.modelMapper.map(category, CategoryDto.class);
    }
    
}
