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
public class TelaEntradaCliente {
    private Scanner entrada;
    private int escolha;
    public void exibirMenu() {
        System.out.println("1 - LOGIN");
        System.out.println("2 - CADASTRAR");
        System.out.println("3 - VOLTAR");
        System.out.println("Digite a opção: ");
    }
    public void lerEntrada(){
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        System.gc();
    }
    public void switchMenu(){
        switch (this.escolha) {
            case 1:
                TelaLoginCliente tela1 = new TelaLoginCliente();
                tela1.loginCliente();
                break;
            case 2:
                TelaCadastroCliente tela2 = new TelaCadastroCliente();
                tela2.CadastroCliente();
                break;
            case 3:
                return;
            default:
                System.out.println("Opção invalida!");
                break;            
        }
    }
}
