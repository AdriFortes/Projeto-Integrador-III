package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, String> {
}
