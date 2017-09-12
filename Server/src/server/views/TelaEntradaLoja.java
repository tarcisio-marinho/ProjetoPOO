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
    public void entradaLoja() {
        Scanner tec = new Scanner(System.in);
        int op;
        mostrar();
        
        op = entrada();
        switch (op) {
            case 1:
                TelaLoginLoja login = new TelaLoginLoja();
                login.telaLoginLoja();
                break;
            case 2:
                TelaCadastroLoja cadastro = new TelaCadastroLoja();
                cadastro.telaCadastroLoja();
                break;
            case 3:
                return;
            default:
                System.out.println("Opção invalida!");
        }
    }
    
    private void mostrar(){
        System.out.println("1 - LOGIN");
        System.out.println("2 - CADASTRAR");
        System.out.println("3 - VOLTAR");
        System.out.println("Digite a opção: ");
    }
    
    private int entrada(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
}
