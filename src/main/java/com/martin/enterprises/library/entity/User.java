package com.martin.enterprises.library.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private int dni;

    private String firstName;

    private String lastName;

    private int age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Book> books = new HashSet<>();

    public User() {}

    public User(int dni, String firstName, String lastName, int age) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(int dni, String firstName, String lastName, int age, Set<Book> books) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }
}
