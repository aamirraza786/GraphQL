package com.graphql.learn.repositories;

import com.graphql.learn.entities.Book;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRep extends MongoRepository<Book,Integer> {

}
