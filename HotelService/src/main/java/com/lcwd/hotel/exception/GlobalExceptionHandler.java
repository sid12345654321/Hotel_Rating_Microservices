package com.lcwd.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handlerResourceNotFoundEcxeption(ResourceNotFoundException ex){
        Map<String,Object> map = new HashMap<>();
       String message = ex.getMessage();
       map.put("message",message);
       map.put("success","failure");
       map.put("HttpStatus", HttpStatus.NOT_FOUND);
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);


    }


}
