package server.model;


import java.util.ArrayList;
import java.util.List;

public class Loja extends Conta{

    private final int id;
    private String nomeDono;
    private final List<Produto> produtos;

    public Loja(int id, String nome, String telefone, String login, String senha, String nomeDono){
        this.id = id;
        this.nomeDono = nomeDono;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setLogin(login);   
        super.setSenha(senha);
        this.produtos = new ArrayList<>();
    }

    public int getId(){
        return this.id;
    }

    public String getNomeDono(){
        return this.nomeDono;
    }
    
    public void setNomeDono(String nomeDono){
        this.nomeDono = nomeDono;
    }

    public void addProduto(Produto p){
        this.produtos.add(p); //DAO PRODUTOS AQUI
    }

    public void removeProduto(int id){

    	try {
    		this.produtos.remove(id);

    	}catch(IndexOutOfBoundsException error) {
    		System.out.println("ERRO: ao remover produto de uma loja. ");
    		error.getMessage();

    	}
    }

}
