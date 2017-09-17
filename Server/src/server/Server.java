package server;

import server.views.MenuPrincipal;
public class Server {

    public static void main(String[] args) {
        
        MenuPrincipal menu = new MenuPrincipal();
        while(menu.getOpcao() != 3){
            menu.exibirMenu();    
        }
    }
}
