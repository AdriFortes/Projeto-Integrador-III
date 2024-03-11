package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Aluno;
import br.com.pisenac.web.entities.Disciplina;
import br.com.pisenac.web.entities.ResultadoNota;
import br.com.pisenac.web.repositories.ResultadoNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoNotaService {
    @Autowired
    ResultadoNotaRepository resultadoNotaRepository;

    public String registrarNota(Disciplina disciplina, Aluno aluno, double nota) {
        ResultadoNota resultadoNota = new ResultadoNota(disciplina, aluno, nota);
        return "Nota registrada";
    }
}
