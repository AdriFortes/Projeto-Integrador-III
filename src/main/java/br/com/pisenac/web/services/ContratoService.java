package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Contrato;
import br.com.pisenac.web.entities.Livro;
import br.com.pisenac.web.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoService {
    @Autowired
    ContratoRepository contratoRepository;

    public Contrato getContratoById(String id) {
        return contratoRepository.findById(id).orElse(null);
    }

    public List<Contrato> getAllContratos() {
        return contratoRepository.findAll();
    }
}
