package com.example.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PrimeiraRota") 
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String MinhaPrimeiraMensagem() {
        return "Funcionou!";
    }
}