/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;

/**
 *
 * @author users
 */
public class TelaCadastro {

    private Scanner entrada;
    private int escolha;


    public void exibirMenu() {
        System.out.println("1) Cadastro Cliente");
        System.out.println("2) Cadastro Loja");
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
                TelaCadastroCliente telaUsuario1 = new TelaCadastroCliente();
                telaUsuario1.cadastroCliente();
                break;
            case 2:
                TelaCadastroLoja telaLoja1 = new TelaCadastroLoja();
                telaLoja1.cadastroLoja();
                break;
            case 3:
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }

}

