package com.lcwd.hotel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/staffs")
@RestController
public class StaffController {

    @GetMapping
    public ResponseEntity<List<String>> getStaffas(){

        List<String> list = Arrays.asList("Ram","Shyam","Seeta");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
