/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

/**
 *
 * @author tarcisio
 */
public class Conta {
    private String nome; 
    private String telefone;
    private String login;
    private String senha;
    
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
    
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    
    public String getSenha() {
    	return this.senha;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
