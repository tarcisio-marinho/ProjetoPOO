/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.model;

public class Desconto30 implements StrategyDescontoProduto{

    @Override
    public void aplicar(Produto produto) {
        double preco = produto.getPreco();
        produto.setPreco(preco * 0.7);
    }
    
}
