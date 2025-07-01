package com.example.microserviciousuarios.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Value("${message:Mensaje por defecto del microservicio de usuarios}")
    private String configMessage;

    @Value("${db.url:URL de BD por defecto para usuarios}")
    private String dbUrl;

    @GetMapping("/saludo")
    public String getSaludo() {
        return "Microservicio Usuarios: " + configMessage + " - DB URL: " + dbUrl;
    }

    @GetMapping("/listar")
    public String listarUsuarios() {
        return "Lógica para listar usuarios (con configuración: " + configMessage + ")";
    }

    @GetMapping("/alta")
    public String altaUsuario() {
        return "Lógica para dar de alta un usuario (usando DB: " + dbUrl + ")";
    }
}
