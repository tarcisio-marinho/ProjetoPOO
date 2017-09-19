package server.DAO;

import java.util.ArrayList;
import server.model.Pedido;
import server.model.BancoDePedido;

public class PedidoDAO {
    private static ArrayList<BancoDePedido> banco = new ArrayList<>();
    
    
    public static void novoPedido(Pedido p){ // cliente vai acessar o DAO e fazer pedido
        for (BancoDePedido b : banco){
            if(p.getId().substring(0,2).equals(b.getId())){
                b.addPedido(p);
                break;
            }
        }
    }

    public static Pedido buscarPedido(String id){ // loja busca por um pedido especifico
        for (BancoDePedido b : banco){
            if(b.getId().substring(0,2).equals(b.getId())){
                return b.buscarPedido(id);
            }
        }
        return null;
    }
    
    public static ArrayList<Pedido> buscaNovosPedidos(String id){ // retorna para a loja os novos pedidos e altera o status para vizualizado
        for (BancoDePedido b : banco){
            if(id.equals(b.getId())){
                return b.buscaNovosPedidos();
            }
        }
        return null;
    }
    
    public static ArrayList<Pedido> getTodosPedidos(String id){ // loja pega todos os pedidos
        for (BancoDePedido b : banco){
            if(id.equals(b.getId())){
                return b.getTodosPedidos();
            }
        }
        return null;
    }
    
    public static void setPedidoPronto(String id){ // loja vai dizer que ja terminou
        for (BancoDePedido b : banco){
            if(id.substring(0,2).equals(b.getId())){
                b.setPedidoPronto(id);
                break;
            }
        }
    }
    
    public static boolean isPedidoPronto(String id){ // cliente vai ficar perguntando se o pedido esta pronto
        for (BancoDePedido b : banco){
            if(id.equals(b.getId())){
                return b.isPedidoPronto(id);
            }
        }
        return false;
    }
    
    public static void setPedidoEntregue(String id){ // cliente que vai dizer que ja pegou
        for (BancoDePedido b : banco){
            if(id.equals(b.getId())){
                b.setPedidoEntregue(id);
                banco.remove(b);
            }
        }
    }
}