package br.com.pisenac.web.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Contrato")

public class Contrato extends Fornecedor {

    @Id
    private String Descricao;
    private Double Valor;
    private Fornecedor Fornecedor;

    public Contrato(String descricao, Double valor, br.com.pisenac.web.entities.Fornecedor fornecedor) {
        this.Descricao = descricao;
        this.Valor = valor;
        this.Fornecedor = fornecedor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor= valor;
    }

    public Fornecedor getfornecedor() {
        return Fornecedor;
    }

    public void setfornecedor(Fornecedor Fornecedor) {
        this.Fornecedor= Fornecedor;
    }
}
