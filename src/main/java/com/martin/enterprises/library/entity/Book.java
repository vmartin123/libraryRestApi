package com.martin.enterprises.library.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    private String author;

    private String editorial;

    public Book() {}

    public Book(String name, String author, String editorial) {
        this.name = name;
        this.author = author;
        this.editorial = editorial;
    }
}
