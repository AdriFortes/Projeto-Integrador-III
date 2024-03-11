package br.com.pisenac.web.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Endereco")
public class Endereco extends PessoaFisica{
    @Id
    private String Uf;
    private String Estado;
    private String Municipio;
    private String Cidade;
    private String Logadouro;
    private String Bairro;
    private String Complemento;

    public String getUf() {
        return Uf;
    }
    
    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public String getEstado() {
        return Estado;
    }
    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMunicipio() {
        return Municipio;
    }
    
    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getCidade() {
        return Cidade;
    }
    
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getLogadouro() {
        return Logadouro;
    }
    
    public void setLogadouro(String Logadouro) {
        this.Logadouro = Logadouro;
    }

    public String getBairro() {
        return Bairro;
    }
    
    public void setBairro (String Bairro) {
        this.Bairro = Bairro;
    }
    public String getComplemento() {
        return Complemento;
    }
    
    public void setComplemento (String Complemento) {
        this.Complemento = Complemento;
    }
}


