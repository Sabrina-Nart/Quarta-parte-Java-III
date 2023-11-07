
package model;

import abstratas.Base;

public class Acessorios extends Base{
    
    private String descricao;
    
/////////////////////
    
    public Acessorios() {
        
        super();
        this.setDescricao("VÁZIO");
    }
    
/////////////////////
    
    public Acessorios(int id, String nome, String descricao) {
        
        super(id, nome);
        this.descricao = descricao;
    }
    
/////////////////////
    
    public void setDescricao(String descricao) {
        
        this.descricao = descricao.trim().isEmpty() ? "VÁZIO" : descricao.toUpperCase();
    }
    
/////////////////////
    
    public String getDescricao() {
        
        return this.descricao;
    }
    
/////////////////////        
}
