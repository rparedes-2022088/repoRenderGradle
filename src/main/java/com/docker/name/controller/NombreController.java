package com.docker.name.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class NombreController {
    @GetMapping
    public String miNombre(){
        return "Ruben Dario Paredes";
    }
}