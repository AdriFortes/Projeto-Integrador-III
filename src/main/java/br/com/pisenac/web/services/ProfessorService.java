package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Disciplina;
import br.com.pisenac.web.entities.Horario;
import br.com.pisenac.web.entities.Professor;
import br.com.pisenac.web.entities.Turma;
import br.com.pisenac.web.repositories.ProfessorRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    // Creates Professor
    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    // Finds Professor by id or null if it doesn't exist
    public Professor getProfessorById(String id) {
        return professorRepository.findById(id).orElse(null);
    }

    // Method to find all professors that returns it in a list
    public List<Professor> getAllProfessores() {
        return professorRepository.findAll();
    }

    // Method to update a Professor
    public Professor updateProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public void deleteProfessor(String id) {
        professorRepository.deleteById(id);
    }

    public Professor cadastrarDisciplina(String nomeDisciplina, String professorId) {

        // Find the professor by ID (assuming professorId is a valid ID)
        Professor professor = professorRepository.findById(professorId).orElse(null);

        // Find the disciplina by name (assuming a method exists or implement it)
        Disciplina disciplina = new Disciplina(nomeDisciplina);

        if (disciplina == null) {
            // Handle case where disciplina is not found (e.g., throw an exception)
            return null;
        }

        // Add the disciplina to the professor's list of disciplinasMinistradas
        List<Disciplina> disciplinasMinistradas = professor.getDisciplinasMinistradas();
        if (disciplinasMinistradas == null) {
            disciplinasMinistradas = new ArrayList<>();
        }
        disciplinasMinistradas.add(disciplina);
        professor.setDisciplinasMinistradas(disciplinasMinistradas);

        // Save the updated professor object
        return professorRepository.save(professor);
    }

    public Professor cadastrarTurma(String codigoTurma, String professorId) {
        // Find the professor by ID (assuming professorId is a valid ID)
        Professor professor = professorRepository.findById(professorId).orElse(null);

        List<Turma> turmas = professor.getTurmas();
        if (turmas == null) {
            turmas = new ArrayList<>();
        }

        // Create a new Turma object with codigoTurma
        Turma turma = new Turma(codigoTurma);
        turmas.add(turma);
        professor.setTurmas(turmas);

        // Save the updated professor object
        return professorRepository.save(professor);
    }

    public String cadastrarHorario(String professorId, String diaSemana, String horaInicio, String horaFim) {
        System.out.println("Professor " + professorId + " schedule registered for " + diaSemana +
                " from " + horaInicio + " to " + horaFim);

        return "Horário cadastrado com sucesso!";
    }

    public List<String> consultarAcervoBiblioteca(String termoBusca) {

        System.out.println("Simulating library search for: " + termoBusca);
        List<String> livrosEncontrados = new ArrayList<>();
        livrosEncontrados.add("Java for Dummies");
        livrosEncontrados.add("Spring in Action");

        return livrosEncontrados;
    }
}
