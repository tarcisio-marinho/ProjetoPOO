package server.controllers;
import java.util.ArrayList;
import server.DAO.CardapioDAO;
import server.model.Cardapio;
import server.model.Produto;
import server.model.ContaLoja;

public class ControllerCardapio {

    
    public void addProduto(Cardapio cardapio, Produto produto){
        ArrayList<Produto> produtos = cardapio.getProdutos();
        produtos.add(produto);
        
    }
    
    public void alterarProduto(Cardapio cardapio, Produto produto){ 
        
        
    }
    
    public void removeProduto(Cardapio cardapio, Produto produto){ // loja remove produto do cardapio
        
    }
    
    public Cardapio getCardapio(String id){ // cliente recebe o cardapio
        return null;
    }
}
