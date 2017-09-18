/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.Scanner;
import server.model.ContaCliente;

/**
 *
 * @author users
 */
public class TelaLojaSelecionadaCliente {
    private int idPedido;
    private Scanner entrada;
    private int escolha;
    private ContaCliente c;
    private String idLoja;
    private boolean op;
     public void exibirMenu(){
       while(this.escolha!=4){
           //chamar todas as lojas do banco e printar;
           System.out.println("1) Exibir Cardapio da Loja");
           System.out.println("2) Exibir Perfil da Loja");
           System.out.println("3) Voltar");
           System.out.print("Digite uma opção:");
           lerEntrada();
           switchMenu();
           
       }
   }
    private void lerEntrada(){
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        System.gc();
    }
    public void telaLojaSelecionada(String id){
        this.idLoja= id;
        exibirMenu();
    
    }
    public void switchMenu(){
        switch (this.escolha){
               case 1:
                   //chama classe cardapio passando ID
                   break;
               case 2:
                   //chama classe para exibir dados da loja passando ID
                   break;
               case 3:
                   break;
               default:
                   System.out.println("Opção invalida!");
                   break;
           }
    }
    
}
