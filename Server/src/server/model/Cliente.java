package server.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private List<Pedido> meusPedidos;
    
    
    public Cliente(String  nome, String telefone, String login, String senha){
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;        
        this.senha = senha;
        this.meusPedidos = new ArrayList<Pedido>();
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public void setLogin(String login) {
    	this.login = login;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setTelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    public String getSenha(){
        return this.senha;
    }
    
    public String getSenha() {
    	return this.senha;
    }
    
    public List<Pedido> getMeusPedidos() {
    	return this.meusPedidos;
    }
    
}
