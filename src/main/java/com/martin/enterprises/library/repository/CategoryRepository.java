package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByName(@Param("name") String name);
}
