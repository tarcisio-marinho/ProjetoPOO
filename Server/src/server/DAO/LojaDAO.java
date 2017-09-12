/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;

import server.model.Loja;

/**
 *
 * @author tarcisio
 */
public class LojaDAO {
    
    public boolean buscaLogin(String login, String senha){ // BUSCA SE A CONTA EXISTE
        return false;
    }
    
    public boolean existeLoja(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        return false;
    }
    
    public boolean cadastrarLoja(Loja j){
        buscaLogin(j.getLogin(), j.getSenha());
        return false;
    }
    
    public Loja buscaLoja(String login){
        return null; // vai procurar no banco o cliente com aquele login e retornar o cliente
    }
}
