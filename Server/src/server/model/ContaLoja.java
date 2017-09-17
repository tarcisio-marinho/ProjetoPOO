package server.model;

public class ContaLoja extends Conta{
    private String id;
    private Cardapio cardapio;
    private Loja loja;
    
    public ContaLoja(String id, String login, String senha, String nome, String telefone, String dono) {
        this.loja = new Loja(nome, telefone, dono);
        this.id = id;
        this.cardapio = new Cardapio(id);
        super.setLogin(login);
        super.setSenha(senha);
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

    public Loja getLoja(){
        return this.loja;
    }

}
