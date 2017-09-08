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
public class ItemPedido {
    private int quantidade;
    private int id;
    private String nome;
    private float precoUnidade;
    
    public void ItemPedido(int qtd, Produtos p){
        this.quantidade = qtd;
        this.id = p.getId();
        this.nome = p.getNome();
        this.precoUnidade = p.getPreco();
    }
    
    public float obterTotal(){
        return this.precoUnidade * this.quantidade;
    }
}
