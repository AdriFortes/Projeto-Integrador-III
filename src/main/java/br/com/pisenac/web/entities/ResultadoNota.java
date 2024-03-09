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
}
