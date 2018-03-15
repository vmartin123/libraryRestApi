package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Category findByName(String name);
}
