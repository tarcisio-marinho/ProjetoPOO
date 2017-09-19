
package server.controllers;
import server.DAO.LojaDAO;
import server.model.ContaLoja;
import server.model.Loja;

public class ControllerLoja {
    private LojaDAO dao;
    
    public ControllerLoja(){
        this.dao = new LojaDAO();
    }
    
    public void alterarNomeDono(String id, String nome){
        ContaLoja loja;
        loja = dao.buscaLoja(id);
        loja.setNomeDono(nome);
        dao.remove(id);
        dao.add(loja);
    } 
    
    public void alterarNome(String id, String nome){
        ContaLoja loja;
        loja = dao.buscaLoja(id);
        loja.setNome(nome);
        dao.remove(id);
        dao.add(loja);
    } 
    
    public void alterarTelefone(String id, String telefone){
        ContaLoja loja;
        loja = dao.buscaLoja(id);
        loja.setTelefone(telefone);
        dao.remove(id);
        dao.add(loja);
    } 
    
    public void alterarSenha(String id, String senha){
        ContaLoja loja;
        loja = dao.buscaLoja(id);
        loja.setSenha(senha);
        dao.remove(id);
        dao.add(loja);
    } 
            
    public ContaLoja buscarDados(String login){
        ContaLoja c;
        c = dao.buscaLoja(login);
        return c;
    }
}
