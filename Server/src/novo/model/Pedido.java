
package novo.model;

import java.util.ArrayList;

public class Pedido {
   private ArrayList<ItemDeVenda> itens; 
   
   
   public Pedido(){
       itens = new ArrayList<>();
   }
   
   public double getPrecoTotal(){
       double valor = 0;
       for(ItemDeVenda i : itens){
           valor = valor + i.getPreco();
       }
       return valor;
   }
   
}
