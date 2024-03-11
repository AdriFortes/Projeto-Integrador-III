package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Aluno;
import br.com.pisenac.web.entities.Horario;
import br.com.pisenac.web.entities.Turma;
import br.com.pisenac.web.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TurmaService {
    @Autowired
    TurmaRepository turmaRepository;
    Turma turma;

    public Turma createTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    public Turma getTurmaById(String id) {
        return turmaRepository.findById(id).orElse(null);
    }

    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public boolean matricularAluno(Aluno aluno, Turma turma) {
        turma.getAlunosMatriculados().add(aluno);

        turmaRepository.save(turma);

        return true;
    }

    public String cadastrarHorario(Date horario, String turma) {
        Turma turmaCadastrada = new Turma(turma);

        Horario horarioCadastrado = new Horario();

        horarioCadastrado.setHorarioInicio(horario);

        turmaRepository.save(turmaCadastrada);

        return "Horário cadastrado com sucesso!";
    }
}
