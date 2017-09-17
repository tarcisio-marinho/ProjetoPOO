package server.DAO;
import server.model.Cliente;

public class ClienteDAO {
    
    public boolean buscaLogin(String login, String senha){ // BUSCA SE A CONTA EXISTE
        return false;
    }
    
    public boolean existeCliente(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        return false;
    }
    
    public boolean add(ContaCliente cliente){
        if( !existeCliente(cliente) ) {
        	
        }
        
    }
    
    public Cliente buscaCliente(String login){
        return null; // vai procurar no banco o cliente com aquele login e retornar o cliente
    }
}
