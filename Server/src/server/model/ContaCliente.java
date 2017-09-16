package server.model;

import java.util.ArrayList;
import java.util.List;

public class ContaCliente extends Conta{
    Cliente cliente;
    List<Pedido> pedidos;
    
    public ContaCliente (String nome, String telefone){
        this.cliente = new Cliente(nome, telefone);
        this.pedidos = new ArrayList<>();    
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public boolean removePedido(String idPedido){
        boolean objeto = false;
        for(Pedido pedido : pedidos){
            if( pedido.getId().equals(idPedido)){
                objeto = pedidos.remove(pedido);
            }
        }
        return objeto;
    }
    
    
}
