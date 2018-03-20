package com.martin.enterprises.library.repository;

import com.martin.enterprises.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByDni(@Param("dni") int dni);
    List<User> findByFirstName(@Param("firstName") String firstName);
    List<User> findByLastName(@Param("lastName") String lastName);
}
