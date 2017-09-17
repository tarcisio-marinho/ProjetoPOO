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
    
	public void removeCliente(int id) { // eu acho que nao precisa disso
		this.clienteDAO.remove(id);
	}
	
    public boolean existe(ContaCliente contaCliente){
        boolean resposta;
       
        
        resposta = clienteDAO.existeLogin(contaCliente.getLogin());
        
    	return resposta;    	
    }
    
    
    
    public void add(ContaLoja contaLoja){
		this.lojasDAO.add(contaLoja);		
    }
    
	public void removeLoja(int id) { //tb acho que nao vai precisar do remove
		this.lojasDAO.remove(id);
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