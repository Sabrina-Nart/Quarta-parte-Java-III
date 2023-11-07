
package model;

import abstratas.BasePessoa;
import java.time.LocalDate;


public class Funcionario extends BasePessoa{
    
    private LocalDate data_contratacao;
    private String funcao;
    
/////////////////////    
    
    public Funcionario(LocalDate data_contratacao, String funcao) {
        
        super();
        this.setDataContratacao(null);
        this.setFuncao("AJUDANTE");
    }

    public Funcionario(int id, String nome, String cpf, String telefone, String endereco, LocalDate data_contratacao, String funcao) {
        
        super(id, nome, cpf, telefone, endereco);
        this.setDataContratacao(data_contratacao);
        this.setFuncao(funcao);
    }
    
/////////////////////    
    
    public void setDataContratacao(LocalDate data_contratacao) {
        
        this.data_contratacao = data_contratacao == null ? LocalDate.now() : data_contratacao;
    }

    public void setFuncao(String funcao) {
        
        this.funcao = funcao.trim().isEmpty() ? "AJUDANTE" : funcao.toUpperCase();
    }
    
/////////////////////    
    
    public LocalDate getDataContratacao() {
        
        return this.data_contratacao;
    }

    public String getFuncao() {
        
        return this.funcao;
    }
    
/////////////////////        
}
