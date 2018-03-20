package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByDni(int dni);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
}
