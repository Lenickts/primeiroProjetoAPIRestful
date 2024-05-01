package br.com.descomplica.projeto.Entidade;

import java.time.LocalTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id")
    private Integer pedidoId;

    @Column(name = "pedido_data")
    private LocalTime pedidoData;

    @ManyToMany
    @JoinTable(name = "item_pedido", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private Set<Produto> produtos;

    public Integer getPedidoId(){
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public LocalTime getPedidoData(){
        return pedidoData;
    }

    public void setPedidoData(LocalTime pedidoData){
        this.pedidoData = pedidoData;
    }

    public Set<Produto> getProdutos(){
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos){
        this.produtos = produtos;
    }    
}
