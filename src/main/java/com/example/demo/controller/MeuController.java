package com.example.demo.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {

    @GetMapping("/hello")
    public String helloWold() {
        return "Hello world!";
    }

    @PostMapping
    public String meumetodo(){
        return "";
    }

}
