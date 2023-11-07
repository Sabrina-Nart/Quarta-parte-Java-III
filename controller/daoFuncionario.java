
package controller;

import abstratas.BaseDao;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Funcionario;

public class daoFuncionario extends BaseDao{
    
/////////////////////
    
    public int create(Funcionario funcionario) throws SQLException{
        
        String SQL="insert into funcionario (nome, cpf, telefone, endereco, data_contratacao, funcao)"
                    + " values (?,?,?,?,?,?)";
        
        return super.executeUpdate(SQL, 
                                  funcionario.getNome(),
                                  funcionario.getCpf(),
                                  funcionario.getTelefone(),
                                  funcionario.getEndereco(),
                                  funcionario.getDataContratacao(),
                                  funcionario.getFuncao());        
    }
    
/////////////////////   
      
    public int update(Funcionario funcionario) throws SQLException{
        String SQL="update cliente set nome=?,"
                                     + "cpf=?,"
                                     + "telefone=?,"
                                     + "endereco=?,"
                                     + "data_contratacao=?,"
                                     + "funcao "
                                     + "where id=?";
        
        return super.executeUpdate(SQL, 
                                  funcionario.getNome(),
                                  funcionario.getCpf(),
                                  funcionario.getTelefone(),
                                  funcionario.getEndereco(),
                                  funcionario.getDataContratacao(),
                                  funcionario.getFuncao());    

    }
    
/////////////////////
    
    public int delete(Funcionario funcionario) throws SQLException{
        
        String SQL="delete from funcionario where id=" + funcionario.getId();
        
        return super.executeUpdate(SQL);
    }
    
/////////////////////
    
    public Funcionario read(int id) throws SQLException{
        
        String SQL="select * from funcionario where id=" + id;
        
        ResultSet rs = super.executeQuery(SQL);
        
        return (rs.next() ? createObject(rs) : null);
    }
    
//-----  
    
    public List<Funcionario> read() throws SQLException{
        
        String SQL="select * from funcionario order by nome";
        
        ResultSet rs = super.executeQuery(SQL);
        
        List<Funcionario> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        
        return retorno;
    }
//-----
    
    public List<Funcionario> read(String filtroNome) throws SQLException{
        
        String SQL="select * from funcionario where nome like ? order by nome";
        
        ResultSet rs = super.executeQuery(SQL,"%"+filtroNome.toUpperCase()+"%");
        
        List<Funcionario> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        return retorno;
    }  
    
/////////////////////
    
    private Funcionario createObject(ResultSet rs) throws SQLException {
        
        return new Funcionario(
                            rs.getInt("id"), 
                            rs.getString("nome"), 
                            rs.getString("cpf"), 
                            rs.getString("telefone"), 
                            rs.getString("endereco"), 
                            rs.getDate("data_contratacao").toLocalDate(), 
                            rs.getString("funcao")
        );
    }  
    
/////////////////////      
}
