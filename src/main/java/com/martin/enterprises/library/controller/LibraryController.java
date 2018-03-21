package com.martin.enterprises.library.controller;

import com.martin.enterprises.library.Util.CustomStatusCodes;
import com.martin.enterprises.library.config.StatusCodeException;
import com.martin.enterprises.library.dto.UserDto;
import com.martin.enterprises.library.model.Book;
import com.martin.enterprises.library.model.User;
import com.martin.enterprises.library.repository.BookRepository;
import com.martin.enterprises.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class LibraryController {

    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @Autowired
    public LibraryController(UserRepository userRepository, BookRepository bookRepository) {
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    @GetMapping("/test/{expected}")
    @ResponseStatus(HttpStatus.OK)
    public String test(@PathVariable String expected) {
        String test = "OK";

        if (test.equals(expected)) {
            return test;
        } else {
            throw new StatusCodeException(HttpStatus.NOT_FOUND, CustomStatusCodes.USUARIO_NO_ENCONTRADO);
        }
    }

//    @PostMapping("/users")
//    @ResponseStatus(HttpStatus.OK)
//    public User createUserBooksCategories(@Valid @RequestBody User user) {
//
//        userRepository.save(user);
//        return user;
//    }

//
//    @GetMapping("/users")
//    @ResponseStatus(HttpStatus.OK)
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/books")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Book> getBooks() {
//        return bookRepository.findAll();
//    }
//
//    @GetMapping("/users/{dni}")
//    @ResponseStatus(HttpStatus.OK)
//    public User getUserByDni(@PathVariable int dni) {
//        User user = userRepository.findByDni(dni);
//
//        if (user == null) {
//            throw new StatusCodeException(HttpStatus.NOT_FOUND);
//        }else {
//            return user;
//        }
//    }
//
//    @GetMapping("/users/{dni}/books")
//    @ResponseStatus(HttpStatus.OK)
//    public User getUserBooksByDni(@PathVariable int dni) {
//        User user = userRepository.findByDni(dni);
//
//        if (user == null) {
//            throw new StatusCodeException(HttpStatus.NOT_FOUND);
//        }else {
//            return user;
//        }
//    }
//
//    @PostMapping("/users")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createUser(@Valid @RequestBody UserDto user) {
//
//        userRepository.save(new User(user.getDni(), user.getFirstName(), user.getLastName(), user.getAge()));
//    }
//
//    @PostMapping("/books_users")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createUserBooks(@Valid @RequestBody Book book) {
//
//        bookRepository.save(book);
//    }
}
