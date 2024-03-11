package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Disciplina;
import br.com.pisenac.web.entities.Livro;
import br.com.pisenac.web.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    DisciplinaRepository disciplinaRepository;

    public Disciplina createDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public Disciplina getLivroById(String id) {
        return disciplinaRepository.findById(id).orElse(null);
    }

    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }

    public Disciplina updateDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public void deleteDisciplina(String id) {
        disciplinaRepository.deleteById(id);
    }
}
