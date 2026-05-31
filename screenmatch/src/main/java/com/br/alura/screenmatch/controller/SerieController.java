package com.br.alura.screenmatch.controller;

import com.br.alura.screenmatch.DTOs.SerieDTO;
import com.br.alura.screenmatch.model.Serie;
import com.br.alura.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieRepository repositorio;

    @GetMapping()
    public List<SerieDTO> listarSeries() {
        return repositorio.findAll()
                .stream()
                .map(s -> new
                        SerieDTO(
                                s.getId(),
                                s.getTitulo(),
                                s.getTotalTemporadas(),
                                s.getAvaliacao(),
                                s.getGenero(),
                                s.getAtores(),
                                s.getPoster(),
                                s.getSinopse()))
                .collect(Collectors.toList());
    }

    @GetMapping("/inicio")
    public String retornarInicio() {
        return "Bem-vindo ao Screenmatch!";
    }
}
