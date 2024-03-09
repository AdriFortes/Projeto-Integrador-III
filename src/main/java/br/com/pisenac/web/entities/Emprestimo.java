package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Emprestimo")
public class Emprestimo {

    @Id
    private Aluno aluno;
    private Livro livro;
    private Date dataDevolucao;
    private Date dataEmprestimo;
}
