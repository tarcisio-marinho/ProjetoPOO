package server.DAO;

import java.util.ArrayList;
import server.model.ContaLoja;

public class LojaDAO {
    private static int qtd;
    private static ArrayList<ContaLoja> lojas =  new ArrayList<>();
    
    public static boolean existeLogin(String login){ // BUSCA SE LOGIN JA TA CADASTRADO
        for (ContaLoja l : lojas){
            if(l.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
    
    
    public static ContaLoja buscaDadosLoja(String login){
        for (ContaLoja l : lojas){
            if(l.getLogin().equals(login)){
                return l;
            }
        }
        return null;
    }
    
    public static int qtdLojas(){
        return LojaDAO.qtd;
    }
    
    public static void cadastrarLoja(ContaLoja loja){
        lojas.add(loja);
        qtd++;
    }
    
    public static ArrayList<ContaLoja> getLojas(){ // cliente vai receber todas as lojas
        return LojaDAO.lojas;
    }
}
