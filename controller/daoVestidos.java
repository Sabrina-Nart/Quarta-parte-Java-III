
package controller;

import abstratas.BaseDao;
import enums.Cores;
import enums.Tamanho;
import enums.Categoria;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Vestidos;

public class daoVestidos extends BaseDao{
    
/////////////////////
    
    public int create(Vestidos vestidos) throws SQLException{
        
        String SQL="insert into vestido (cor, tamanho, categoria, descricao)"
                    + " values (?,?,?,?)";
        
        return super.executeUpdate(SQL, 
                                  vestidos.getCores().name(),
                                  vestidos.getTamanho().name(),
                                  vestidos.getCategoria().name(),
                                  vestidos.getDescricao());        
    }
    
/////////////////////   
      
    public int update(Vestidos vestidos) throws SQLException{
        String SQL="update cliente set cor=?,"
                                     + "tamanho=?,"
                                     + "categoria=?,"
                                     + "descricao=?,"
                                     + "where id=?";
        
        return super.executeUpdate(SQL, 
                                  vestidos.getCores().name(),
                                  vestidos.getTamanho().name(),
                                  vestidos.getCategoria().name(),
                                  vestidos.getDescricao());  

    }
    
/////////////////////
    
    public int delete(Vestidos vestidos) throws SQLException{
        
        String SQL="delete from vestido where id=" + vestidos.getId();
        
        return super.executeUpdate(SQL);
    }
    
/////////////////////
    
    public Vestidos read(int id) throws SQLException{
        
        String SQL="select * from vestido where id=" + id;
        
        ResultSet rs = super.executeQuery(SQL);
        
        return (rs.next() ? createObject(rs) : null);
    }
    
//-----
    
    public List<Vestidos> read() throws SQLException{
        
        String SQL="select * from vestido order by descricao";
        
        ResultSet rs = super.executeQuery(SQL);
        
        List<Vestidos> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        
        return retorno;
    }
    
//-----
    
    public List<Vestidos> read(String filtroDescricao) throws SQLException{
        
        String SQL="select * from vestido where descricao like ? order by descricao";
        
        ResultSet rs = super.executeQuery(SQL, "%" + filtroDescricao.toUpperCase() + "%");
        
        List<Vestidos> retorno = new LinkedList<>();
        
        while (rs.next()){
            retorno.add(createObject(rs));
        }
        return retorno;
    }  
    
/////////////////////
    
    private Vestidos createObject(ResultSet rs) throws SQLException {
        
        return new Vestidos(
                            rs.getInt("id"), 
                            Cores.valueOf(rs.getString("cor")),
                            Tamanho.valueOf(rs.getString("tamanho")),
                            Categoria.valueOf(rs.getString("categoria")),
                            rs.getString("descricao")
        );
    }  
    
/////////////////////        
}
