/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.controllers.ControllerCliente;
import server.model.Cliente;

/**
 *
 * @author Junior
 */
public class TelaLogin {
    public void login(){
        /*
            A view tem que validar os dados inseridos pelo usuario, login vazio, caracter invalido, etc.      
        */
        Cliente c;
        Scanner tec = new Scanner(System.in);
        String senha;
        String login;
        System.out.println("Digite o login: ");
        login = tec.nextLine();
        System.out.println("Digite a senha: ");
        senha = tec.nextLine();
        ControllerCliente controller1 = new ControllerCliente();
        if(controller1.logar(login, senha) == false){
            System.out.println("Conta não existe");
        }else{
            System.out.println("Bem vindo !!!");
            c = controller1.buscarDados(login);
            TelaMenuCliente tela = new TelaMenuCliente(c);
                tela.exibirMenu();
        }
    }
}
