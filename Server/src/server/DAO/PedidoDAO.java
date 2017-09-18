package server.DAO;

import java.util.ArrayList;
import server.model.Pedido;
import server.model.BancoDePedido;

public class PedidoDAO {
    private static ArrayList<BancoDePedido> banco = new ArrayList<>();
    
    
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
                break;
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
                break;
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
                break;
            }
        }
    }
    
    // cliente na view tem que ter um array de ID'S dos pedidos
    public ArrayList<Pedido> getPedidosCliente(ArrayList<String> ids){ // cliente vai pegar todos os pedidos dele
        ArrayList <Pedido> todosPedidos = null;
        for(String id : ids){
            for (Pedido p : pedidos){
                if(id.equals(p.getId())){
                    todosPedidos.add(p);
                }
            }
        }
        return todosPedidos;
    }
}