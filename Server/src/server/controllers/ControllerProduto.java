package server.controllers;

import server.model.Cardapio;
import server.model.Produto;

public class ControllerProduto {
	 
		// Como um cardapio tem uma lista de produto
	    //precisamos apenas usar o método pronto para adicionar um objeto
	    public void addProduto(Cardapio cardapio, Produto produto){
	            	
	        cardapio.getProdutos().add(produto);
	    }
	    
	    
	    
	    // Nesse modo atual, fazemos uma busca em todos os pedidos de cardapio
	    //caso o mesmo ID que o produto antigo com o novo, removemos e adicionamos o novo
	    //para funcionar nunca devemos mudar um ID de produto
	    public void alterarProduto(Cardapio cardapio, Produto novoProduto){ 
	        
	    	for(Produto produto : cardapio.getProdutos()) {
	    		if(produto.getId().equals(novoProduto.getId())) {
	    			cardapio.getProdutos().remove(produto);
	    			cardapio.getProdutos().add(novoProduto);
	    		}
	    	}
	    	
	    }
	    
	    
	    
	    // Loja remove produto do cardapio, passando o ID do produto para ser removido
	    public void removeProduto(Cardapio cardapio, String id){
	    	
	    	for(Produto produto : cardapio.getProdutos()) {
	    		if(produto.getId().equals(id)) {
	    			cardapio.getProdutos().remove(produto);    	
	    		}
	    	}
	    	
	    }

	    
	    
}
