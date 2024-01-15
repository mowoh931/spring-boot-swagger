package com.baar.springbootswagger.api;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")

public class PersonApi {

@ApiResponse(description = "Returns a message string", responseCode = "200")
    @GetMapping("/")
    public String getMessage() {
        return "Hello there!";
    }
}
