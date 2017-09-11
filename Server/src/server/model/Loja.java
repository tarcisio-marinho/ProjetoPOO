/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

import java.util.ArrayList;

/**
 *
 * @author tarcisio
 */
public class Loja {
    
    private int id;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private String nomeDono;
    private ArrayList <Produtos> produtos;
    
    public Loja(int id, String nome, String telefone, String login, String senha, String nomeDono){
        this.id = id;
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
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
    
    public void setNome(String nome){
        this.nome = nome;
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
    
    public void addProduto(Produtos p){
        this.produtos.add(p);
    }
    
    public boolean removeProduto(Produtos p){ // retornar o objeto ?
        for (Produtos pro : produtos){
            if(p.getId() == pro.getId()){
                this.produtos.remove(pro);
                return true;
            }
        }
        return false;
    }
}
