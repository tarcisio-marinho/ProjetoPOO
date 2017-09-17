
package server.model;

public class Item {
    private int quantidade;
    private int id;
    private String nome;
    private double precoUnidade;
    
    public Item(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.precoUnidade = produto.getPreco();
    }
        
    public String getNome() {
    	return this.nome;
    }
    
    public int getId() {
    	return this.id;
    }
    
    public double getPrecoUnidade() {
    	return this.precoUnidade;
    }
    
    public double getPreco(){
        return this.precoUnidade * this.quantidade;
    }
}
