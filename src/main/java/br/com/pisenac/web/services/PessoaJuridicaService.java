package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Fornecedor;
import br.com.pisenac.web.entities.PessoaJuridica;
import br.com.pisenac.web.repositories.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaJuridicaService {
    @Autowired
    PessoaJuridicaRepository pessoaJuridicaRepository;

    public PessoaJuridica getPessoaJuridicaById(String id) {
        return pessoaJuridicaRepository.findById(id).orElse(null);
    }

    public List<PessoaJuridica> getAllPessoaJuridica() {
        return pessoaJuridicaRepository.findAll();
    }

    public boolean solicitarValidacao(int id) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        return id == pessoaJuridica.getCNPJ();
    }
}
