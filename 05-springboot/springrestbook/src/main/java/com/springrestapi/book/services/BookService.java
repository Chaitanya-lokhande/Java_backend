package com.springrestapi.book.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springrestapi.book.dao.BookRepository;
import com.springrestapi.book.entities.Book;

@Component 
public class BookService {

    private final BookRepository bookRepository;

    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    //private static List<Book> list = new ArrayList<>();

    // static {
    //     list.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
    //     list.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
    //     list.add(new Book(3, "1984", "George Orwell"));
    // }

    public List<Book> getAllBooks() {
        List<Book> books = (List<Book>)this.bookRepository.findAll();
        return books;
    }

    public Book getBookById(int id) {
        return this.bookRepository.findById(id);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }
}
