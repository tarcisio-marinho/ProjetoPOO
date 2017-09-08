/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;
import java.util.ArrayList;
import server.model.Pedido;

/**
 *
 * @author tarcisio
 */
public class PedidoDAO {
    private ArrayList<Pedido> pedidos;
    
    public void PedidoDAO(){
        this.pedidos = null;
    }
    
    public void enviarPedido(Pedido p){
        this.pedidos.add(p);
    }
    
    public void removerPedido(Pedido p){
        this.pedidos.remove(p);
    }
    
    public Pedido buscarPedido(int id){
        for (Pedido ped : pedidos){
            if(id == ped.getId){ // implementar classe pedidos
                return ped;
            }
        }
        return null;
    }
    
    public Pedido existeNovoPedido(){
        for (Pedido ped : this.pedidos){
            if(ped.getAceito == false){
                return ped;
            }
        }
        return null;
    }
}
