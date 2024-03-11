package br.com.pisenac.web.repositories;

import br.com.pisenac.web.entities.TipoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoFornecedorRepository extends JpaRepository<TipoFornecedor, String> {
}
