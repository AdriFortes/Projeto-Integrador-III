package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, String> {
}
