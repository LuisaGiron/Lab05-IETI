package edu.ieti.laboratorio.Lab05.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class MyNameController {

    @GetMapping("/myname")
    public String getMyName() {
        return "Hola!! mi nombre es Luisa Fernanda Bermudez Giron";
    }
}
