
package server.controllers;
import server.DAO.LojaDAO;
import server.model.Loja;

public class ControllerLoja {
    private LojaDAO dao;
    
    public ControllerLoja(){
        this.dao = new LojaDAO();
    }
    
    public boolean logar(String login, String senha){
        return this.dao.buscaLogin(login, senha);
    }
    
    public boolean cadastrar(Loja loja1){
        boolean retorno;
        retorno = this.dao.existeLoja(loja1.getLogin());
        if(retorno == false){
            this.dao.cadastrarLoja(loja1);
            return true;
        }else{
            return false;
        }
    }
    
    public Loja buscarDados(String login){
        Loja c;
        c = dao.buscaLoja(login);
        return c;
    }
}
