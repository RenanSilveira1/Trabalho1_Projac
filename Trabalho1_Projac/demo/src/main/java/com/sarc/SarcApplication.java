package com.sarc;

import com.sarc.models.Disciplina;
import com.sarc.models.Recurso;
import com.sarc.models.Turma;
import com.sarc.repositories.DisciplinaRepository;
import com.sarc.repositories.RecursoRepository;
import com.sarc.repositories.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SarcApplication implements CommandLineRunner {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private RecursoRepository recursoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SarcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        Turma turma = new Turma(null, "Turma 1", "Segunda, 14h");
        Recurso recurso = new Recurso(null, "Sala de Computação A");
        Disciplina disciplina = new Disciplina(null, "Disciplina de Exemplo");
        
        turmaRepository.save(turma);
        recursoRepository.save(recurso);
        disciplinaRepository.save(disciplina);
    }
}
