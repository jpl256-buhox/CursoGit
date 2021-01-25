package com.example.demo.controllers;


import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {


    @GetMapping(value="/saludo")
    public void Saludo(@RequestParam String Nombre){
        System.out.println("Hola mundo " + Nombre);
    }

}
