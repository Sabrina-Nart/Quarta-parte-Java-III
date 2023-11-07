
package model;

import java.time.LocalDate;
import model.SwingColumn;

public class Locacao {
    
    @SwingColumn(description = "Código")
    private int id;
    @SwingColumn(description = "Cliente")
    private Cliente cliente;   
    private Funcionario funcionario;
    @SwingColumn(description = "Total do Vestido")
    private double total_vestido;
    @SwingColumn(description = "Total do Acessório")
    private double total_acessorios;    
    @SwingColumn(description = "Total do Acessório")
    private String evento;
    @SwingColumn(description = "Data de Retirada")
    private LocalDate data_retirada;
    @SwingColumn(description = "Data de Entrega")
    private LocalDate data_entrega;
    
/////////////////////   
    
    public Locacao(){
        
        this.setId(0);
        this.setCliente(null);
        this.setFuncionario(null);
        this.setTotalVestidos(0);
        this.setTotalAcessorios(0);
        this.setEvento("VÁZIO");
        this.setDataRetirada(null);
        this.setDataEntrega(null);
    }
    
/////////////////////   
    
    public Locacao(int id, Cliente cliente, Funcionario funcionario, double total_vestido, double total_acessorios, String evento, LocalDate data_retirada, LocalDate data_entrega) {
        
        this.setId(id);
        this.setCliente(cliente);
        this.setFuncionario(funcionario);
        this.setTotalVestidos(total_vestido);
        this.setTotalAcessorios(total_acessorios);
        this.setEvento(evento);
        this.setDataRetirada(data_retirada);
        this.setDataEntrega(data_entrega);
    }
    
/////////////////////   
    
    public void setId(int id) {
        
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        
        this.cliente = cliente;
    }

    public void setFuncionario(Funcionario funcionario) {
        
        this.funcionario = funcionario;
    }

    public void setTotalVestidos(double total_vestido) {
        
        this.total_vestido = total_vestido < 0 ? 0 : total_vestido;
    }

    public void setTotalAcessorios(double total_acessorios) {
        
        this.total_acessorios = total_acessorios < 0 ? 0 : total_acessorios;
    }

    public void setEvento(String evento) {
        
        this.evento = evento.trim().isEmpty() ? "VÁZIO" : evento.toUpperCase();
    }

    public void setDataRetirada(LocalDate data_retirada) {
        
        this.data_retirada = data_retirada == null ? LocalDate.now() : data_retirada;
    }

    public void setDataEntrega(LocalDate data_entrega) {
        
        this.data_entrega = data_entrega == null ? LocalDate.now() : data_entrega;
    }
    
/////////////////////   
    
    public int getId() {
        return this.id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public double getTotal_vestido() {
        return this.total_vestido;
    }

    public double getTotal_acessorios() {
        return this.total_acessorios;
    }

    public String getEvento() {
        return this.evento;
    }

    public LocalDate getData_retirada() {
        return this.data_retirada;
    }

    public LocalDate getData_entrega() {
        return this.data_entrega;
    }
    
/////////////////////   
    
    @Override
    public String toString() {
        return "Locacao{" + "id=" + id + ", cliente=" + cliente + ", data_retirada=" + data_retirada + ", data_entrega=" + data_entrega + '}';
    }
    
/////////////////////   
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Locacao other = (Locacao) obj;
        return this.id == other.id;
    }
    
/////////////////////       
}
