
package server.controllers;

import java.util.ArrayList;
import server.DAO.PedidoDAO;
import server.model.BancoDePedido;
import server.model.Pedido;

public class ControllerPedido {
        
    private static ArrayList<BancoDePedido> bancos = new ArrayList<>();
    
    public void remove(String id){
        for( Pedido pedido : PedidoDAO.getTodosPedidos(id) ){
            
            if( pedido.getId().equals(id) ){
                PedidoDAO.remove(pedido);
            }
            
        }
    }
    
    public void add(Pedido pedido){
        for(BancoDePedido banco : bancos){
            if( banco.getId().equals(pedido.getReferenciaLoja()) ) {
                
            }
        }
    }
        
}
