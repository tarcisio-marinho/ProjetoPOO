package server.views;

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner entrada;
    private int escolha;


    public void exibirMenu() {
        System.out.println("1) LOGIN");
        System.out.println("2) CADASTRO");
        System.out.println("3) SAIR");
        System.out.println("DIGITE A OPÇÃO: ");
    }

    public void lerEntrada() {
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        System.gc();
    }

    public void switchMenu() {
        switch (this.escolha) {
            case 1:
                TelaEntradaCliente telaUsuario1 = new TelaEntradaCliente();
                telaUsuario1.exibirMenu();
                telaUsuario1.lerEntrada();
                telaUsuario1.switchMenu();
                break;
            case 2:
                TelaEntradaLoja telaLoja1 = new TelaEntradaLoja();
                telaLoja1.exibirMenu();
                telaLoja1.lerEntrada();
                telaLoja1.switchMenu();
                break;
            case 3:
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }

}
