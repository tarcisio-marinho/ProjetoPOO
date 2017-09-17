package server.model;

import java.util.ArrayList;
import java.util.List;



public class Pedido {
    private String id; 
    private String vaucher;
    private List<Item> itens;
    private boolean statusVisualizado;
    private boolean statusPronto;
    private boolean statusEntregue;

    public Pedido(int idLoja, String vaucher){
        this.vaucher =  vaucher;
        this.id = Integer.toString(idLoja) + this.vaucher;   	   
        this.itens = new ArrayList<Item>();
        this.statusPronto = false;
        this.statusVisualizado = false;
        this.statusEntregue = false;
   }    
    public String getId() {
  	   return this.id;
     }
     
    public void AddItem(int qtd, Produto produto) {
    	this.itens.add( new Item(qtd, produto) );
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
    
    public boolean isStatusEntregue() {
    	return this.statusEntregue;
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
    
    public double getPreco() {
	   double total = 0;
	   
	   for(Item item : itens) {
		   total += item.getPreco();
	   }
	   
	   return total;
   }
    
    public String emString() {
	  String info = "";
	  info += "\nID: " + this.id; 
	  	  
	  info += "\nITEMS: \n" + itens.toString();	  
	  
	  return info;
  }
   
   
}
