
package server.DAO;

import java.util.ArrayList;
import server.model.ContaCliente;

public class ClienteDAO {
    private static ArrayList<ContaCliente> clientes = new ArrayList<>();
    
    public static ContaCliente buscar(String login){
        for (ContaCliente c : clientes){
            if(c.getLogin().equals(login)){
                return c;
            }
        }
        return null;
    }
    
    public static void inserir(ContaCliente c){
        clientes.add(c);
    }
    
    public static void remover(String login){
        for (ContaCliente c: clientes){
            if(c.getLogin().equals(login)){
                clientes.remove(c);
            }
        }
    }
    
    public static ArrayList<ContaCliente> getTodos(){
        return ClienteDAO.clientes;
    }
}
