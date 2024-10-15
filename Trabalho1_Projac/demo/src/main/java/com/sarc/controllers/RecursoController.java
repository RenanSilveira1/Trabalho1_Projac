package com.sarc.controllers;

import com.sarc.models.Recurso;
import com.sarc.repositories.RecursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recursos")
public class RecursoController {

    @Autowired
    private RecursoRepository recursoRepository;

    @GetMapping
    public List<Recurso> listarRecursos() {
        return recursoRepository.findAll();
    }

    @PostMapping
    public Recurso criarRecurso(@RequestBody Recurso recurso) {
        return recursoRepository.save(recurso);
    }
}
