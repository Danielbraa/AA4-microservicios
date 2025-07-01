package com.example.microservicioproductores.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productores")
public class ProductorController {

    @Value("${message:Mensaje por defecto del microservicio de productores}")
    private String configMessage;

    @Value("${db.url:URL de BD por defecto para productores}")
    private String dbUrl;

    @GetMapping("/saludo")
    public String getSaludo() {
        return "Microservicio Productores: " + configMessage + " - DB URL: " + dbUrl;
    }

    @GetMapping("/listar")
    public String listarProductores() {
        return "Lógica para listar productores...";
    }
}