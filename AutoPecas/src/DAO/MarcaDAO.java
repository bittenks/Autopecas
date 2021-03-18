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
