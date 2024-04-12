package com.cicd.tp.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.constraints.NotBlank;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-surname/{surname}")
    public String helloSurname(@PathVariable String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Surname cannot be empty");
        }
        return "Hello " + surname + "!";
    }
}
