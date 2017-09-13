
package server.views;

import java.util.Scanner;
import server.DAO.PedidoDAO;
import server.model.Pedido;

public class TelaMenuPedidoCliente {
    PedidoDAO banco = new PedidoDAO();
    private int idPedido;
    private Scanner entrada;
    private int escolha;
    
    private int getId(){
        return this.idPedido;
    }
    
    private void setId(int id){
        this.idPedido = id;
    }
    
    
    public void exibirMenu(){
       while(true){
           System.out.println("1) Fazer pedido");
           System.out.println("2) Checar pedido");
           System.out.println("3) Sair");
           System.out.print("Digite uma opção:");
           lerEntrada();
           switchMenu();
       }
   }
    public void lerEntrada(){
        this.entrada = new Scanner(System.in);
        this.escolha = entrada.nextInt();
        System.gc();
    }
    public void switchMenu(){
        switch (this.escolha){
               case 1:
                   fazerPedido();
                   break;
               case 2:
                   checarPedido(idPedido);
                   break;
               case 3:
                   return;

               default:
                   System.out.println("Opção inválida");
                   break;
           }
    }
    
    
    private void fazerPedido(){
        
        
        
        System.out.print("Cod. Produto: ");
        
        //Pedido pedido = new Pedido(cliente, produto);
       // banco.enviarPedido(pedido);
    }
    
    
    
    private Pedido checarPedido(int idPedido){
        
        return banco.buscarPedido(idPedido);
    }
}
