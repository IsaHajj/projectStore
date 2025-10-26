package com.BookstoreInvent.controller;

import com.BookstoreInvent.model.Book;
import com.BookstoreInvent.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/book/v1")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book saveBook = bookService.addBook(book);
        return ResponseEntity.ok(saveBook);
    }

    @GetMapping("/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name) {
        final Book bookByName = bookService.getBookByName(name);
        return ResponseEntity.ok(bookByName);
    }

    @GetMapping
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        final Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}