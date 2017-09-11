
package server.views;

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner scanner;
    private int op;
    
	public void showThisMenu() {
        
        System.out.println("1 - USUARIO");
        System.out.println("2 - LOJA");
        System.out.println("3 - SAIR");
        System.out.print("DIGITE A OPÇÃO: ");           
        
    }
	
	
	
	public void getOption() {
		scanner = new Scanner(System.in);
		this.op = scanner.nextInt();
		scanner.close();
		System.gc();
	}
	
	
	
	public void switchMenu() {

        switch (this.op) {
            
        	case 1:
                TelaEntradaUsuario telaUsuario = new TelaEntradaUsuario();
                telaUsuario.telaEntradaUsuario1();
                break;
            
        	case 2:
                TelaEntradaLoja telaLoja = new TelaEntradaLoja();
                telaLoja.telaEntradaLoja1();
                break;
            
        	case 3: 
                break;
            
        	default:
                System.out.println("Opção invalida!");
                break;   
        }
	} 
	
	
}
