package com.BookstoreInvent.service;

import com.BookstoreInvent.model.Book;
import com.BookstoreInvent.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookByName(String name) {
        return bookRepository.findBookByTitle(name);
    }

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}