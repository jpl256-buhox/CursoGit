package com.example.demo.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    Logger logger = LoggerFactory.getLogger(GitController.class);

    @GetMapping(value="/saludo")
    public void Saludo(@RequestParam String Nombre){
        logger.info("Hola mundo " + Nombre);
    }

}
