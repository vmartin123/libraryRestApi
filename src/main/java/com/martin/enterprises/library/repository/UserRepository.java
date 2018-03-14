package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByDni(int dni);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
}
