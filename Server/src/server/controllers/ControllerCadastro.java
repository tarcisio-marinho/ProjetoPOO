
package server.controllers;

import server.DAO.ClienteDAO;
import server.DAO.LojaDAO;

import server.model.Conta;
import server.model.ContaCliente;
import server.model.ContaLoja;

/*
 * Controller para cadastrar e remover uma Conta qualquer.
 * Para achar uma conta, talvez, seja necessario passar por todas as contas
 * 
 * */


public class ControllerCadastro {
    ClienteDAO bancoCliente = new ClienteDAO();
    LojaDAO bancoLoja = new LojaDAO();
    
    
    //adiciona uma nova conta - passando uma Conta generica(Cliente ou Loja)
	public void add(Conta conta) {
		
		if(conta instanceof ContaCliente) {
			bancoCliente.inserir( (ContaCliente)conta );			
		}else {
			
			bancoLoja.inserir( (ContaLoja)conta );
		}		
	}
	
	
	//remove buscando pelo registro de login - buscar em  clientes, caso não ache vai em lojas
	public void remove(String login) {
		
		boolean achou = false;
		
		
		for(ContaCliente cliente : bancoCliente.getTodos()) {			
			if(cliente.getLogin().equals(login)) {//cliente achado
				bancoCliente.getTodos().remove(cliente);
				achou = true;
			}
		}		
		
		if(!achou) { //se não foi achado em cliente buscamos em lojas	
			for(ContaLoja loja : bancoLoja.getTodos()) {
				if(loja.getLogin().equals(login)) {//loja achada 
					bancoLoja.getTodos().remove(loja);
				}
			}
		}
	}	
	
		
}
