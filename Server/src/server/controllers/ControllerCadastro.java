
package server.controllers;

import server.DAO.CadastroDAO;
import server.model.ContaCliente;
import server.model.ContaLoja;


public class ControllerCadastro {

    private CadastroDAO dao;

    public boolean cadastrar(ContaCliente contaCliente){
        boolean retorno;
        retorno = dao.existe(contaCliente);
        if(retorno == false){
            dao.add(contaCliente);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean cadastrar(ContaLoja contaLoja){
        boolean retorno;
        retorno = dao.existe(contaLoja);
        if(retorno == false){
            dao.add(contaLoja);
            return true;
        }else{
            return false;
        }
    }
    
    public String getIdNovaLoja(){ //usa o dao para descobrir quantas lojas existem
        
        String id;
        
        if(dao.qtdLojas()+1<1000){ //pensar numa forma melhor 
            id=Integer.toString(dao.qtdLojas()+1);
            if(id.length()==2){
                id= "0" + id;
            }else if(id.length()==1){
                id= "00" + id;
            }
            return id;  
        }
        return null;
    }
}
