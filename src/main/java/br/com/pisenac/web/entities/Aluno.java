package br.com.pisenac.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Aluno")
public class Aluno {

    @Id
    private Boolean statusValidacao;

    private List<Mensalidade> mensalidades;
}
