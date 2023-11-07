
package controller;

import abstratas.BaseDao;
import enums.Estado;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import model.Cidade;

public class daoCidade extends BaseDao{
 
/////////////////////
    
    public int create(Cidade cidade) throws SQLException{
        
        String SQL="insert into cidade (nome, estado)" + " values(?,?)";
        
        return super.executeUpdate(SQL, 
                                cidade.getNome(),
                                cidade.getEstado().name());
    }
    
/////////////////////
    
    public int update(Cidade cidade) throws SQLException{
        
        String SQL="update cidade set nome=?,"
                                    + "estado=? "
                                    + "where id=?";
        
        return super.executeUpdate(SQL, 
                                cidade.getNome(),
                                cidade.getEstado().name());
    }
    
/////////////////////
    
    public int delete(Cidade cidade) throws SQLException{
        
        return super.executeUpdate("delete from cidade where id=" + cidade.getId());
    }
    
/////////////////////
    
    public Cidade read(int id) throws SQLException{
        
        String SQL="select * from cidade where id=?";
        
        ResultSet rs = super.executeQuery(SQL, id);
        
        return (rs.next() ? createObject(rs) : null);
    }     
    
//-----
    
    public List<Cidade> read() throws SQLException{
        
        String SQL="select * from cidade order by nome";
        
        ResultSet rs = super.executeQuery(SQL);
        
        List<Cidade> retorno = new LinkedList<>();
        
        while(rs.next()){
            retorno.add(createObject(rs));
        }
        return retorno;
    }
    
/////////////////////
    
    private Cidade createObject(ResultSet rs) throws SQLException{
        
        return new Cidade(rs.getInt("id"), 
                        rs.getString("nome"),
                       Estado.valueOf(rs.getString("estado"))
        );
    }  
    
/////////////////////    
}
