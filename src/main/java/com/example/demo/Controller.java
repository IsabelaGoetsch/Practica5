package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/contacto")
    public String getContacto(){
        return "Hola mundo";
    }

    @PostMapping("/contacto")
    public Contacto postContacto(@RequestBody Contacto contacto){
        return contacto;
    }

}

