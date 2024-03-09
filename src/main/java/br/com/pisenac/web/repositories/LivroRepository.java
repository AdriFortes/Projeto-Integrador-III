package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, String> {
}
