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
public class MenuPrincipal {

    public void menuPrincipal1() {
        Scanner tec = new Scanner(System.in);
        int op;

        do {
            System.out.println("1 - USUARIO");
            System.out.println("2 - LOJA");
            System.out.println("3 - SAIR");
            System.out.println("DIGITE A OPÇÃO: ");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    TelaEntradaUsuario telaUsuario1 = new TelaEntradaUsuario();
                    telaUsuario1.telaEntradaUsuario1();
                    break;
                case 2:
                    TelaLoja1 telaLoja1 = new TelaLoja1();
                    telaLoja1.telaEntradaLoja();
                    break;
                case 3: 
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;   
            }
        } while(op < 1 || op > 3);
    }
}
