/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.controllers;

import java.util.ArrayList;
import server.DAO.CardapioDAO;
import server.DAO.LojaDAO;
import server.model.Cardapio;

/**
 *
 * @author users
 */
public class ControllerCardapioCliente {
    private CardapioDAO daoC;
    
    public ControllerCardapioCliente(){
        this.daoC= new CardapioDAO();
       // this.daoL = new LojaDAO();
        
    }
    
    public ArrayList<Cardapio> listarLojas(){
        return daoC.getAllLojas();
    }
    
}
