
package server.views;

import java.util.Scanner;

public class MenuPrincipal {

    public void menuPrincipal() {
        Scanner tec = new Scanner(System.in);
        int op;

        do {
            System.out.println("1) USUARIO");
            System.out.println("2) LOJA");
            System.out.println("3) SAIR");
            System.out.println("DIGITE A OPÇÃO: ");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    TelaEntradaCliente telaUsuario1 = new TelaEntradaCliente();
                    telaUsuario1.EntradaCliente();
                    break;
                case 2:
                    TelaEntradaLoja telaLoja1 = new TelaEntradaLoja();
                    telaLoja1.entradaLoja();
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
