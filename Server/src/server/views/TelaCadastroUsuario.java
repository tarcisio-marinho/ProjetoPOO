/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.controllers.ControllerUsuario;
import server.model.Cliente;

/**
 *
 * @author Junior
 */
public class TelaCadastroUsuario {
    public void telaCadastroUsuario1(){
        Scanner tec = new Scanner(System.in);
        String nome;
        String senha;
        String login;
        String telefone;
        System.out.println("Digite o login: ");
        nome = tec.nextLine();
        System.out.println("Digite a senha: ");
        senha = tec.nextLine();
        System.out.println("Digite o nome: ");
        login = tec.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = tec.nextLine();
        Cliente cliente1 = new Cliente(nome, login, telefone, senha);
        ControllerUsuario controller1 = new ControllerUsuario();
        controller1.cadastrar(cliente1);
        
    }
}
