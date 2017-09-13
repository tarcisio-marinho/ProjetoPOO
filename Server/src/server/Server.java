package server;

import server.views.MenuPrincipal;
public class Server {

    public static void main(String[] args) {
        
        MenuPrincipal menu = new MenuPrincipal();
        
        menu.exibirMenu();
        menu.lerEntrada();
        menu.switchMenu();
    }

}
