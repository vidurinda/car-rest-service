package com.ices.crs.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.NoSuchElementException;

@ControllerAdvice
public class CustomExceptionHandler {


    protected ResponseEntity<?> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(),
                "Invalid Request Parameters", ex.getMessage(),status.value());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NoSuchElementException.class)
    protected ResponseEntity<?> handleNoElementFoundException(NoSuchElementException ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(),
                "Requested resource not found", ex.getMessage(),HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(Exception.class)
    protected ResponseEntity<?> handleExceptionInternal(Exception ex, HttpStatus status) {
        ExceptionResponse response = new ExceptionResponse(new Date(),
                "Something went wrong", ex.getMessage(), status.value());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
