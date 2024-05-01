package br.com.descomplica.projeto.Entidade;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;


@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    private Integer produtoId;
    
    @Column(name = "produto_nome")
    private String produtoNome;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    @JsonBackReference
    private Categoria categoria;
    
    @ManyToMany
    @JoinTable(name = "item_pedido", joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "pedido_id"))
    Set<Pedido> pedidos;

    public Integer getProdutoId(){
        return produtoId;
    }

    public void setProdutoId(Integer produtoId){
        this.produtoId = produtoId;
    }

    public String getProdutoNome(){
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome){
        this.produtoNome = produtoNome;
    }
    

}
