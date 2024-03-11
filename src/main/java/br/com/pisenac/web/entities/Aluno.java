package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Aluno")
public class Aluno extends PessoaFisica {

    @Id
    private Boolean statusValidacao;
    private List<Mensalidade> mensalidades;
    private List<Disciplina> disciplinasMatriculadas;
    private List<Livro> acervoBiblioteca;
    private List<Emprestimo> emprestimos;
    private List<ResultadoNota> resultadoNota;

    public Boolean getStatusValidacao() {
        return statusValidacao;
    }

    public void setStatusValidacao(Boolean statusValidacao) {
        this.statusValidacao = statusValidacao;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    public void setMensalidades(List<Mensalidade> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(List<Disciplina> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public List<Livro> getAcervoBiblioteca() {
        return acervoBiblioteca;
    }

    public void setAcervoBiblioteca(List<Livro> acervoBiblioteca) {
        this.acervoBiblioteca = acervoBiblioteca;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<ResultadoNota> getResultadoNota() {
        return resultadoNota;
    }

    public void setResultadoNota(List<ResultadoNota> resultadoNota) {
        this.resultadoNota = resultadoNota;
    }
}
