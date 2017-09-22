/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;
import java.util.Scanner;
import server.controllers.ControllerPedido;
import server.model.ContaLoja;
import server.model.Loja;
/**
 *
 * @author tarcisio
 */
public class TelaMenuLoja {
    private final ContaLoja loja;
    private int escolha;
    private Scanner entrada;
    
    public TelaMenuLoja(ContaLoja loja){
        this.loja = loja;
    }
    
    public void exibirMenu(){
        while(true){
            System.out.println("1) Ver Cardapio");
            System.out.println("2) Editar Cardapio");
            System.out.println("3) Ver perfil");
            System.out.println("4) Editar Perfil");
            System.out.println("5) Novos pedidos");
            System.out.println("6) Sair");
            System.out.println("Digite uma opção:");
            lerEntrada();
            switchMenu();
            
        }
    }
    public void lerEntrada(){
        this.entrada = new Scanner(System.in);
        escolha = entrada.nextInt();
        System.gc();
    }
    public void switchMenu(){
        switch (this.escolha){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    verPerfil();
                    break;
                case 4:
                    break;
                case 5:
                    novosPedidos(); //verifica e modifica o status dos pedidos
                    break;
                case 6: 
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
    }
    
    public void novosPedidos(){
        ControllerPedido p = new ControllerPedido();
        p.novosPedidos(loja.getId()); //rodar o array de novos pedidos
        
    }
    
    public void verPerfil(){
        Loja l = loja.getLoja();
        System.out.println("Nome loja: " + l.getNome());
        System.out.println("Nome dono: " + l.getNomeDono());
        System.out.println("telefone: " + l.getTelefone());
        System.out.println("Login da loja: " + loja.getLogin());
    }
}
