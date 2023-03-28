package com.graphql.learn.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "book")
public class Book {
     @Id
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
