/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.controllers.ControllerCadastro;
import server.controllers.ControllerCliente;
import server.controllers.ControllerLogin;
import server.model.Cliente;
import server.model.ContaCliente;

/**
 *
 * @author Junior
 */
public class TelaCadastroCliente {
    public void cadastroCliente(){
        Scanner tec = new Scanner(System.in);
        boolean retornoController;
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
        
        if(valida(login) == false){
            System.out.println("login inválido");
            return;
        }else if(valida(senha) == false){
            System.out.println("Senha inválida");
            return;
        }else if(valida(nome) == false){
            System.out.println("Nome inválido");
            return;
        }else if(valida(telefone) == false){
            System.out.println("Telefone inválido");
            return;
        }
        ContaCliente cliente1 = new ContaCliente(nome, telefone, login, senha);
        ControllerCadastro controller1 = new ControllerCadastro();
        retornoController = controller1.cadastrar(cliente1);
        if(retornoController == false){
            System.out.println("Cliente já cadastrado");
        }else{
            System.out.println("Cadastrado com sucesso!");
        }
        
    }
    
    public boolean valida(String s){ // VALIDAÇÃO PODE SER MELHOR
        if(s.equals("")){
            return false;
        }
        return true;
    }
}
