package br.com.descomplica.projeto.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.descomplica.projeto.Entidade.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}