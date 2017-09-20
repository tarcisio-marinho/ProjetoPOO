
package server.controllers;


import server.DAO.ClienteDAO;
import server.DAO.LojaDAO;

import server.model.Conta;
import server.model.ContaCliente;
import server.model.ContaLoja;



public class ControllerCadastro {
    ClienteDAO bancoCliente = new ClienteDAO();
    LojaDAO bancoLoja = new LojaDAO();
    
	public void add(Conta conta) {
		
		if(conta instanceof ContaCliente) {
			
			bancoCliente.getTodos().add( (ContaCliente)conta );
		}else {
			
			bancoLoja.getTodos().add( (ContaLoja)conta );
		}
		
		
	}
	
	public void remove(Conta conta) {
		
		if(conta instanceof ContaCliente) {
			
			bancoCliente.getTodos().remove( (ContaCliente)conta );
		}else {
			
			bancoLoja.getTodos().remove( (ContaLoja)conta );
		}
		
		
	}
	
}
