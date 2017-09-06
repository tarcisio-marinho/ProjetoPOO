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
public class Cliente {
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    
    public Cliente(String nome, String login, String telefone, String senha){
        this.nome = nome;
        this.login = login;
        this.telefone = telefone;
        this.senha = senha;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    private void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    private void setTelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    private void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    
}
