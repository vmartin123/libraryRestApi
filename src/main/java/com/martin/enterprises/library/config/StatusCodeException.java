package com.martin.enterprises.library.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class StatusCodeException {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    public void notFound() {
        // Nothing to do
    }
}
