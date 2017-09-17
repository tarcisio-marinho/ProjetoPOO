package server.DAO;

import server.model.ContaCliente;
import server.model.ContaLoja;


public class CadastroDAO {
    //Nessa classe vamos usar polimorfismo de tipo, nesse caso sobre-carga
    
    private ClienteDAO clienteDAO;
    private LojaDAO lojasDAO;
    
    public CadastroDAO() {
    	this.clienteDAO = new ClienteDAO();
    	this.lojasDAO = new LojaDAO();
    }
    
    public void add(ContaCliente contaCliente){
    		this.clienteDAO.add(contaCliente);		
    }
    
    public boolean existe(ContaCliente contaCliente){
        boolean resposta;
             
        resposta = clienteDAO.existeLogin(contaCliente.getLogin());
        
    	return resposta;    	
    }    
    
    public void add(ContaLoja contaLoja){
		this.lojasDAO.add(contaLoja);		
    }
    
    public boolean existe(ContaLoja contaLoja){
        boolean resposta = false;
        
        resposta = lojasDAO.existeLogin(contaLoja.getLogin());
    	return resposta;    	
    }
    
    public int qtdLojas(){
        return this.lojasDAO.qtdLojas();
    }
    
}