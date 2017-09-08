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
public class Produtos {
    private String nome;
    private int id;
    private float preco;
    private String descricao;
    
    public void Produtos(String nome, String descricao, int id, float preco){
        this.nome = nome;
        this.preco = preco; 
        this.descricao = descricao;
        this.id = id;
    }
    
    protected void setNome(String nome){
        this.nome = nome;
    }
    
    protected void setPreco(float preco){
        this.preco = preco;
    }
    
    protected void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public int getId(){
        return this.id;
    }
}
