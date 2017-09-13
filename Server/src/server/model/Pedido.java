package server.model;

import java.util.ArrayList;
import java.util.List;



public class Pedido {
    private String id; 
    private String codigoPedido;
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();;
    private boolean statusVisualizado;
    private boolean statusPronto;

     public Pedido(int idLoja, String codigoPedido, Cliente cliente, List<Item> itens){
        this.codigoPedido =  codigoPedido;
        this.id = Integer.toString(idLoja) + this.codigoPedido;
        this.cliente = cliente;	   	   
        this.itens = itens;
        this.statusPronto = false;
        this.statusVisualizado = false;
   }    
    
    public boolean isStatusVisualizado() {
        return this.statusVisualizado;
    }

    public boolean isStatusPronto() {
        return this.statusPronto;
    }
    
    public void setStatusVisualizado(boolean statusVisualizado) {
        this.statusVisualizado = statusVisualizado;
    }

    public void setStatusPronto(boolean statusPronto) {
        this.statusPronto = statusPronto;
    }
       
    
   public double getPrecoTotal() {
	   double total = 0;
	   
	   for(Item item : itens) {
		   total += item.obterTotal();
	   }
	   
	   return total;
   }
   
   public Cliente getCliente() {
	   return this.cliente;
   }
   
   public String getId() {
	   return this.id;
   }
   
}
