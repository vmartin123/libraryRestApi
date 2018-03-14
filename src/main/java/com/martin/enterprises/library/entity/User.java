package com.martin.enterprises.library.entity;

import lombok.Data;

import javax.persistence.*;

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

    public User() {}

    public User(int dni, String firstName, String lastName, int age) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
