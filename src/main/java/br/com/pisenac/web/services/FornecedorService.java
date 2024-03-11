package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Contrato;
import br.com.pisenac.web.entities.Fornecedor;
import br.com.pisenac.web.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    FornecedorRepository fornecedorRepository;

    public Fornecedor getFornecedorById(String id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<Fornecedor> getAllFornecedores() {
        return fornecedorRepository.findAll();
    }

    public boolean solicitarValidacao(int id) {
        Fornecedor fornecedor = new Fornecedor();
        return id == fornecedor.getStatusValidacao();
    }

    public String cadastrarContrato(String descricao, Double valor, Fornecedor fornecedor) {
        Contrato contrato = new Contrato(descricao, valor, fornecedor);
        fornecedorRepository.save(contrato);
        return "Contrato cadastrado";
    }

    public Optional<Fornecedor> consultarTipoFornecedor(String nome) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(nome);
        return fornecedor;
    }
}
