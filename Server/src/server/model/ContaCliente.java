package server.model;

import java.util.ArrayList;
import java.util.List;

public class ContaCliente extends Conta{
    Cliente cliente;
    List<Pedido> pedidos;
    
    public ContaCliente (String nome, String telefone,String login, String senha){
        this.cliente = new Cliente(nome, telefone);
        this.pedidos = new ArrayList<>(); 
        super.setLogin(login);
        super.setSenha(senha);  
        
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public boolean removePedidosEntregues(String idPedido){
        boolean objeto = false;
        for(Pedido pedido : pedidos){
            if( pedido.isStatusEntregue()){
                objeto = pedidos.remove(pedido);
            }
        }
        return objeto;
    }
    
}
