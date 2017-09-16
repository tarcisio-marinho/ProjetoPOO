
package server.model;

public class ContaLoja extends Conta{
    private String id;
    private Cardapio cardapio;
    private Loja loja;
    public ContaLoja(String id) {
        this.id = id;
        this.cardapio = new Cardapio(id);
    }
    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cardapio getCardapio() {
        return this.cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }  

    public Loja getLoja(){
        return this.loja;
    }
}
