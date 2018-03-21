package com.martin.enterprises.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(unique=true)
    private int dni;

    private String firstName;

    private String lastName;

    private int age;

    @OneToMany(mappedBy = "user")
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
