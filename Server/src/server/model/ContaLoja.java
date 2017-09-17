package server.model;

public class ContaLoja extends Conta{

	private int id;
	private Cardapio cardapio;
	
	public ContaLoja(int id, String login, String senha) {
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Cardapio getCardapio() {
		return cardapio;
	}
	
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	public String emString() {
		String info = "";
		
		info += "\nID: " + this.id;
		info += "\nCARDAPIO: \n" + cardapio.getProdutos().toString();
		
		return info;
		
	}
		
}
