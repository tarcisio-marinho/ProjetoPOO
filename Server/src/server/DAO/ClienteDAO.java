
package server.DAO;

import java.util.ArrayList;
import server.model.ContaCliente;

public class ClienteDAO {
    private static ArrayList<ContaCliente> clientes;
    
    public boolean existeLogin(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        for (ContaCliente c : clientes){
            if(c.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
    
    
    public ContaCliente buscaDadosCliente(String login){
        for (ContaCliente c : clientes){
            if(c.getLogin().equals(login)){
                return c;
            }
        }
        return null;
    }
    
    
    public void cadastrarCliente(ContaCliente cliente){
        clientes.add(cliente);
    }
}
