/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;
import server.model.Cliente;
/**
 *
 * @author tarcisio
 */
public class ClienteDAO {
    
    public boolean buscaLogin(String login, String senha){ // BUSCA SE A CONTA EXISTE
        return false;
    }
    
    public boolean existeCliente(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        return false;
    }
    
    public boolean cadastrarCliente(Cliente c){
        buscaLogin(c.getLogin(), c.getSenha());
        return false;
    }
    
    public Cliente buscaCliente(String login){
        return null; // vai procurar no banco o cliente com aquele login e retornar o cliente
    }
}
