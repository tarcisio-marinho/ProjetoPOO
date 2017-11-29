/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.model;

import java.util.ArrayList;

/**
 *
 * @author users
 */
public class Pedido {
   private ArrayList<Produto> produtos; 
   
   
   public Pedido(){
       produtos = new ArrayList<>();
   }
   
   public double getPrecoTotal(){
       double valor = 0;
       for(Produto p : produtos){
           valor = valor + p.getPreco();
       }
       return valor;
   }
   
}
