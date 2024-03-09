package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Horario")
public class Horario {
    @Id
    private Turma turma;
    private String diaSemana;
    private Date horarioInicio;
    private Date horarioFim;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }
}
