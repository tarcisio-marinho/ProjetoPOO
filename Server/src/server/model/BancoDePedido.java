
package server.model;

import java.util.ArrayList;

public class BancoDePedido {
    
    private String id;
    private ArrayList<Pedido> todosPedidos;

    
    public String getId(){
        return this.id;
    }
    
    public ArrayList<Pedido> buscaNovosPedidos(){
        ArrayList<Pedido> novos = null;
        for (Pedido pedido : todosPedidos){
            if(pedido.isStatusVisualizado() == false){
                pedido.setStatusVisualizado();
                novos.add(pedido);
            }
        }
        return novos;
    }
    
    public Pedido buscarPedido(String id){
        for(Pedido p : todosPedidos){
            if(id.equals(p.getId())){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Pedido> getTodosPedidos() {
            return this.todosPedidos;
    }

    public void addPedido(Pedido pedido) {
            this.todosPedidos.add(pedido);
    }

    public void removerPedido(String id) {
        for(Pedido pedido : todosPedidos) {
            if(pedido.getId().equals(id)) {
                todosPedidos.remove(pedido);
                break;
            }
        }
    }
    
    public void setPedidoPronto(String id){
        for (Pedido p : todosPedidos){
            if(p.getId().equals(id)){
                p.setStatusPronto();
            }
        }
    }
    
    public boolean isPedidoPronto(String id){
        for (Pedido p : todosPedidos){
            if(id.equals(p.getId())){
                return p.isStatusPronto();
            }
        }
        return false;
    }
    
    public void setPedidoEntregue(String id){
        for (Pedido p : todosPedidos){
            if(id.equals(p.getId())){
                p.setStatusEntregue();
                removerPedido(id);
            }
        }
    }
}
