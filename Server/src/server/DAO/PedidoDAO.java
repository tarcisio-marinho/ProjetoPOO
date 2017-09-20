package server.DAO;

import java.util.ArrayList;
import server.model.Pedido;

public class PedidoDAO {
    private static ArrayList<Pedido> banco = new ArrayList<>();
    
    public Pedido buscar(String id){
        for (Pedido p : banco){
            if(id.equals(p.getId())){
                return p;
            }
        }
        return null;
    }
    
    public void adiciona(Pedido pedido){
        banco.add(pedido);
    }
    
    public void remove(String id){
        for (Pedido p : banco){
            if(id.equals(p.getId())){
                banco.remove(p);
            }
        }
    }
    
    public ArrayList<Pedido> buscarTodosPedidos(String id){ // id da loja
        
        ArrayList<Pedido> todos = new ArrayList<>(); 
        for(Pedido p : banco){
            if(p.getId().substring(0,2).equals(id)){
                todos.add(p);
            }
        }
        return todos;
    }
}