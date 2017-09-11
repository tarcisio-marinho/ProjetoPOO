package server.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Conta{
    private final List<Pedido> meusPedidos;
    
    
    public Cliente(String  nome, String telefone, String login, String senha){
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setLogin(login);   
        super.setSenha(senha);
        this.meusPedidos = new ArrayList<>();
    }
    
    public List<Pedido> getMeusPedidos() {
    	return this.meusPedidos;
    }
    
}
