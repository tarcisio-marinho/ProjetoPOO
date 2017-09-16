package server.model;

import java.util.ArrayList;
import java.util.List;



public class Pedido {
    private String id; 
    private String vaucher;
    private List<Item> itens = new ArrayList<>();;
    private boolean statusVisualizado;
    private boolean statusPronto;
    private boolean statusEntregue;

     public Pedido(int idLoja, String vaucher, List<Item> itens){
        this.vaucher =  vaucher;
        this.id = Integer.toString(idLoja) + this.vaucher;   	   
        this.itens = itens;
        this.statusPronto = false;
        this.statusVisualizado = false;
        this.statusEntregue = false;
   }    
    
    public String getReferenciaLoja(){
        return id.substring(0, 2);        
    } 
     
    public String getReferenciaPedido(){
        return id.substring(2, 6);
    }
     
    public boolean isStatusVisualizado() {
        return this.statusVisualizado;
    }
       

    public boolean isStatusPronto() {
        return this.statusPronto;
    }
    
    public void setStatusVisualizado() {
        this.statusVisualizado = true;
    }

    public void setStatusPronto() {
        this.statusPronto = true;
    }
       
    public void setStatusEntregue(){
        this.statusEntregue = true;
    }
    
   public double getPrecoTotal() {
	   double total = 0;
	   
	   for(Item item : itens) {
		   total += item.obterTotal();
	   }
	   
	   return total;
   }
   
  
   public String getId() {
	   return this.id;
   }
   
}
