
package server.DAO;

import java.util.ArrayList;
import java.util.List;

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
    
    
    public void remover(ContaCliente cliente){      
       
    	clientes.remove(cliente);       
    }
        
    
    public List<ContaCliente> getTodos(){
    	
        return ClienteDAO.clientes;
    }
}
