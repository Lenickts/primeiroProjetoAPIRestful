package br.com.descomplica.projeto.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.descomplica.projeto.Entidade.Pedido;
import br.com.descomplica.projeto.Servico.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    // Endpoint para obter todos os pedidos
    @RequestMapping(method = RequestMethod.GET)
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAll();
    }

    // Endpoint para obter um pedido por ID
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Pedido getPedidoById(@RequestParam Integer id) {
        return pedidoService.getById(id);
    }

    // Endpoint para salvar um pedido
    @RequestMapping(method = RequestMethod.POST)
    public Pedido savePedido(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }

    // Endpoint para atualizar um pedido
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Pedido updatePedido(@RequestParam Integer id, @RequestBody Pedido pedido) {
        return pedidoService.updatePedido(id, pedido);
    }

    // Endpoint para excluir um pedido
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean deletePedido(@RequestParam Integer id) {
        return pedidoService.deletePedido(id);
    }
}
