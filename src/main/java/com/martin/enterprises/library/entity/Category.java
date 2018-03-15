package com.martin.enterprises.library.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Book> books = new HashSet<>();

    public Category() {}

    public Category(String name) {
        this.name = name;
    }
}
