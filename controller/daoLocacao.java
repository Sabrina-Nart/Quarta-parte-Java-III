
package controller;

import abstratas.BaseDao;
import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import model.Locacao;

public class daoLocacao extends BaseDao{

    public int create(Locacao locacao) throws SQLException{
        
        String SQL="insert into locacao(id_cliente, id_funcionario, total_vestido, total_acessorios, evento, data_retirada, data_entrega)"
                            + "values (?,?,?,?,?,?,?)";
        
        super.executeUpdate(SQL, 
                locacao.getCliente().getId(),
                locacao.getFuncionario().getId(),
                locacao.getTotal_vestido(),
                locacao.getTotal_acessorios(),
                locacao.getEvento(),
                locacao.getData_retirada(),
                locacao.getData_entrega());

        ResultSet rs = super.executeQuery("select max (ID) from locacao");
        
        rs.next();
        
        return rs.getInt("max");        
    }
    
/////////////////////
    
    public int update(Locacao locacao) throws SQLException
    {
        String SQL="update locacao set id_cliente=?,"
                + "id_funcionario=?,"
                + "total_vestido=?,"
                + "total_acessorios=?,"
                + "evento=?,"
                + "data_retirada=?,"
                + "data_retirada=? where id=?";
        
        return super.executeUpdate(SQL, 
                locacao.getCliente().getId(),
                locacao.getFuncionario().getId(),
                locacao.getTotal_vestido(),
                locacao.getTotal_acessorios(),
                locacao.getEvento(),
                locacao.getData_retirada(),
                locacao.getData_entrega(),
                locacao.getId());
    }
    
/////////////////////
    
    public int delete(Locacao locacao) throws SQLException{
        
        return super.executeUpdate("delete from locacao where id=" + locacao.getId());
    }
    
/////////////////////
    
    public Locacao read(int id) throws SQLException{
        
        String SQL="select * from locacao where id=?";
        
        ResultSet rs = super.executeQuery(SQL, id);
        
        return (rs.next()?createObject(rs):null);
    }
    
//-----
    
    public List<Locacao> read() throws SQLException{
        
        String SQL="select * from locacao order by id";
        
        ResultSet rs = super.executeQuery(SQL);
        
        List<Locacao> retorno = new LinkedList<>();
        
        while(rs.next()){
            retorno.add(createObject(rs));
        }
        return (retorno);
    }  
    
/////////////////////
    
    public Locacao createObject(ResultSet rs) throws SQLException{
        
        return new Locacao(
                         rs.getInt("id"),               
                     new daoCliente().read(rs.getInt("id_cliente")), 
                  new daoFuncionario().read(rs.getInt("id_funcionario")), 
                rs.getDouble("total_vestido"),
              rs.getDouble("total_acessorios"),
                      rs.getString("evento"),
                rs.getDate("data_retirada").toLocalDate(), 
                 rs.getDate("data_entrega").toLocalDate()
        );             
    }
/////////////////////    
}
