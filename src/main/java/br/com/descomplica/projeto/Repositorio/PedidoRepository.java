package br.com.descomplica.projeto.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.descomplica.projeto.Entidade.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
