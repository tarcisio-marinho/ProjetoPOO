
package novo.model;

public class ItemDeVenda{

    private int quantidade;
    private Produto produto;

    public ItemDeVenda(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPreco(){
        return quantidade * produto.getPreco();
    }
}