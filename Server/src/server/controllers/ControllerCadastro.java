
package server.controllers;

import server.DAO.ClienteDAO;
import server.DAO.LojaDAO;
import server.model.ContaCliente;
import server.model.ContaLoja;


public class ControllerCadastro {

    public void cadastrar(ContaCliente contaCliente){
        ClienteDAO.cadastrarCliente(contaCliente);
    }
    
    public boolean existeLoginCliente(String login){
        return ClienteDAO.existeLogin(login);
    }
            
    public void cadastrar(ContaLoja contaLoja){
        LojaDAO.cadastrarLoja(contaLoja);
    }
    
    public boolean existeLoginLoja(String login){
        return LojaDAO.existeLogin(login);
    }
    
    public boolean existeNomeDono(ContaLoja l){
        return LojaDAO.existeNomeDono(l);
    }
    
    public boolean existeNomeLoja(ContaLoja l){
        return LojaDAO.existeNomeLoja(l);
    }
    
    public boolean existeTelefoneLoja(ContaLoja l){
        return LojaDAO.existeTelefone(l);
    }
        
}
