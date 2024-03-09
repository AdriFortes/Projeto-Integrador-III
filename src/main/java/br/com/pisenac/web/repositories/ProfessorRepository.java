package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, String> {
}
