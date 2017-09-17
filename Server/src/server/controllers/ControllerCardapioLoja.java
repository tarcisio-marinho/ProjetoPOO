package server.controllers;
import server.DAO.CardapioDAO;
import server.model.Cardapio;
import server.model.Produto;

public class ControllerCardapio {
    private CardapioDAO dao;
    private Cardapio cardapio;

    public ControllerCardapio() {
        this.dao = ;
        this.cardapio = cardapio;
    }
    
    
    public void addProduto(String id, Produto produto){//id pertence a loja
        cardapio = dao.getCardapio(id);
        dao.removeCardapio(id);
        this.cardapio.addProduto(produto);
        dao.addCardapio(cardapio);
    }
    
    public void alterarProduto(Cardapio cardapio, Produto produto){
        
    }
    
    public void removeProduto(Cardapio cardapio, Produto produto){
        cardapio.removeProduto(produto.getId());
        dao.removeCardapio(cardapio.getIdLoja());
        dao.addCardapio(cardapio);
    }
    
    public Cardapio getCardapio(String id){
        cardapio = dao.getCardapio(id);
        return cardapio;
    }
}
