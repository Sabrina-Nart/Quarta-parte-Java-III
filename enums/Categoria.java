
package enums;

public enum Categoria {
    
    VL("Vestido Longo R$ 299,99"),
    VC("Vestido Curto R$ 186,00"),
    VM("Vestido Midi R$ 205,99"),
    VP("Vestido 15 anos R$ 399,99"),
    VI("Vestido Infantil 150,00");
    
    private String descricao;
    
///////////////////// 
    
    private Categoria(String descricao) {
        this.descricao = descricao;
    }
    
///////////////////// 
    
    @Override
    public String toString() {    
        return descricao;
    }
    
/////////////////////     
}
