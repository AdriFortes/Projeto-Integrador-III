package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Mensalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensalidadeRepository extends JpaRepository<Mensalidade, String> {
}
