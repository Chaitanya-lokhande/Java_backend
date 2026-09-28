package com.blogapplication.blog.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blogapplication.blog.payloads.ApiResponse;
import com.blogapplication.blog.payloads.PostDto;
import com.blogapplication.blog.payloads.PostResponse;
import com.blogapplication.blog.services.PostServices;




@RestController 
@RequestMapping ("/api/posts")
public class PostController {

    @Autowired 
    private PostServices postServices;
    
    @PostMapping("/user/{userId}/category/{categoryId}/post")
    public ResponseEntity<PostDto> createPostHandler(@RequestBody PostDto postDto, @PathVariable int userId, @PathVariable int categoryId) {
        PostDto createdPostDto = this.postServices.createPost(postDto, categoryId, userId);
         
        return new ResponseEntity<>(createdPostDto, HttpStatus.CREATED);
    }
    
    @GetMapping("/all")
    public ResponseEntity<PostResponse> getAllPostsHandler(@RequestParam (value = "pageNumber", defaultValue = "0", required = false) int pageNumber,
     @RequestParam (value = "pageSize", defaultValue = "10", required = false) int pageSize) {
        return new ResponseEntity<PostResponse>(this.postServices.getAllPosts(pageNumber, pageSize), HttpStatus.FOUND); 
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<PostDto> getPostByIdHandler(@PathVariable int id) {
        return new ResponseEntity<PostDto>(this.postServices.getPostById(id), HttpStatus.FOUND);
    }

    @GetMapping ("/category/{categoryId}/post")
    public ResponseEntity<PostResponse> getPostByCategoryHandler(@PathVariable int categoryId, @RequestParam (value = "pageNumber", defaultValue = "0", required = false) int pageNumber,
        @RequestParam (value = "pageSize", defaultValue = "5", required = false) int pageSize){
        return new ResponseEntity<PostResponse>(this.postServices.getPostByCategory(categoryId, pageNumber, pageSize), HttpStatus.FOUND);
    }

    @GetMapping ("/user/{userId}/post")
    public ResponseEntity<PostResponse> getPostByUserHandler(@PathVariable int userId, @RequestParam (value = "pageNumber", defaultValue = "0", required = false) int pageNumber,
        @RequestParam (value = "pageSize", defaultValue = "5", required = false) int pageSize){
        return new ResponseEntity<PostResponse>(this.postServices.getPostByUser(userId, pageNumber, pageSize), HttpStatus.FOUND);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<ApiResponse> deletePostHandler(@PathVariable int id){
        this.postServices.deletePost(id);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Post deleted successfully..!!", true), HttpStatus.OK);
    }

    @PutMapping("post/{id}")
    public ResponseEntity<PostDto> updatePosthandler(@PathVariable int id, @RequestBody PostDto postDto) {
        
        return new ResponseEntity<PostDto>(this.postServices.updatePost(postDto, id), HttpStatus.OK);
    }
       

}
