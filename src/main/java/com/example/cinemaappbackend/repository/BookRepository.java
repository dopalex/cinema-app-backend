package com.example.cinemaappbackend.repository;

import com.example.cinemaappbackend.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);
    List<Book> findAll();
}
