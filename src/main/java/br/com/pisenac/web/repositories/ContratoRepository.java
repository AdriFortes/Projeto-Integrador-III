package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, String> {
}
