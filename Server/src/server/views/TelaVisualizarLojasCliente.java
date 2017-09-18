/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.views;

import java.util.ArrayList;
import java.util.Scanner;
import server.model.ContaCliente;
import server.model.Loja;

/**
 *
 * @author users
 */


public class TelaVisualizarLojasCliente {
    private int idPedido;
    private Scanner entrada;
    private int escolha;
    private String idLoja;
    private boolean op;
    private ArrayList <Loja> l;
    
    public void exibirMenu(){
       while(this.escolha!=4){
           //chamar todas as lojas do banco e printar;
           System.out.println("1) Selecionar Loja");
           System.out.println("2) Voltar");
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
    public void switchMenu(){
        switch (this.escolha){
               case 1:
                   System.out.println("Digite o ID da loja:");
                   op = lerEntradaIDLoja();
                   if(op == true){
                       //passa para proxima tela passando o ID da loja
                   }
                   else{
                       //fica nessa tela 
                   }
                   break;
               case 2:
                   
                   break;
               default:
                   System.out.println("Opção inválida");
                   break;
           }
    }
    public boolean lerEntradaIDLoja(){
        this.entrada = new Scanner(System.in);
        idLoja = entrada.next();
        //Validações(se tem 3 numeros e se existe esse id no banco);
        //if validação correta, retorna true, se não retorna falso;
        return true; //<<apenas para não dar erro!
    }
    
   
    
}
