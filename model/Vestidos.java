
package model;

import enums.Categoria;
import enums.Cores;
import enums.Tamanho;
import model.SwingColumn;

public class Vestidos implements java.io.Serializable{
    
    @SwingColumn(description = "Código")
    private int id;  
    @SwingColumn(description = "Cor")
    private Cores cores;
    @SwingColumn(description = "Tamanho")
    private Tamanho tamanho;
    @SwingColumn(description = "Categoria")
    private Categoria categoria;
    @SwingColumn(description = "Descrição")
    private String descricao;
    
/////////////////////
    
    public Vestidos() {
        this.setId(0);
        this.setCores(cores.A);
        this.setTamanho(tamanho.P);
        this.setCategoria(categoria.VC);
        this.setDescricao("VÁZIO");
    }
    
/////////////////////
    
    public Vestidos(int id, Cores cores, Tamanho tamanho, Categoria categoria, String descricao) {
        
        this.setId(id);
        this.setCores(cores);
        this.setTamanho(tamanho);
        this.setCategoria(categoria);
        this.setDescricao(descricao);
    }
    
/////////////////////
    
    public void setId(int id) {
        
        this.id = id;
    }

    public void setCores(Cores cores) {
        
        this.cores = cores;
    }

    public void setTamanho(Tamanho tamanho) {
        
        this.tamanho = tamanho;
    }

    public void setCategoria(Categoria categoria) {
        
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao.trim().isEmpty() ? "VÁZIO" : descricao.toUpperCase();
    }
    
/////////////////////
    
    public int getId() {
        
        return this.id;
    }

    public Cores getCores() {
        
        return this.cores;
    }

    public Tamanho getTamanho() {
        
        return this.tamanho;
    }

    public Categoria getCategoria() {
        
        return this.categoria;
    }

    public String getDescricao() {
        
        return this.descricao;
    }
    
/////////////////////
    
    @Override
    public String toString() {
        return "Vestidos{" + "id=" + id + ", cores=" + cores + ", tamanho=" + tamanho + ", categoria=" + categoria + '}';
    }
    
/////////////////////
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vestidos other = (Vestidos) obj;
        return this.id == other.id;
    }
    
/////////////////////    
}
