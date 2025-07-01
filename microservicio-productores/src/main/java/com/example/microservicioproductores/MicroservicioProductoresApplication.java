package com.example.microservicioproductores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicioProductoresApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicioProductoresApplication.class, args);
    }

}
