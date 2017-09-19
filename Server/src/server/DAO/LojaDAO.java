package server.DAO;

import java.util.ArrayList;
import server.model.ContaLoja;
import server.model.Produto;

public class LojaDAO {
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
        return LojaDAO.lojas.size();
    }
    
    public static void cadastrarLoja(ContaLoja loja){
        lojas.add(loja);
    }
    
    public static ArrayList<ContaLoja> getLojas(){ // cliente vai receber todas as lojas
        return LojaDAO.lojas;
    }
    
    public static boolean existeTelefone(String telefone){
        for (ContaLoja loja : lojas){
            if(loja.getTelefone().equals(telefone)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean existeNomeLoja(String nome){
        for (ContaLoja loja : lojas){
            if(loja.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean existeNomeDono(String nome){
        for (ContaLoja loja : lojas){
            if(loja.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
}
