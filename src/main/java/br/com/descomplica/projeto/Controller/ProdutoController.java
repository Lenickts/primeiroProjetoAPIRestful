package br.com.descomplica.projeto.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.descomplica.projeto.Entidade.Produto;
import br.com.descomplica.projeto.Servico.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    // Endpoint para obter todos os produtos
    @RequestMapping(method = RequestMethod.GET)
    public List<Produto> getAllProdutos() {
        return produtoService.getAll();
    }

    // Endpoint para obter um produto por ID
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Produto getProdutoById(@RequestParam Integer id) {
        return produtoService.getById(id);
    }

    // Endpoint para salvar um produto
    @RequestMapping(method = RequestMethod.POST)
    public Produto saveProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    // Endpoint para atualizar um produto
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Produto updateProduto(@RequestParam Integer id, @RequestBody Produto produto) {
        return produtoService.updateProduto(id, produto);
    }

    // Endpoint para excluir um produto
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean deleteProduto(@RequestParam Integer id) {
        return produtoService.deleteProduto(id);
    }
}
