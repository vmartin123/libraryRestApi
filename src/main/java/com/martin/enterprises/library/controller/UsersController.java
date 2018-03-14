package com.martin.enterprises.library.controller;

import com.martin.enterprises.library.config.StatusCodeException;
import com.martin.enterprises.library.dto.UserDto;
import com.martin.enterprises.library.entity.User;
import com.martin.enterprises.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UsersController {

    private final UserRepository userRepository;

    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/users/{dni}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserByDni(@PathVariable int dni) {
        User user = userRepository.findByDni(dni);

        if (user == null) {
            throw new StatusCodeException(HttpStatus.NOT_FOUND);
        }else {
            return user;
        }
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@Valid @RequestBody UserDto user) {

        userRepository.save(new User(user.getDni(), user.getFirstName(), user.getLastName(), user.getAge()));
    }
}
