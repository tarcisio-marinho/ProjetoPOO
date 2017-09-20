
package server.DAO;

import java.util.ArrayList;
import server.model.ContaCliente;

public class ClienteDAO {
    private static ArrayList<ContaCliente> clientes = new ArrayList<>();
    
    public ContaCliente buscar(String login){
        for (ContaCliente c : clientes){
            if(c.getLogin().equals(login)){
                return c;
            }
        }
        return null;
    }
    
    public void inserir(ContaCliente c){
        clientes.add(c);
    }
    
    public void remover(String login){
        for (ContaCliente c: clientes){
            if(c.getLogin().equals(login)){
                clientes.remove(c);
            }
        }
    }
    
    public ArrayList<ContaCliente> getTodos(){
        return ClienteDAO.clientes;
    }
}
