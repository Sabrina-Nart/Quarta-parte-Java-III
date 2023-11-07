
package abstratas;

import banco.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

abstract public class BaseDao {
 
    private PreparedStatement getStatement(String SQL) throws SQLException{
            return ConexaoBanco.getConnection().prepareStatement(SQL);
    }
    
///////////////////////////////////
    
    protected int executeUpdate(String SQL,Object... args) throws SQLException{
        
        PreparedStatement pst = this.getStatement(SQL);
        
        for (int i = 0; i < args.length; i++) {
            pst.setObject((i+1), args[i]);
        }
        
        return pst.executeUpdate();
    }
    
///////////////////////////////////
    
    protected ResultSet executeQuery(String SQL,Object... args) throws SQLException{
       
        PreparedStatement pst = this.getStatement(SQL);
        
        for (int i = 0; i < args.length; i++) {
            pst.setObject((i+1), args[i]);
        }
        
        return pst.executeQuery();
    }  
    
///////////////////////////////////    
}
