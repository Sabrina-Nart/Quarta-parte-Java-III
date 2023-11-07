
package controller;

import abstratas.BaseDao;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Acessorios;

public class daoAcessorios extends BaseDao{
 
/////////////////////
    
    public int create(Acessorios acessorios) throws SQLException{
        
        String SQL="insert into acessorio (nome, descricao)" + " values(?,?)";
        
        return super.executeUpdate(SQL, 
                                acessorios.getNome(),
                                acessorios.getDescricao());
    }
    
/////////////////////
    
    public int update(Acessorios acessorios) throws SQLException{
        
        String SQL="update acessorio set nome=?,"
                                    + "descricao=? "
                                    + "where id=?";
        
        return super.executeUpdate(SQL, 
                                acessorios.getNome(),
                                acessorios.getDescricao(),
                                acessorios.getId());
    }
    
/////////////////////
    
    public int delete(Acessorios acessorios) throws SQLException{
        
        return super.executeUpdate("delete from acessorio where id=" + acessorios.getId());
    }
    
/////////////////////
    
    public Acessorios read(int id) throws SQLException{
        
        String SQL="select * from acessorio where id=?";
        
        ResultSet rs = super.executeQuery(SQL, id);
        
        return (rs.next() ? createObject(rs) : null);
    }     
    
//-----
    
    public List<Acessorios> read() throws SQLException{
        
        String SQL="select * from acessorio order by nome";
        
        ResultSet rs = super.executeQuery(SQL);
        
        List<Acessorios> retorno = new LinkedList<>();
        
        while(rs.next()){
            retorno.add(createObject(rs));
        }
        return retorno;
    }
    
//-----
    
    public List<Acessorios> read(String filtroNome) throws SQLException{
        
        String SQL="select * from acessorio where nome like ? order by nome";
        
        ResultSet rs = super.executeQuery(SQL, "%" + filtroNome.toUpperCase() + "%");
        
        List<Acessorios> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        
        return retorno;
    }  
    
/////////////////////
    
    private Acessorios createObject(ResultSet rs) throws SQLException{
        
        return new Acessorios(rs.getInt("id"), 
                             rs.getString("nome"),
                          rs.getString("descricao")
        );
    }  
    
/////////////////////         
}
