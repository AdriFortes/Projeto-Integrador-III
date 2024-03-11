package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Fornecedor")

public class Fornecedor extends PessoaFisica{

    @Id
    private Boolean statusValidacao;
    private TipoFornecedor tipoFornecedor;
    private List<Contrato> contratos;

    public TipoFornecedor getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(TipoFornecedor tipofornecedor) {
        this.tipoFornecedor = tipofornecedor;
    }

    public List<Contrato> getcontratos() {
        return contratos;
    }

    public void setcontratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
}
