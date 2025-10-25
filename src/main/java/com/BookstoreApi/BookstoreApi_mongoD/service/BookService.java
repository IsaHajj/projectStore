package com.BookstoreApi.BookstoreApi_mongoD.service;

import com.BookstoreApi.BookstoreApi_mongoD.model.Book;
import com.BookstoreApi.BookstoreApi_mongoD.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
     @Autowired
     BookRepo bookRepo;

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }
    public Book getBookByName(String name) {
         return bookRepo.findBookByTitle(name);
    }

    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);
    }
}