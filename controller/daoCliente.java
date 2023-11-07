
package controller;

import abstratas.BaseDao;
import enums.Sexo;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Cliente;

public class daoCliente extends BaseDao{
    
/////////////////////
    
    public int create(Cliente cliente) throws SQLException{
        
        String SQL="insert into cliente (nome, cpf, telefone, endereco, sexo)"
                    + " values (?,?,?,?,?)";
        
        return super.executeUpdate(SQL, 
                                  cliente.getNome(),
                                  cliente.getCpf(),
                                  cliente.getTelefone(),
                                  cliente.getEndereco(),
                                  cliente.getSexo().name());        
    }
    
/////////////////////   
      
    public int update(Cliente cliente) throws SQLException{
        String SQL="update cliente set nome=?,"
                                     + "cpf=?,"
                                     + "telefone=?,"
                                     + "endereco=?,"
                                     + "sexo=? "
                                     + "where id=?";
        
        return super.executeUpdate(SQL, 
                                  cliente.getNome(),
                                  cliente.getCpf(),
                                  cliente.getTelefone(),
                                  cliente.getEndereco(),
                                  cliente.getSexo().name(),
                                  cliente.getId());  

    }
    
/////////////////////
    
    public int delete(Cliente cliente) throws SQLException{
        
        String SQL="delete from cliente where id=" + cliente.getId();
        
        return super.executeUpdate(SQL);
    }
    
/////////////////////
    
    public Cliente read(int id) throws SQLException{
        
        String SQL="select * from cliente where id=" + id;
        
        ResultSet rs = super.executeQuery(SQL);
        
        return (rs.next() ? createObject(rs) : null);
    }
    
//-----
    
    public List<Cliente> read() throws SQLException{
        
        String SQL="select * from cliente order by nome";
        
        ResultSet rs = super.executeQuery(SQL);
        
        List<Cliente> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        
        return retorno;
    }
    
//-----
    
    public List<Cliente> read(String filtroNome) throws SQLException{
        
        String SQL="select * from cliente where nome like ? order by nome";
        
        ResultSet rs = super.executeQuery(SQL,"%"+filtroNome.toUpperCase()+"%");
        
        List<Cliente> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        return retorno;
    }  
    
/////////////////////
    
    private Cliente createObject(ResultSet rs) throws SQLException {
        return new Cliente(
                            rs.getInt("id"), 
                            rs.getString("nome"), 
                            rs.getString("cpf"), 
                            rs.getString("telefone"), 
                            rs.getString("endereco"), 
                            Sexo.valueOf(rs.getString("sexo"))
        );
    }  
    
/////////////////////    
}
