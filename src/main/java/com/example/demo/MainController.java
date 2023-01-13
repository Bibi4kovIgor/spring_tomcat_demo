package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class MainController {

    @GetMapping({"/", "/{name}"})
    public String hello(@PathVariable(value = "name", required = false) String name) {
        return Objects.isNull(name) ? "Hello World!" : "Hello " + name + "!";
    }
}
