
package novo.model;

import java.util.ArrayList;

public class ProdutoCombo extends Produto{
    private ArrayList<ProdutoSimples> produtos;
    
    public ProdutoCombo(String nome, String descricao, String id, double preco) {
        super(nome, descricao, id, preco);
        produtos = new ArrayList<>();
    }
    
    public void inserirProduto(ProdutoSimples prod){
        produtos.add(prod);
    }
    
    public void retirarProduto(ProdutoSimples prod){
        produtos.remove(prod);
    }

    public double getPreco(){
        double valor = 0;
        for (ProdutoSimples p : produtos){
            valor = valor + p.getPreco();
        }

        return valor;
    }
    
}
