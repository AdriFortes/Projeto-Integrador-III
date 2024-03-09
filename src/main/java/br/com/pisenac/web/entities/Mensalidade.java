package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Mensalidade")
public class Mensalidade {
    @Id
    private Aluno aluno;
    private double valor;
    private boolean statusPagamento;
    private Date dataVencimento;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
