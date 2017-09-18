package server.DAO;

import java.util.ArrayList;
import server.model.ContaLoja;

public class LojaDAO {
    private static int qtd;
    private ArrayList<ContaLoja> lojas;
    
    public LojaDAO(){
        this.qtd = 0;
        this.lojas = null;
    }
    
    public boolean existeLogin(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        for (ContaLoja l : lojas){
            if(l.getLogin().equals(login)){
                return false;
            }
        }
        return true;
    }
    
    
    public ContaLoja buscaLoja(String login){
        for (ContaLoja l : lojas){
            if(l.getLogin().equals(login)){
                return l;
            }
        }
        return null;
    }
    
    public boolean remove(String id){ //acho que nao precisa de remover
        for (ContaLoja l : lojas){
            if(l.getId().equals(id)){
                lojas.remove(l);
                return true;
            }
        }
        return false;
    }
    
    public int qtdLojas(){
        return this.qtd;
    }
    
    public void cadastrarLoja(ContaLoja loja){
        lojas.add(loja);
        qtd++;
    }
}
