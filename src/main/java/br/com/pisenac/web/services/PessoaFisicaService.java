package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.PessoaFisica;
import br.com.pisenac.web.repositories.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaFisicaService {
    @Autowired
    PessoaFisicaRepository pessoaFisicaRepository;

    public PessoaFisica createPessoaFisica(PessoaFisica pessoaFisica) {
        return pessoaFisicaRepository.save(pessoaFisica);
    }
    public PessoaFisica getPessoaFisicaById(String id) {
        return pessoaFisicaRepository.findById(id).orElse(null);
    }
    public List<PessoaFisica> getAllUsers() {
        return pessoaFisicaRepository.findAll();
    }
    public PessoaFisica updatePessoaFisica(PessoaFisica pessoaFisica) {
        return pessoaFisicaRepository.save(pessoaFisica);
    }
    public void deletePessoaFisica(String id) {
        pessoaFisicaRepository.deleteById(id);
    }

}
