
package model;

import abstratas.BasePessoa;
import enums.Sexo;

public class Cliente extends BasePessoa{
    
    private Sexo sexo;
    
/////////////////////
    
    public Cliente() {
        
        super();
        this.setSexo(sexo.F);
    }
    
/////////////////////
    
    public Cliente(int id, String nome, String cpf, String telefone, String endereco, Sexo sexo) {
        
        super(id, nome, cpf, telefone, endereco);
        this.setSexo(sexo);
    }
    
/////////////////////
    
    public void setSexo(Sexo sexo) {
        
        this.sexo = sexo;
    }
    
/////////////////////
    
    public Sexo getSexo() {
        
        return this.sexo;
    }
   
/////////////////////    
}
