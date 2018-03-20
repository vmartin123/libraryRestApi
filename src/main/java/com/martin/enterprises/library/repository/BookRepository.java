package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByName(@Param("name") String name);
    List<Book> findByAuthor(@Param("author") String author);
    List<Book> findByEditorial(@Param("editorial") String editorial);
}
