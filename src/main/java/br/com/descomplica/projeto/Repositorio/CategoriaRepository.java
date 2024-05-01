package br.com.descomplica.projeto.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.descomplica.projeto.Entidade.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
