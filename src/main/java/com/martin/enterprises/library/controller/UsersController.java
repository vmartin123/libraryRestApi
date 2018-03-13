package com.martin.enterprises.library.controller;

import com.martin.enterprises.library.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getUsers() {

        return createUsers();
    }

    @GetMapping("/users/{DNI}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserByDni(@PathVariable int DNI) throws Exception {

        List<UserDto> usersList = createUsers();

        for (UserDto user : usersList) {
            if (user.getDNI() == DNI) {
                return user;
            }
        }

        throw new Exception();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserDto user) {

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
