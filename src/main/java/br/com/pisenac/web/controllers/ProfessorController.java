package br.com.pisenac.web.controllers;

import br.com.pisenac.web.entities.Professor;
import br.com.pisenac.web.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Professor> createRole(@RequestBody Professor professor) {
        Professor newProfessor = professorService.createProfessor(professor);
        return new ResponseEntity<Professor>(newProfessor, HttpStatus.CREATED);
    }

    @GetMapping(path="/{professorId}", produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Professor> getRoleById(@PathVariable String professorId) {
        Professor professorFound = professorService.getProfessorById(professorId);
        return new ResponseEntity<Professor>(professorFound, HttpStatus.OK);
    }

    @GetMapping(produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Professor>> getAllRoles() {
        List<Professor> professorList = professorService.getAllProfessores();
        return new ResponseEntity<List<Professor>>(professorList, HttpStatus.ACCEPTED);
    }

    @PutMapping(consumes =MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Professor> updateRole(@RequestBody Professor professor) {
        Professor professorUpdated = professorService.updateProfessor(professor);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Object> deleteRole(@PathVariable String id) {
        professorService.deleteProfessor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping(path="/{cadastroDisciplina}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Professor> cadastrarDisciplina(@RequestBody String nomeDisciplina, String professorId) {
        Professor professorFound = professorService.getProfessorById(professorId);
        if (professorFound != null) {
            Professor cadastrado = professorService.cadastrarDisciplina(nomeDisciplina, professorId);
            return new ResponseEntity<Professor>(cadastrado, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Professor>(professorFound, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping(path="/{cadastrarTurma}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Professor> cadastrarTurma(@RequestBody String codigoTurma, String professorId) {
        Professor professorFound = professorService.getProfessorById(professorId);
        if (professorFound != null) {
            Professor cadastrado = professorService.cadastrarTurma(codigoTurma, professorId);
            return new ResponseEntity<Professor>(cadastrado, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Professor>(professorFound, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping(path="/{cadastrarHorario}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> cadastrarHorario(@RequestBody String professorId, String diaSemana, String horaInicio, String horaFim) {
        Professor professorFound = professorService.getProfessorById(professorId);
        if (professorFound != null) {
            String cadastrado = professorService.cadastrarHorario(professorId, diaSemana, horaInicio, horaFim);
            return new ResponseEntity<String>(cadastrado, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<String>("Não encontrado", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping(path="/{consultarAcervoBiblioteca}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> consultarAcervoBiblioteca(@RequestBody String termoBusca) {
            List<String> busca = professorService.consultarAcervoBiblioteca(termoBusca);
            return new ResponseEntity<List<String>>(busca, HttpStatus.CREATED);
    }
}
