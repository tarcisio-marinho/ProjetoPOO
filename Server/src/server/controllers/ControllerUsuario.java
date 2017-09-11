package server.controllers;

import server.model.Cliente;

/**
 *
 * @author Junior
 */
public class ControllerUsuario {
    public boolean logar(String login, String senha){
        //verificar se ha usuario com os parametros no dao
        //se tiver, acessar telaUsuario
        //Se nao, retorna algo pra view
        return false;
    }
    public boolean cadastrar(Cliente cliente1){
        //Checar se ha usuario com os parametros no dao
        //se ja existir, retorna algo pra view
        //se nao existir, efetuar cadastro, e ir para tela de login
        return false;
    }
    
    public Cliente buscarDados(String login){
        Cliente c;
        // pega no dao o cliente pelo login e retorna pra view ;
        //c = new Cliente();
        return c;
    }

    /*
    public void logar(String login, String senha){
        //verificar se ha usuario com os parametros no dao
        //se tiver, acessar telaUsuario
        //Se nao, retorna algo pra view
    }
    public void cadastrar(Cliente cliente1){
        //Checar se ha usuario com os parametros no dao
        //se ja existir, retorna algo pra view
        //se nao existir, efetuar cadastro, e ir para tela de login
    }
*/
}