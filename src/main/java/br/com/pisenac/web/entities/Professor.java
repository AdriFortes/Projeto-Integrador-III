package br.com.pisenac.web.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "Professor")
public class Professor extends PessoaFisica {

    @Id
    private Boolean statusValidacao;
    private Double salario;

    @ManyToMany
    @JoinTable(name = "professor_disciplina",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Disciplina> disciplinasMinistradas;

    @ManyToMany
    @JoinTable(name = "professor_turma",
                joinColumns = @JoinColumn(name = "professor_id"),
                inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Turma> turmas;
    @OneToMany(mappedBy = "professor")
    private List<Horario> horarios;

    @OneToMany(mappedBy = "responsavelBiblioteca")
    private List<Livro> acervoBiblioteca;


    public Boolean getStatusValidacao() {
        return statusValidacao;
    }

    public void setStatusValidacao(Boolean statusValidacao) {
        this.statusValidacao = statusValidacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(List<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public List<Livro> getAcervoBiblioteca() {
        return acervoBiblioteca;
    }

    public void setAcervoBiblioteca(List<Livro> acervoBiblioteca) {
        this.acervoBiblioteca = acervoBiblioteca;
    }
}
