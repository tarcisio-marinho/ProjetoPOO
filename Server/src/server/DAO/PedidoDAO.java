package server.DAO;
import java.util.ArrayList;
import server.model.Pedido;

public class PedidoDAO {
    private ArrayList<Pedido> pedidos;
    
    public PedidoDAO(){
        this.pedidos = new ArrayList<>();
    }
    
    public void enviarPedido(Pedido p){
        this.pedidos.add(p);
    }
    
    public void removerPedido(Pedido p){
        this.pedidos.remove(p);
    }
    
    public Pedido buscarPedido(int id){
        for (Pedido ped : pedidos){
           /* if(id == ped.getId){ // implementar classe pedidos
                return ped;
            }*/
        }
        return null;
    }
    
    public Pedido existeNovoPedido(){
        for (Pedido ped : this.pedidos){
            /*if(ped.getAceito == false){
                return ped;
            }*/
        }
        return null;
    }

}
