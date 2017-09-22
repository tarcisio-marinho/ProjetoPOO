/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.model.Cardapio;
import server.model.Produto;

/**
 *
 * @author users
 */
public class TelaVerCardapioCliente {
    private Cardapio cardapio;
    private Scanner entrada;
    private int escolha;
   // private int escolha;
    public TelaVerCardapioCliente(Cardapio c){
        this.cardapio = c;
    }
    
    public void menuCadarpio(){
        System.out.println("1)Selecionar Produtos");
        System.out.println("2)Voltar");
    }
    public void listarCardapio(){
        for(Produto p : this.cardapio.getProdutos()){
            System.out.println("--------------------------------");
            System.out.println("ID: "+ p.getId());
            System.out.println("Nome: "+ p.getNome());
            System.out.println("Descrição: "+ p.getDescricao());
            System.out.println("Preço: R$ "+ p.getPreco());
           
        }
    }
    private void lerEntrada(){
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        System.gc();
    }
    private void switchMenu(){
        switch (this.escolha) {
            case 1:
                //tela de pedido
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }  
}
