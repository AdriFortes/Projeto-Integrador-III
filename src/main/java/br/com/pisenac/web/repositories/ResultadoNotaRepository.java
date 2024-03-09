package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.ResultadoNota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoNotaRepository extends JpaRepository<ResultadoNota, String> {
}
