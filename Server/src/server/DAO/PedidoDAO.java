package server.DAO;

import java.util.ArrayList;
import server.model.Pedido;

public class PedidoDAO {
    private static ArrayList<Pedido> pedidos;
    
    public void novoPedido(Pedido p){
        pedidos.add(p);
    }
    
    public void removerPedido(Pedido p){
        pedidos.remove(p);
    }
    
    public Pedido buscarPedido(String id){
        for (Pedido ped : pedidos){
            if(ped.getId().equals(id)){ // implementar classe pedidos
                return ped;
            }
        }
        return null;
    }
    
    public Pedido existeNovoPedido(){
        for (Pedido ped : pedidos){
            /*if(ped.getAceito == false){
                return ped;
            }*/
        }
        return null;
    }

}
