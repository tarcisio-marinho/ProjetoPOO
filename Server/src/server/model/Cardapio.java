package server.model;


import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private String idLoja;
    private List<Produto> produtos;
    
    public Cardapio(String idLoja){       
        this.idLoja = idLoja;
        this.produtos = new ArrayList<Produto>();
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
    
    public Produto getProdutoPorID(int id){
        return produtos.get(id);
    }
    
    public List<Produto> getProdutos(){
    	return this.produtos;
    }
}
