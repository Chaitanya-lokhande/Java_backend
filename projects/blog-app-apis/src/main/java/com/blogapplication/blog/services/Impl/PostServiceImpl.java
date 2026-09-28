package com.blogapplication.blog.services.Impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.blogapplication.blog.entities.Category;
import com.blogapplication.blog.entities.Post;
import com.blogapplication.blog.entities.User;
import com.blogapplication.blog.exceptions.ResourceNotFoundException;
import com.blogapplication.blog.payloads.PostDto;
import com.blogapplication.blog.payloads.PostResponse;
import com.blogapplication.blog.repositories.CategoryRepository;
import com.blogapplication.blog.repositories.PostRepository;
import com.blogapplication.blog.repositories.UserRepository;
import com.blogapplication.blog.services.PostServices;

@Service 
public class PostServiceImpl implements PostServices{

    @Autowired 
    private PostRepository postRepository;

    @Autowired 
    private ModelMapper modelMapper;

    @Autowired 
    private UserRepository userRepository;

    @Autowired 
    private CategoryRepository categoryRepository;
    
    
    @Override
    public PostDto createPost(PostDto postDto, int categoryId, int userId) {
        
        User user = this.userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "id", userId));
        Category category = this.categoryRepository.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "id", categoryId));

        Post post = this.modelMapper.map(postDto, Post.class);
        post.setImageName("default.png");
        post.setAddedDate(new Date());
        post.setUser(user);
        post.setCategory(category);

        Post createdPost = this.postRepository.save(post);

        return this.modelMapper.map(createdPost, PostDto.class);

    }

    @Override
    public PostDto updatePost(PostDto postDto, int id) {
        
        Post post = this.postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setAddedDate(new Date());

        Post updatedPost = this.postRepository.save(post);

        return this.modelMapper.map(updatedPost, PostDto.class);
    }

    @Override
    public void deletePost(int id) {

        Post post = this.postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post", "id", id));

        this.postRepository.delete(post);
       
    }

    @Override
    public PostResponse getAllPosts(int pageNumber, int pageSize) {

        PostResponse postResponse = new PostResponse();

        Pageable p = PageRequest.of(pageNumber, pageSize);
        Page<Post> pagePost = this.postRepository.findAll(p);

        List<Post> posts = pagePost.getContent();

        List<PostDto> postDtos = posts.stream().map(post->this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());

        postResponse.setContent(postDtos);
        postResponse.setPageNumber(pagePost.getNumber());
        postResponse.setPageSize(pagePost.getSize());
        postResponse.setTotalElements(pagePost.getTotalElements());
        postResponse.setLastPage(pagePost.isLast());
        postResponse.setTotalPages(pagePost.getTotalPages());

        return postResponse;
    }

    @Override
    public PostDto getPostById(int id) {
        Post post = this.postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post", "id", id));

        return this.modelMapper.map(post, PostDto.class);
    }

    @Override
    public PostResponse getPostByCategory(int categoryId, int pageNumber, int pageSize) {
        PostResponse postResponse = new PostResponse();
        Pageable p = PageRequest.of(pageNumber, pageSize);
        Category category = this.categoryRepository.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "id", categoryId));

        Page<Post> pagePost = this.postRepository.findByCategory(category, p);

        List<Post> posts = pagePost.getContent();

        List<PostDto> postDtos = posts.stream().map(post-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        postResponse.setContent(postDtos);
        postResponse.setPageNumber(pagePost.getNumber());
        postResponse.setPageSize(pagePost.getSize());
        postResponse.setTotalElements(pagePost.getTotalElements());
        postResponse.setLastPage(pagePost.isLast());
        postResponse.setTotalPages(pagePost.getTotalPages());
        return postResponse;
    }

    @Override
    public PostResponse getPostByUser(int userId, int pageNumber, int pageSize) {
        PostResponse postResponse = new PostResponse();
        Pageable p = PageRequest.of(pageNumber, pageSize);
        User user = this.userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "id", userId));

        Page<Post> pagePost = this.postRepository.findByUser(user, p);
        List<Post> posts = pagePost.getContent();
        List<PostDto> postDtos = posts.stream().map(post-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
        postResponse.setContent(postDtos);
        postResponse.setPageNumber(pagePost.getNumber());
        postResponse.setPageSize(pagePost.getSize());
        postResponse.setTotalElements(pagePost.getTotalElements());
        postResponse.setLastPage(pagePost.isLast());
        postResponse.setTotalPages(pagePost.getTotalPages());
        return postResponse;

    }

    @Override
    public List<PostDto> searchPost(String keyword) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchPost'");
    }
    
}
