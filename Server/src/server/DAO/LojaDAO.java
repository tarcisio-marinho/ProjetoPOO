package server.DAO;

import server.model.ContaLoja;

public class LojaDAO {
    private static int qtd;
    
    public boolean buscaLogin(String login, String senha){ // BUSCA SE A CONTA EXISTE
        return false;
    }
    
    public boolean existeLogin(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        return false;
    }
    
    public boolean add(ContaLoja j){ //a verificacao de existencia eh feita já no controller
        LojaDAO.qtd++;
        return false;
    }
    
    public ContaLoja buscaLoja(String login){
        return null; // vai procurar no banco o cliente com aquele login e retornar o cliente
    }
    
    public void remove(String id){ //acho que nao precisa de remover
        //return true;
    }
    public int qtdLojas(){
        return LojaDAO.qtd;
    }
}
