/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class TelaLoja1 {
    public void telaEntradaLoja() {
        Scanner tec = new Scanner(System.in);
        int op;
        do {
            System.out.println("1 - LOGIN");
            System.out.println("2 - CADASTRAR");
            System.out.println("3 - VOLTAR");
            System.out.println("Digite a opção: ");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    TelaLoginUsuario telaLogin1 = new TelaLoginUsuario();
                    telaLogin1.telaLoginUsuario1();
                    break;
                case 2:
                    //TELA DE CADASTRO DO USUARIO
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (op < 1 || op > 3);
    }
}
