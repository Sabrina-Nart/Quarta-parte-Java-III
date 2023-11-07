
package model;

import abstratas.Base;
import enums.Estado;

public class Cidade extends Base{
    
    private Estado estado;
    
/////////////////////
    
    public Cidade() {
        
        super();
        this.setEstado(Estado.SC);
    }
    
/////////////////////
    
    public Cidade(int id, String nome, Estado estado) {
        
        super(id, nome);
        this.setEstado(estado);
    }
    
/////////////////////
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
/////////////////////
    
    public Estado getEstado() {
        return this.estado;
    }
    
/////////////////////    
}
