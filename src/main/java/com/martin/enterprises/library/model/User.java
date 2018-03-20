package com.martin.enterprises.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Book> books = new ArrayList<>();

    public User() {}

    public User(int dni, String firstName, String lastName, int age) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(int dni, String firstName, String lastName, int age, List<Book> books) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }
}
