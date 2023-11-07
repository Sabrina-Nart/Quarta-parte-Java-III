
package enums;

public enum Estado {
    
    SC("Santa Catarina"),
    RS("Rio Grande do Sul"),
    PR("Paraná"),;
    
    private String descricao;
    
/////////////////////
    
    private Estado(String descricao) {
        this.descricao = descricao;
    }
    
/////////////////////
    
    @Override
    public String toString() {
        return descricao;
    }
    
/////////////////////    
}
