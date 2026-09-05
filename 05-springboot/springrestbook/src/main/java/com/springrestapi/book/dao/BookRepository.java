package com.springrestapi.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.springrestapi.book.entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
    public Book findById(int id);
    
}
