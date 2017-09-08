# UnicapProjetoPOO
Projeto para cadeira de Orientação a objetos



# OBJETIVOS DO SERVIDOR

- [ ] Banco de dados para armazenar os dados recebidos da API

- [ ] fazer uma API para troca de dados

- [ ] cadastrar-se no sistema 

    - usuáio (POST): -Nome -Email -telefone -Senha
    
    - loja (POST): -Nome_loja -Nome_dono -Descricao_loja -Produtos -Telefone

- [ ] funções do usuário: 

    - listar todas as lojas (GET)
    
	- procurar por um tipo especifico de comida (GET)
    
	- fazer pedido(POST): 
		-itens do pedido -tempo que ele vai levar para chegar 
   	        
		-forma de pagamento 
		
		-se for em dinheiro -> troco? 
		
		-notificação pedido pronto/recusado para usuario
   	        
		-avaliação da operacao 
   
      - log de pedidos (GET): -data -loja -preço
    
	- chat para conversar com a loja (GET)

- [ ] funções da loja:
   
	 - abrir loja (GET)

	 - fornecer os produtos da loja (POST)
    
	 - alteração nos produtos (POST)
   
	 - pilha dos pedidos em andamento(GET)/local ????
 
  	 - produtos feitos/concluidos (GET)
  
         - fatura do dia (GET)

    	 - receber novo pedido: 
	 	
		*aceitar: estimativa de tempo para entrega 
	      
	        *negar: falta de engred, prodturo fora de estoque, loja fechando
    
   
         - concluir pedido (POST) 

