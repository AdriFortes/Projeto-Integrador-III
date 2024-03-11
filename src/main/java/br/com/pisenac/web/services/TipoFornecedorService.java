package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Livro;
import br.com.pisenac.web.entities.TipoFornecedor;
import br.com.pisenac.web.repositories.TipoFornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoFornecedorService {
    @Autowired
    TipoFornecedorRepository tipoFornecedorRepository;

    public TipoFornecedor getTipoFornecedorById(String id) {
        return tipoFornecedorRepository.findById(id).orElse(null);
    }

    public List<TipoFornecedor> getAllTipoFornecedor() {
        return tipoFornecedorRepository.findAll();
    }
}
