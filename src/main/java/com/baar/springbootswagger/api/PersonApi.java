package com.baar.springbootswagger.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")

public class PersonApi {


    @GetMapping("/")
    public String getMessage() {
        return "Hello there!";
    }
}
