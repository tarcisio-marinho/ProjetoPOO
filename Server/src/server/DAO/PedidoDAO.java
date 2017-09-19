package server.DAO;

import java.util.ArrayList;
import server.model.Pedido;

public class PedidoDAO {
    private static ArrayList<Pedido> banco = new ArrayList<>();
    
    public static Pedido buscar(String id){
        for (Pedido p : banco){
            if(id.equals(p.getId())){
                return p;
            }
        }
        return null;
    }
    
    public static void adiciona(Pedido pedido){
        banco.add(pedido);
    }
    
    public static void remove(String id){
        for (Pedido p : banco){
            if(id.equals(p.getId())){
                banco.remove(p);
            }
        }
    }
    
    public static ArrayList<Pedido> buscarTodosPedidos(String id){ // id da loja
        
        ArrayList<Pedido> todos = null; 
        for(Pedido p : banco){
            if(p.getId().substring(0,2).equals(id)){
                todos.add(p);
            }
        }
        return todos;
    }
}