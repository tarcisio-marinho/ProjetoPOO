package server.model;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author users
 */
public class Cardapio {
    private String idLoja;
    private List<Produto> produtos;
    
    public Cardapio(String idLoja){       
        this.idLoja = idLoja;
        this.produtos = new ArrayList();
    }

    public String getIdLoja() {
        return idLoja;
    }
    
    public void addProduto(Produto produto){
        //chama controller para adicionar
    }
    
    public void removeProduto(int idProduto){
        //chama controller para remover
    }  
    
    public List getCardapio(){
        return this.produtos;
    }
    
    public Produto getProdutoPorID(int id){
        return produtos.get(id);
    }
}
