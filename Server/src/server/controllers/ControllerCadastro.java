/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controllers;

import server.DAO.CadastroDAO;
import server.model.Conta;
import server.model.ContaCliente;


/**
 *
 * @author users
 */
public class ControllerCadastro {
    private CadastroDAO dao;
    public boolean cadastrar(ContaCliente contaCliente){
        boolean retorno;
        retorno = dao.existeCliente();
        if(retorno == false){
            dao.cadastrarCliente(cliente1);
            return true;
        }else{
            return false;
        }
    }
    
}
