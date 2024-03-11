package br.com.pisenac.web.entities;

import br.com.pisenac.web.enums.CargoEnum;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name = "PessoaFisica")
public class PessoaFisica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CPF;

    @Column(nullable = false)
    private String pessoaFisNome;

    @ElementCollection(targetClass = CargoEnum.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "pessoa_cargo", joinColumns = @JoinColumn(name = "pessoa_id"))
    @Enumerated(EnumType.STRING)
    private String Cargo;

    
    public long getCPF() {
        return CPF;
    }

    public String getPessoaFisNome() {
        return pessoaFisNome;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public void setPessoaFisNome(String pessoaFisNome) {
        this.pessoaFisNome = pessoaFisNome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}
