/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.model;

/**
 *
 * @author users
 */
public class NovoClass {
   
    private StrategyDescontoProduto desconto;
    private Produto produto = new ProdutoSimples("dnfj","kdnfjdf","kjdnkfj",373);
    
    void a (){
        if(true){
            desconto = new Desconto10();
            this.desconto.aplicar(produto);
        }else{
            desconto = new Desconto30();
            this.desconto.aplicar(produto);
        }
    }

    void desconto(){
        this.desconto.aplicar(produto);
    }
}
