/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;
import server.model.Loja;
import java.util.Scanner;

/**
 *
 * @author users
 */
public class TelaLojaLogin {
    public void telaLojaLoginAcesso() {
        Scanner tec = new Scanner(System.in);
        int op;
        do {
            System.out.println("Digite Sua ID");
            op = tec.nextInt();
            System.out.println("Digite Sua Senha:");
            op = tec.nextInt();
            //gravar o nome e senha
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
