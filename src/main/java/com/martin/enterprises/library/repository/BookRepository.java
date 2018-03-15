package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByAuthor(String dni);
}
