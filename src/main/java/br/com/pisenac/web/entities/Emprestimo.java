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

    public Emprestimo(Aluno nome, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        this.aluno = nome;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getlivro() {
        return livro;
    }
    
    public void setlivro(Livro livro) {
        this.livro = livro;
    }

    public Date getdataDevolucao() {
        return dataDevolucao;
    }
    
    public void setdatadevolucao(Date datadevolucao) {
        this.dataDevolucao = datadevolucao;
    }

    public Date getdataEmprestimo() {
        return dataEmprestimo;
    }
    
    public void setdataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
}
