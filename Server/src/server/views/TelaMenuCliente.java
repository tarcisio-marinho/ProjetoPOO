package server.views;

import java.util.Scanner;
import server.controllers.ADSAADS;
import server.model.Cliente;
import server.model.ContaCliente;

public class TelaMenuCliente { 
    private ADSAADS controllerC;
    private int idPedido;
    private Scanner entrada;
    private int escolha;
    private ContaCliente c;
    
    TelaMenuCliente(ContaCliente c) {
        controllerC = new ADSAADS();
        this.c = c;
        this.escolha = 0;
    }
    
    private int getId(){
        return this.idPedido;
    }
    
    private void setId(int id){
        this.idPedido = id;
    }
    
    public void exibirMenu(){
       while(this.escolha!=4){
           System.out.println("1) Ver Lojas");
           System.out.println("2) Checar seus pedidos");
           System.out.println("3) Ver Seu Perfil");
           System.out.println("4) Sair");
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
               TelaVisualizarLojasCliente tvl = new TelaVisualizarLojasCliente(); //criar uma variavel apenas para chamar as telas, pode ser outro nome
                break;
            case 2:
                //checarPedido(idPedido);
                break;
            case 3:
                //verPerfil();
                //break;
            case 4:
                return;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
    
    
    
}
