package server.DAO;
import server.model.Cliente;
import server.model.ContaCliente;

public class ClienteDAO {
    
    public boolean buscaLogin(String login, String senha){ // BUSCA SE A CONTA EXISTE
        return false;
    }
    
    public boolean existeLogin(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        return false;
    }
    
    public void add(ContaCliente cliente){ //nao precisa verificar a existencia do login aqui
        //return true;
        
    }
    
    public Cliente buscaCliente(String login){
        return null; // vai procurar no banco o cliente com aquele login e retornar o cliente
    }
    
    public void remove(int id){ //criei apenas pra acabar com o erros , mas acho q nao precisa
        
    }
}
