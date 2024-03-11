package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Aluno;
import br.com.pisenac.web.entities.Emprestimo;
import br.com.pisenac.web.entities.Livro;
import br.com.pisenac.web.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmprestimoService {
    @Autowired
    EmprestimoRepository emprestimoRepository;
    Emprestimo emprestimo;

    public String realizarEmprestimo(Aluno aluno, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        new Emprestimo(aluno, livro, dataEmprestimo, dataDevolucao);

        return "Emprestimo realizado";
    }

    public String devolverLivro(String idEmprestimo) {
        emprestimoRepository.deleteById(idEmprestimo);
        return "Livro devolvido";
    }

}
