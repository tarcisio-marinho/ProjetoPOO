package server.DAO;

import java.util.ArrayList;
import server.model.ContaLoja;
import server.model.ContaLoja;
import server.model.Produto;

public class LojaDAO {
    private static ArrayList<ContaLoja> lojas =  new ArrayList<>();

   public static ContaLoja buscar(String login){
        for (ContaLoja c : lojas){
            if(c.getLogin().equals(login)){
                return c;
            }
        }
        return null;
    }

    public static void inserir(ContaLoja c){
        lojas.add(c);
    }

    public static void remover(String login){
        for (ContaLoja c: lojas){
            if(c.getLogin().equals(login)){
                lojas.remove(c);
            }
        }
    }

    public static ArrayList<ContaLoja> getTodos(){
        return LojaDAO.lojas;
    }
}
