
package server.controllers;


import java.util.ArrayList;

import server.DAO.ClienteDAO;
import server.model.ContaCliente;

/*
 * Podemos logar, cadastrar e remover um cliente da base de dados
 */

public class ControllerCliente {
    private ClienteDAO bancoCliente = new ClienteDAO();;

    
    //O ato de logar é simplismente para buscar o 
    //clinte para que todas oprações tenham essa relação 
    public ContaCliente logar(String login, String senha){
        
    	//se achar no banco o retorno será a conta
    	//se não achar o banco retorn null, logo assim retorna null
    	//para quem quis logar
    	return bancoCliente.buscar(login);      	
    }
    
    
    
    //Poderiamos retornar uma boolean informando se foi cadastrado
    //mas como em OO devemos sempre que aceitar que tudo será verdade
    //e exceções devem ser retornada, então caberia ai um boolean para informar,
    //uma vez que tudo está sendo feito no console
    public void cadastrar(ContaCliente novoCliente){
                
        ContaCliente cliente = bancoCliente.buscar( novoCliente.getLogin() );
        
        if(cliente != null) {
        	bancoCliente.inserir(novoCliente);        	
        }            
    }
    
    
    
    //Busca o login no banco de cliente comparando com o que deseja-se deletar
    //quando é achado apenas usamos o metodo de remover do banco passando o objeto que deve ser removido
    public void deletar(String login){
               
    	for(ContaCliente cliente : (ArrayList<ContaCliente>)bancoCliente.getTodos()) {
    		if( cliente.getLogin().equals(login) ){
    			bancoCliente.remover(cliente);
    		}
    	}        
    }

    
}