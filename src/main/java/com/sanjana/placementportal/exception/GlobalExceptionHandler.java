package com.sanjana.placementportal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class) public ResponseEntity<String>handleStudentNotFound(StudentNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage() , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class) public ResponseEntity<String> handleException(){
        return new ResponseEntity<>("Something went wrong(Internal Server Error)" , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex){

        Map<String, String> errors= new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField() , error.getDefaultMessage()));

        return new ResponseEntity<>(errors , HttpStatus.BAD_REQUEST);
    }
}
