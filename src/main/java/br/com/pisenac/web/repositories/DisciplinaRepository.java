package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, String> {
}
