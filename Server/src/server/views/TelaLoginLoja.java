/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.controllers.ControllerLoja;
import server.model.ContaLoja;
import server.model.Loja;

/**
 *
 * @author users
 */
public class TelaLoginLoja {
    public void login(){
        ContaLoja loja;
        Scanner tec = new Scanner(System.in);
        String senha;
        String login;
        System.out.println("Digite o login: ");
        login = tec.nextLine();
        System.out.println("Digite a senha: ");
        senha = tec.nextLine();
        ControllerLoja controller1 = new ControllerLoja();
      /*  if(controller1.logar(login, senha) == false){
            System.out.println("Conta não existe");

        }*/else{
            System.out.println("Bem vindo !!!");
            loja = controller1.buscarDados(login);
            TelaMenuLoja tela = new TelaMenuLoja(loja);
                tela.exibirMenu();
        }
    }
}
