package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Emprestimo;
import br.com.pisenac.web.entities.Livro;
import br.com.pisenac.web.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    LivroRepository livroRepository;

    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro getLivroById(String id) {
        return livroRepository.findById(id).orElse(null);
    }

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    public Livro updateAluno(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deleteLivro(String id) {
        livroRepository.deleteById(id);
    }

    public Emprestimo consultarEmprestimo(String id) {
        EmprestimoService emprestimoService = new EmprestimoService();

        return emprestimoService.getEmprestimoById(id);
    }
}
