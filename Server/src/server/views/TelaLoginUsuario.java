/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.controllers.ControllerUsuario;

/**
 *
 * @author Junior
 */
public class TelaLoginUsuario {
    public void telaLoginUsuario1(){
        Scanner tec = new Scanner(System.in);
        String senha;
        String login;
        System.out.println("Digite o login: ");
        login = tec.nextLine();
        System.out.println("Digite a senha: ");
        senha = tec.nextLine();
        ControllerUsuario controller1 = new ControllerUsuario();
        controller1.logar(login, senha);
    }
}
