package br.com.pisenac.web.services;

import br.com.pisenac.web.repositories.TipoFornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoFornecedorService {
    @Autowired
    TipoFornecedorRepository tipoFornecedorRepository;

    public void deleteTipoFornecedor(String id) {
        tipoFornecedorRepository.deleteById(id);
    }
}
