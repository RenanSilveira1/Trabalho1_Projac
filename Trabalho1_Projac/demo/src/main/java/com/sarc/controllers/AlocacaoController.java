package com.sarc.controllers;

import com.sarc.models.Alocacao;
import com.sarc.repositories.AlocacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alocacoes")
public class AlocacaoController {

    @Autowired
    private AlocacaoRepository alocacaoRepository;

    @GetMapping
    public List<Alocacao> listarAlocacoes() {
        return alocacaoRepository.findAll();
    }

    @PostMapping
    public Alocacao criarAlocacao(@RequestBody Alocacao alocacao) {
        return alocacaoRepository.save(alocacao);
    }
}
