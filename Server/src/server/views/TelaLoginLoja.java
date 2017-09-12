/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;
import server.model.Loja;
import java.util.Scanner;
import server.controllers.ControllerLoja;

/**
 *
 * @author users
 */
public class TelaLoginLoja {
    
    public void telaLoginLoja() {
        Loja loja;
        Scanner tec = new Scanner(System.in);
        String login; 
        String senha;
        
        System.out.println("Digite seu login");
        login = tec.nextLine();
        System.out.println("Digite Sua Senha:");
        senha = tec.nextLine();
        
        ControllerLoja controller1 = new ControllerLoja();
        
        if(controller1.logar(login, senha) == false){
            System.out.println("Conta não existe");
        }else{
            System.out.println("Bem vindo !!!");
            loja = controller1.buscarDados(login);
            TelaMenuLoja tela = new TelaMenuLoja(loja);
            tela.exibirMenu();
        }
        
    }
}
