package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.*;
import br.com.pisenac.web.repositories.AlunoRepository;
import br.com.pisenac.web.repositories.ResultadoNotaRepository;
import jakarta.persistence.Embeddable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno getAlunoById(String id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno updateAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteAluno(String id) {
        alunoRepository.deleteById(id);
    }

    public List<String> consultarAcervoBiblioteca(String termoBusca) {

        System.out.println("Simulating library search for: " + termoBusca);
        List<String> livrosEncontrados = new ArrayList<>();
        livrosEncontrados.add("Java for Dummies");
        livrosEncontrados.add("Spring in Action");

        return livrosEncontrados;
    }
    public String pagarMensalidade(String id) {
        alunoRepository.deleteById(id);
        return "Mensalidade paga";
    }

    public List<String> matricularDisciplina(String codigoTurma, String nomeDisciplina) {
        Aluno aluno = new Aluno();
        Disciplina disciplina = new Disciplina(nomeDisciplina);

        // Find the Turma by codigoTurma (assuming a method exists or implement it)
        Turma turma = new Turma(codigoTurma); // Replace with logic to find Turma

        // Check if Aluno is already enrolled in the Turma
        List<Disciplina> alunoTurmas = aluno.getDisciplinasMatriculadas();
        if (alunoTurmas != null && alunoTurmas.contains(turma)) {
            List<String> errorList = new ArrayList<>();
            errorList.add("Aluno já matriculado nesta turma!");
            return errorList;
        }

        // Add the Turma to the Aluno's list of matriculations
        if (alunoTurmas == null) {
            alunoTurmas = new ArrayList<>();
        }
        alunoTurmas.add(turma.getDisciplina());
        aluno.setDisciplinasMatriculadas(alunoTurmas);

        // Save the updated Aluno object
        alunoRepository.save(aluno);

        // List of successfully enrolled Disciplinas (assuming Turma has Disciplinas)
        List<String> disciplinasMatriculadas = new ArrayList<>();
        disciplinasMatriculadas.add(disciplina.getNome());

        return disciplinasMatriculadas;
    }
    public List<Emprestimo> realizarEmprestimo(Aluno nome, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(nome, livro, dataEmprestimo, dataDevolucao);

        List<Emprestimo> emprestimoRealizado = new ArrayList<>();
        emprestimoRealizado.add(emprestimo);

        return emprestimoRealizado;
    }

    /**
    public  List<ResultadoNota> consultarNotas(String idDisciplina) {
        // TODO
    }
     **/
}
