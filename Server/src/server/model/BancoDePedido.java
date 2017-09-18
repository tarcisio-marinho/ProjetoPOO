
package server.model;

import java.util.ArrayList;

public class BancoDePedido {
    
    private String id;
    private ArrayList<Pedido> todosPedidos;

    public ArrayList<Pedido> novosPedidos(){
        ArrayList<Pedido> novos = null;
        for (Pedido pedido : todosPedidos){
            if(pedido.isStatusVisualizado() == false){
                novos.add(pedido);
            }
        }
        return novos;
    }

    public BancoDePedido(String id) {	
            this.id = id;
            this.todosPedidos = new ArrayList<>();
    }

    public String getId() {
            return this.id;
    }

    public ArrayList<Pedido> getTodosPedidos() {
            return this.todosPedidos;
    }

    public void addPedido(Pedido pedido) {
            this.todosPedidos.add(pedido);
    }

    public boolean removePedido(String id) {
        boolean objeto = false;
        for(Pedido pedido : todosPedidos) {
            if(pedido.getId().equals(id)) {
                objeto = todosPedidos.remove(pedido);
            }
        }
        return objeto;		
    }
}
