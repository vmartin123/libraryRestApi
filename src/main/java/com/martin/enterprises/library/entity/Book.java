package com.martin.enterprises.library.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String author;

    private String editorial;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable
    private Set<Category> categories = new HashSet<>();

    public Book() {}

    public Book(String name, String author, String editorial) {
        this.name = name;
        this.author = author;
        this.editorial = editorial;
    }
}