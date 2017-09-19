
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
    
    public boolean existeTelefoneCliente(String telefone){
        return ClienteDAO.existeTelefoneCliente(telefone);
    }
            
    public void cadastrar(ContaLoja contaLoja){
        LojaDAO.cadastrarLoja(contaLoja);
    }
    
    public boolean existeLoginLoja(String login){
        return LojaDAO.existeLogin(login);
    }
    
    public boolean existeNomeDono(String nome){
        return LojaDAO.existeNomeDono(nome);
    }
    
    public boolean existeNomeLoja(String nome){
        return LojaDAO.existeNomeLoja(nome);
    }
    
    public boolean existeTelefoneLoja(String telefone){
        return LojaDAO.existeTelefone(telefone);
    }
        
}
