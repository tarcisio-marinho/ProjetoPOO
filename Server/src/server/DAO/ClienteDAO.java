
package server.DAO;

import java.util.ArrayList;
import server.model.ContaCliente;

public class ClienteDAO {
    private static ArrayList<ContaCliente> clientes = new ArrayList<>();
    
    public static boolean existeLogin(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        for (ContaCliente c : clientes){
            if(c.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
    
    
    public static ContaCliente buscaDadosCliente(String login){
        for (ContaCliente c : clientes){
            if(c.getLogin().equals(login)){
                return c;
            }
        }
        return null;
    }
    
    
    public static void cadastrarCliente(ContaCliente cliente){
        clientes.add(cliente);
    }
}
