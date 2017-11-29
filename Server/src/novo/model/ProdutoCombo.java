/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.model;

import java.util.ArrayList;

/**
 *
 * @author users
 */
public class ProdutoCombo extends Produto{
    private ArrayList<ProdutoSimples> produtos;
    public ProdutoCombo(String nome, String descricao, String id, double preco) {
        super(nome, descricao, id, preco);
        produtos = new ArrayList<>();
    }
    
    public void inserirProduto(ProdutoSimples prod){
        produtos.add(prod);
        this.setPreco(this.getPreco() + prod.getPreco());
    }
    
    public void retirarProduto(ProdutoSimples prod){
        produtos.remove(prod);
    }
    
}
