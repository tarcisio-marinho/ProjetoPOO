package server.model;


import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    private int id;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private String nomeDono;
    private List<Produto> produtos;
    
    public Loja(int id, String nome, String telefone, String login, String senha, String nomeDono){
        this.id = id;
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.produtos = new ArrayList<Produto>();
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public String getNomeDono(){
        return this.nomeDono;
    }
        
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setNomeDono(String nomeDono){
        this.nomeDono = nomeDono;
    }
    
    public void addProduto(Produto p){
        this.produtos.add(p); //DAO PRODUTOS AQUI 
    }
    
    public void removeProduto(int id){
    
    	try {
    		this.produtos.remove(id);
    	
    	}catch(IndexOutOfBoundsException error) {
    		System.out.println("ERRO: ao remover produto de uma loja. ");
    		error.getMessage();
    		
    	}    	
    }
    
}
