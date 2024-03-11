package br.com.pisenac.web.controllers;

import br.com.pisenac.web.entities.PessoaFisica;
import br.com.pisenac.web.services.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/PessoaFisica")
public class PessoaFisicaController { // Isso é um Rest Controller, ele é responsável de expor a API para o frontend usando métodos HTTP
    @Autowired
    PessoaFisicaService pessoaFisicaService; // Chama a lógica do negócio

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PessoaFisica> createRole(@RequestBody PessoaFisica pessoaFisica) {
        PessoaFisica newPessoaFisica = pessoaFisicaService.createPessoaFisica(pessoaFisica);
        return new ResponseEntity<PessoaFisica>(newPessoaFisica, HttpStatus.CREATED);
    }

    @GetMapping(path="/{pessoaFisicaId}", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PessoaFisica> getRoleById(@PathVariable String pessoafisicaId) {
        PessoaFisica pessoaFisicaFound = pessoaFisicaService.getPessoaFisicaById(pessoafisicaId);
        return new ResponseEntity<PessoaFisica>(pessoaFisicaFound, HttpStatus.OK);
    }

    @GetMapping(produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PessoaFisica>> getAllRoles() {
        List<PessoaFisica> pessoaFisicaList = pessoaFisicaService.getAllUsers();
        return new ResponseEntity<List<PessoaFisica>>(pessoaFisicaList, HttpStatus.ACCEPTED);
    }

    @PutMapping(consumes =MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PessoaFisica> updateRole(@RequestBody PessoaFisica pessoaFisica) {
        PessoaFisica pessoaFisicaUpdated = pessoaFisicaService.updatePessoaFisica(pessoaFisica);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Object> deleteRole(@PathVariable String id) {
        pessoaFisicaService.deletePessoaFisica(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
