package com.martin.enterprises.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "book_id")
    private Long id;

    private String name;

    private String author;

    private String editorial;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "books_categories",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"))
    private Set<Category> categories = new HashSet<>();
}
