
package server.model;

public class Item {
    private int quantidade;
    private int id;
    private String nome;
    private double precoUnidade;
    
    public Item(int quantidade, int id, String nome, double precoUnidade){
        this.quantidade = quantidade;
        this.id = id;
        this.nome = nome;
        this.precoUnidade = precoUnidade;
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
    
    public double obterTotal(){
        return this.precoUnidade * this.quantidade;
    }
}
