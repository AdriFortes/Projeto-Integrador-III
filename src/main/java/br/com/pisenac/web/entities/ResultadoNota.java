package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ResultadoNota")
public class ResultadoNota {
    @Id
    private Disciplina disciplina;
    private Aluno aluno;
    private Double nota;

    public Disciplina getdisciplina() {
        return disciplina;
    }

    public void setdisiplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Double getnota() {
        return nota;
    }

    public void setnota(Double nota) {
        this.nota = nota;
    }



}
