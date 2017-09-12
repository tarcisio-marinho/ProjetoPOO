/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;
import java.util.Scanner;
import server.model.Loja;
/**
 *
 * @author tarcisio
 */
public class TelaMenuLoja {
    private final Loja loja;
    
    public TelaMenuLoja(Loja loja){
        this.loja = loja;
    }
    
    public void exibirMenu(){
        while(true){
            System.out.println("1) Novos pedidos");
            System.out.println("2) Ver perfil");
            System.out.println("3) Sair");
            System.out.println("Digite uma opção:");
            Scanner s = new Scanner(System.in);
            int op;
            op = s.nextInt();
            switch (op){
                case 1:
                    novosPedidos();
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
    
    public void novosPedidos(){
        
    }
    
    public void verPerfil(){
        System.out.println("Nome loja: " + loja.getNome());
        System.out.println("Nome dono: " + loja.getNomeDono());
        System.out.println("telefone: " + loja.getTelefone());
        System.out.println("Login da loja: " + loja.getLogin());
    }
}
