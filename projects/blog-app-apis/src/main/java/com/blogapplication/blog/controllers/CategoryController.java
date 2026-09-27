package com.blogapplication.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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

import com.blogapplication.blog.payloads.ApiResponse;
import com.blogapplication.blog.payloads.CategoryDto;
import com.blogapplication.blog.services.CategoryServices;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;





@RestController 
@RequestMapping ("/api/categories")
public class CategoryController {
    
    @Autowired 
    private CategoryServices categoryServices;

    
    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto){
        CategoryDto createCategoryDto = this.categoryServices.createCategory(categoryDto);
        return new ResponseEntity<CategoryDto>(createCategoryDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> updateCategory(@Valid @PathVariable int id, @RequestBody CategoryDto categoryDto) {
        CategoryDto updatedCategoryDto = this.categoryServices.updateCategory(categoryDto, id);
        return new ResponseEntity<CategoryDto>(updatedCategoryDto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@Valid @PathVariable int id) {
        CategoryDto getCategoryDto = this.categoryServices.getCategoryDtoById(id);
        return new ResponseEntity<CategoryDto>(getCategoryDto, HttpStatus.FOUND);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        
        return new ResponseEntity<>(this.categoryServices.getAllCategories(), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<ApiResponse> deleteCategory(@Valid @PathVariable int id){
        this.categoryServices.deleteCategory(id);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Category deleted successfully..!!", true), HttpStatus.OK);
    }
    

}
