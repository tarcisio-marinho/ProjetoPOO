package server.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int id; 
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();;
	
   
	public Pedido(int id, Cliente cliente, Produto produto){
	   this.id = id;
	   this.cliente = cliente;	   	   
	   this.produtos.add(produto);	   
   }
   
   public double getPrecoTotal() {
	   double total = 0;
	   
	   for(Produto p : produtos) {
		   total += p.getPreco();
	   }
	   
	   return total;
   }
   
   public Cliente getCliente() {
	   return this.cliente;
   }
   
   public int getId() {
	   return this.id;
   }
   
}
