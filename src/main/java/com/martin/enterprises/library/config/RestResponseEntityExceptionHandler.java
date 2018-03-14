package com.martin.enterprises.library.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.logging.Logger;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private Logger log = Logger.getLogger(RestResponseEntityExceptionHandler.class.getName());

    // handles all the exceptions
    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<Object> handleInternalServerError(Exception ex, WebRequest request) {

        log.warning(ex.getMessage());
        return handleExceptionInternal(ex, "Internal Server Error", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    // handles HTTP codes exceptions for the API
    @ExceptionHandler(value = { StatusCodeException.class })
    protected ResponseEntity<Object> handleStatusCode(StatusCodeException ex, WebRequest request) {

        log.warning(ex.getMessage());
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), ex.getStatusCode(), request);
    }
}
