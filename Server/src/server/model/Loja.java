package server.model;

public class Loja{

    private String nome;
    private String telefone;    
    private String nomeDono;

    public Loja(String nome, String telefone,  String nomeDono){
        this.nome = nome;
        this.telefone = telefone;
        this.nomeDono = nomeDono; 
    }

    public String getNomeDono(){
        return this.nomeDono;
    }
    
    public void setNomeDono(String nomeDono){
        this.nomeDono = nomeDono;
    }

}
