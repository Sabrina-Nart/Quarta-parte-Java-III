
package abstratas;

abstract public class BasePessoa extends Base{
    
    private String cpf;   
    private String telefone;
    private String endereco;
    
////////////////////////////////
    
    public BasePessoa(){
        super();
        this.setCpf("000.000.000-00");
        this.setTelefone("(00)00000-0000");
        this.setEndereco("SEM ENDEREÇO");
    }

    public BasePessoa(int id, String nome, String cpf, String telefone, String endereco) {
        super(id, nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
    }
    
////////////////////////////////
    
    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "000.000.000-00" : cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "(00)00000-0000" : telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "SEM ENDEREÇO" : endereco;
    }
    
////////////////////////////////
    
    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }
////////////////////////////////     
}
