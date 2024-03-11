package br.com.pisenac.web.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TipoFornecedor")
public class TipoFornecedor extends Fornecedor{

    @Id
    private String nomeFornecedor;

    public String getnomeFornecedor() {
        return nomeFornecedor;
    }

    public void setnomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }


}
