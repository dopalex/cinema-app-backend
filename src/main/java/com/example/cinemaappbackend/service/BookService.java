package com.example.cinemaappbackend.service;

import com.example.cinemaappbackend.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List<Book> findAll();
}
