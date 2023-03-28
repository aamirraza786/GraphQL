package com.graphql.learn.services;

import com.graphql.learn.entities.Book;

import java.util.List;


public interface BookService {
    //create
    Book create(Book book);
    //get all
    List<Book> findAll();

    //get
    Book get(int bookId);
}
