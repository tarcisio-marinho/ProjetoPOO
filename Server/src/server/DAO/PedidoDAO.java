package server.DAO;

import java.util.ArrayList;
import server.model.Pedido;

public class PedidoDAO {
    private static ArrayList<Pedido> pedidos;
    
    public void novoPedido(Pedido p){ // cliente vai acessar o DAO e fazer pedido
        pedidos.add(p);
    }
    
    public void removerPedido(Pedido p){ // loja remove pedido pronto
        pedidos.remove(p);
    }
    
    public Pedido buscarPedido(String id){ // loja busca por um pedido especifico
        for (Pedido ped : pedidos){
            if(ped.getId().equals(id)){
                return ped;
            }
        }
        return null;
    }
    
    public ArrayList<Pedido> novosPedidos(){ // retorna para a loja os novos pedidos e altera o status para vizualizado
        ArrayList<Pedido> novos = null;
        for (Pedido ped : pedidos){
            if(ped.isStatusVisualizado() == false){
                ped.setStatusVisualizado();
                novos.add(ped);
            }
        }
        return novos;
    }
    
    public ArrayList<Pedido> getTodosPedidos(){ // loja pega todos os pedidos
        return PedidoDAO.pedidos;
    }
    
    public void setPedidoPronto(String id){ // loja vai dizer que ja terminou
        for(Pedido p : pedidos){
            if(p.getId().equals(id)){
                p.setStatusPronto();
            }
        }
    }
    
    public boolean isPedidoPronto(String id){ // cliente vai ficar perguntando se o pedido esta pronto
        for(Pedido p : pedidos){
            if(p.getId().equals(id) && p.isStatusPronto() == true){
                return true;
            }
        }
        return false;
    }
    
    public void setPedidoEntregue(String id){ // cliente que vai dizer que ja pegou
        for(Pedido p : pedidos){
            if(p.getId().equals(id)){
                p.setStatusEntregue();
                removerPedido(p);
            }
        }
    }
}