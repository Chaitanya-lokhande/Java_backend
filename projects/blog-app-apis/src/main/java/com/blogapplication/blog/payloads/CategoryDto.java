package com.blogapplication.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@Getter 
@Setter 
public class CategoryDto {

    private int id;

    @NotEmpty (message = "Category title cannot be empty")
    private String categoryTitle;

    @NotEmpty (message = "Category Description cannot be empty")
    private String categoryDescription;
}
