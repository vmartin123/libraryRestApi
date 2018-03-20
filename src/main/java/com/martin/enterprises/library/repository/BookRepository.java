package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByAuthor(String dni);
}
