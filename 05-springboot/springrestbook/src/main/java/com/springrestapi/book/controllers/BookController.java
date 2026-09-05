package com.springrestapi.book.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.book.entities.Book;
import com.springrestapi.book.services.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
public class BookController {

    @Autowired 
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/home")
    public String requestMethodName() {
        return "This is a Home page";
    }
    
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books =  bookService.getAllBooks();
        if(books.size() <= 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(books));
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    public Book addNewBook(@RequestBody Book book) {
        bookService.addBook(book);
        return book;
    }

}
