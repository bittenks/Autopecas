/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import Model.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class MarcaDAO {
     PreparedStatement pst;
    String sql;
    
    public void salvar(Marca marca) throws SQLException{
        
        sql = "insert into marcaProd values (?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, marca.getDescricao());
        
       
        pst.execute();
        pst.close();

    }
    
    public void excluir(Marca marca) throws SQLException{
        sql = "delete from marcaProd where idmarcaProd=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, marca.getIdmarcaProd());
        pst.execute();
        pst.close();
    }
    
     public Marca ListaMarcaPorCodigo(int codigo) throws SQLException {
        Marca marca = null;
        sql = "select * from marcaProd where idmarcaProd=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, codigo);
        
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            marca = new Marca(rs.getInt("idmarcaProd"), rs.getString("descricao"));
        } 
        pst.close();
        return marca;    
    }
    
    
    
     public List<Marca> ListaMarca() throws SQLException {
        List<Marca> listaMarca;
        listaMarca= new ArrayList<>();
        sql = "select * from marcaProd order by descricao";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaMarca.add(new Marca(rs.getInt("idmarcaProd"), rs.getString("descricao")));
        } 
        pst.close();
        return listaMarca;    
    }
}
