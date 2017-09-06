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
public class ItemPedido {
    private int quantidade;
    private String id;
    private String nome;
    private float precoUnidade;
    
    public void ItemPedido(int qtd, String id, Produtos p){
        this.quantidade = qtd;
        this.id = id;
        this.nome = p.getNome();
        this.precoUnidade = p.getPreco();
    }
    
    public float obterTotal(){
        return this.precoUnidade * this.quantidade;
    }
}
