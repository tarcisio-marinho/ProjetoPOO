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
public class TelaEntradaLoja {
    public void telaEntradaLoja1() {
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
                    //TELA DE LOGIN DA LOJA
                    break;
                case 2:
                    //TELA DE CADASTRO DA LOJA
                    break;
                case 3:
                    MenuPrincipal voltar = new MenuPrincipal();
                    voltar.menuPrincipal1();
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (op < 1 || op > 3);
    }
}
