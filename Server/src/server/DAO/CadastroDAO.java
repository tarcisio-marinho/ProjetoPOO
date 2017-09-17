package server.DAO;

import java.util.ArrayList;
import java.util.List;

import server.model.ContaCliente;
import server.model.ContaLoja;


public class CadastroDAO {
	//Nessa classe vamos usar polimorfismo de tipo, nesse caso sobre-carga
	
    private List<ClienteDAO> clientesDAO;
    private List<LojaDAO> lojasDAO;
	
    public CadastroDAO() {
    	this.clientesDAO = new ArrayList<>();
    	this.lojasDAO = new ArrayList<>();
    }
    

    
    public void add(ContaCliente contaCliente){
		this.clientesDAO.add(contaCliente);		
    }
    
	public void removeCliente(int id) {
		this.clientesDAO.remove(id);
	}
	
    public boolean existe(ContaCliente contaCliente){
        boolean resposta = false;
        
        for(ContaCliente conta : clientesDAO) {
        	if(conta == contaCliente) {
        		resposta = true;
        	}
        }
    	return resposta;    	
    }
    
    
    
    public void add(ContaLoja contaLoja){
		this.lojasDAO.add(contaLoja);		
    }
    
	public void removeLoja(int id) {
		this.lojasDAO.remove(id);
	}
	
    public boolean existe(ContaLoja contaLoja){
        boolean resposta = false;
        
        for(ContaLoja conta : lojasDAO) {
        	if(conta == contaLoja) {
        		resposta = true;
        	}
        }
    	return resposta;    	
    }
    
    
    
    
}