/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;
import java.util.ArrayList;
import server.model.Produto;
import server.model.ContaLoja;
import server.model.Cardapio;
/**
 *
 * @author tarcisio
 */
public class CardapioDAO {
    private static ArrayList<Cardapio> cardapios = new ArrayList<>();
    
    // quando a loja for criada, ela cria o cardapio
    public static void criarCardapio(String id){
        Cardapio cardapio = new Cardapio(id);
        cardapios.add(cardapio);
    }
    
    // cliente que chama para ver os produtos da loja
    // loja chama quando logar e pegar o seu cardapio
    public static Cardapio buscaCardapio(String id){ // id da loja
        for(Cardapio c : cardapios){
            if(c.getIdLoja().equals(id)){
                return c;
            }
        }
        return null;
    }
}
