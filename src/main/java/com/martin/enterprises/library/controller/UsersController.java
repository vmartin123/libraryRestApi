package com.martin.enterprises.library.controller;

import com.martin.enterprises.library.config.StatusCodeException;
import com.martin.enterprises.library.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getUsers() {
        List<UserDto> usersList = createUsers();

        if (usersList == null) {
            throw new StatusCodeException(HttpStatus.NOT_FOUND);
        } else {
            return usersList;
        }
    }

    @GetMapping("/users/{dni}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserByDni(@PathVariable int dni) {
        List<UserDto> usersList = createUsers();

        for (UserDto user : usersList) {
            if (user.getDni() == dni) {
                return user;
            }
        }

        throw new StatusCodeException(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@Valid @RequestBody UserDto user) {
        System.out.println("User created: " + user.toString());
    }

    private List<UserDto> createUsers() {
        UserDto u1 = new UserDto(95573928,"victor","martin",30);
        UserDto u2 = new UserDto(95345454,"dubraska","prime",22);
        UserDto u3 = new UserDto(95123456,"firstName","lastName",35);

        List<UserDto> usersList = new ArrayList<>();
        usersList.add(u1);
        usersList.add(u2);
        usersList.add(u3);

        return usersList;
    }
}
