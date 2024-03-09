package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, String> {
}
