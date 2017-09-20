package server.DAO;
import java.util.ArrayList;
import server.model.Cardapio;

public class CardapioDAO {
    private static ArrayList<Cardapio> cardapios = new ArrayList<>();
    
    
    // quando a loja for criada, ela cria o cardapio
    public void criarCardapio(String id){
        Cardapio cardapio = new Cardapio(id);
        cardapios.add(cardapio);
    }    
    
    
    
    // cliente que chama para ver os produtos da loja
    // loja chama quando logar e pegar o seu cardapio
    public Cardapio buscaCardapio(String id){ // id da loja
        for(Cardapio cardapio : cardapios){
            if(cardapio.getId().equals(id)){
                return cardapio;
            }
        }
        return null;
    }
    
    
    
    
}
