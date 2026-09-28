package com.blogapplication.blog.services;

import java.util.List;

import com.blogapplication.blog.payloads.PostDto;
import com.blogapplication.blog.payloads.PostResponse;

public interface PostServices {
    
    PostDto createPost(PostDto postDto, int categoryId, int userId);

    PostDto updatePost(PostDto postDto, int id);

    void deletePost(int id);

    PostResponse getAllPosts(int pageNumber, int pageSize);

    PostDto getPostById(int id);

    PostResponse getPostByCategory(int categoryId, int pageNumber, int pageSize);

    PostResponse getPostByUser(int userId, int pageNumber, int pageSize);

    List<PostDto> searchPost(String keyword);
}
