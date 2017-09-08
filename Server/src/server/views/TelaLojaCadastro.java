/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.model.Loja;

/**
 *
 * @author users
 */
public class TelaLojaCadastro {

    public void telaLojaCadastrar() {  
        int op = 0;
        int id = 0;
        String nomeDono;
        String nome;
        String senha;
        String login;
        String telefone;
        do {
            Scanner tec = new Scanner(System.in);
            System.out.println("Nome da loja: ");
            nome = tec.nextLine();
            System.out.println("Digite ID: ");
            id = tec.nextInt();
            System.out.println("Nome do Responsavel da Loja: ");
            nomeDono = tec.nextLine();
            System.out.println("Digite o login: ");
            login = tec.nextLine();
            System.out.println("Digite o telefone: ");
            telefone = tec.nextLine();
            System.out.println("Digite a senha: ");
            senha = tec.nextLine();
            Loja loja1 = new Loja(id, nome, telefone, login, senha, nomeDono);
            //ControllerLoja controller1 = new ControllerLoja();
            // controller1.cadastrar(loja1);
            System.out.println("1-Acessar");
            System.out.println("2-Cancelar e voltar");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    //acessar e se tudo correto acessa a tela de loja
                    break;
                case 2:
                    //TELA DE CADASTRO DO USUARIO
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (op < 1 || op > 2);
    }
}
