package com.sarc.controllers;

import com.sarc.models.Turma;
import com.sarc.repositories.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaRepository.findAll();
    }

    @PostMapping
    public Turma criarTurma(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }
}
