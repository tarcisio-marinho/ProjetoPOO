package server.views;

import java.util.Scanner;

public class MenuPrincipal implements InterfaceViews{

    private Scanner entrada;
    private int escolha = 0;

    public int getOpcao(){
        return this.escolha;
    }

    @Override
    public void exibirMenu() {
        System.out.println("1) LOGIN");
        System.out.println("2) CADASTRO");
        System.out.println("3) SAIR");
        System.out.println("DIGITE A OPÇÃO: ");
        
        lerEntrada();
        switchMenu();
    }

    @Override
    public void lerEntrada() {
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        System.gc();
    }

    @Override
    public void switchMenu() {
        switch (this.escolha) {
            case 1:
                TelaLogin telaUsuario1 = new TelaLogin();
                telaUsuario1.login();
                break;
            case 2:
                TelaCadastro telaLoja1 = new TelaCadastro();
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
