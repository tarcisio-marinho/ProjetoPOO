package server.DAO;

import java.util.ArrayList;
import server.model.ContaLoja;


public class LojaDAO {
    private static ArrayList<ContaLoja> lojas =  new ArrayList<>();

   public ContaLoja buscar(String login){
        for (ContaLoja c : lojas){
            if(c.getLogin().equals(login)){
                return c;
            }
        }
        return null;
    }

    public void inserir(ContaLoja c){
        lojas.add(c);
    }

    public void remover(String login){
        for (ContaLoja c: lojas){
            if(c.getLogin().equals(login)){
                lojas.remove(c);
            }
        }
    }

    public ArrayList<ContaLoja> getTodos(){
        return LojaDAO.lojas;
    }
}
