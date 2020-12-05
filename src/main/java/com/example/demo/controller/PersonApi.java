package com.example.demo.controller;

import com.example.demo.dto.PersonDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/person")
public class PersonApi {

    @PostMapping
    public HttpResponse<Void> addPerson(@RequestBody PersonDTO personDTO){
        return null;
    }
}
