package com.BookstoreApi.BookstoreApi_mongoD.repository;

import com.BookstoreApi.BookstoreApi_mongoD.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
    public Book findBookByTitle(String title);
}