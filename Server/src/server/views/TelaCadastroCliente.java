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
    
    private ContaCliente lerDados(){
        String nome;
        String senha;
        String login;
        String telefone;
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o login: ");
        login= tec.nextLine();
        System.out.println("Digite Senha: ");
        senha= tec.nextLine();
        System.out.println("Digite o nome:");
        nome= tec.nextLine();
        System.out.println("Digite o telefone");
        telefone=tec.nextLine();
        ContaCliente novoCliente = new ContaCliente(nome,telefone,login,senha);
        return novoCliente;
    }
    
    public void cadastroCliente(){
       ContaCliente c=lerDados();
       
       if(validaCliente(c)==true){
            boolean retornoController;
            ControllerCadastro controller1 = new ControllerCadastro();
            retornoController = controller1.cadastrar(c);
            if(retornoController == false){
                System.out.println("Cliente já cadastrado");
            }else{
                System.out.println("Cadastrado com sucesso!");
            }
       }else{
           System.out.println("Cadastro nao realizado ");
       }
    }
    
    private boolean validaString(String s){ // VALIDAÇÃO PODE SER MELHOR
        if(s.equals("")){
            return false;
        }
        return true;
    }
    
    private boolean validaCliente(ContaCliente c){
        
        if(validaString(c.getLogin()) == false){
            System.out.println("login inválido");
            return false;
        }else if(validaString(c.getSenha()) == false){
            System.out.println("Senha inválida");
            return false;
        }else if(validaString(c.getNome()) == false){
            System.out.println("Nome inválido");
            return false;
        }else if(validaString(c.getTelefone()) == false){
            System.out.println("Telefone inválido");
            return false;
        }
        return true;
        
    }
}
