/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;
import java.util.Scanner;
import server.model.Cliente;
/**
 *
 * @author tarcisio
 */
public class TelaMenuCliente {
    private Cliente c;
    Scanner n = new Scanner(System.in);
    int escolha;
    
    public TelaMenuCliente(Cliente c){
        this.c = c;
    }
    
    public void exibirMenu(){
        while(true){
            System.out.println("1) realizar pedido");
            System.out.println("2) Ver perfil");
            System.out.println("3) Sair");
            escolha = n.nextInt();
            switch(escolha){
                case 1:
                    fazerPedido();
                    break;

                case 2:
                    verPerfil();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        
    }
    
    public void fazerPedido(){
        
    }
    
    public void verPerfil(){
        System.out.println("Login: " + c.getLogin());
        System.out.println("Nome" + c.getNome());
        System.out.println("Telefone: " + c.getTelefone());
    }
    

}