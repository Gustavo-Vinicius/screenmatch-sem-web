package com.br.alura.screenmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {

    @GetMapping("/series")
    public String listarSeries() {
        return "Lista de séries";
    }
}
