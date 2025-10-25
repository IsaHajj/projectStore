package com.BookstoreApi.BookstoreApi_mongoD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private int quantity;
    private double price;
}