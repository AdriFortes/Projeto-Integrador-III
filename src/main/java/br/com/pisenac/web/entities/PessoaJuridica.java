package br.com.pisenac.web.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name = "PessoaJuridica")
public class PessoaJuridica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CNPJ;

    @Column(nullable = false)
    private String pessoaJusNome;

    @Column(nullable = false)
    private String Fornecedor;
    
    public long getCNPJ() {
        return CNPJ;
    }

    public String getPessoaJusNome() {
        return pessoaJusNome;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setPessoaJusNome(String PessoaJusNome) {
        this.pessoaJusNome = PessoaJusNome;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        Fornecedor = fornecedor;
    }
}

