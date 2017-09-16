/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controllers;

import server.DAO.CadastroDAO;
import server.model.Conta;
import server.model.ContaCliente;
import server.model.ContaLoja;


/**
 *
 * @author users
 */
public class ControllerCadastro {
    private CadastroDAO dao;
    public boolean cadastrar(ContaCliente contaCliente){
        boolean retorno;
        retorno = dao.existeCliente(contaCliente);
        if(retorno == false){
            dao.cadastrarCliente(contaCliente);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean cadastrar(ContaLoja contaLoja){
        boolean retorno;
        retorno = dao.existeLoja(contaLoja);
        if(retorno == false){
            dao.cadastrarLoja(contaLoja);
            return true;
        }else{
            return false;
        }
    }
}
