/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controllers;

import server.model.Cliente;
import server.DAO.ClienteDAO;
/**
 *
 * @author Junior
 */
public class ControllerCliente {
    private ClienteDAO dao;
    
    public ControllerCliente(){
        dao = new ClienteDAO();
    }
    
    public boolean logar(String login, String senha){
        return dao.buscaLogin(login, senha);
    }
    
    public boolean cadastrar(Cliente cliente1){
        boolean retorno;
        retorno = dao.existeCliente(cliente1.getLogin());
        if(retorno == false){
            dao.cadastrarCliente(cliente1);
            return true;
        }else{
            return false;
        }
    }
    
    public Cliente buscarDados(String login){
        Cliente c;
        c = dao.buscaCliente(login);
        return c;
    }

    
}