
package server.controllers;

import java.util.ArrayList;

import server.DAO.ClienteDAO;
import server.DAO.LojaDAO;

import server.model.Conta;
import server.model.ContaCliente;
import server.model.ContaLoja;



public class ControllerCadastro {
    ClienteDAO bancoCliente = new ClienteDAO();
    LojaDAO bancoLoja = new LojaDAO();
    
    ArrayList<ContaCliente> clientes = bancoCliente.getTodos();
    ArrayList<ContaLoja> lojas = bancoLoja.getTodos();
    
	
	Conta conta = null;
	
	public void add(Conta conta) {
		
		if(conta instanceof ContaCliente) {
			
			clientes.add( (ContaCliente)conta );
		}else {
			
			lojas.add( (ContaLoja)conta );
		}
		
	}
	
	public void remove(Conta conta) {
		
		if(conta instanceof ContaCliente) {
			
			clientes.remove( (ContaCliente)conta );
		}else {
			
			lojas.remove( (ContaLoja)conta );
		}
		
	}
	
}
