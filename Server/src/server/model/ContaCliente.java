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
    
}
