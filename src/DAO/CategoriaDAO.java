/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import Model.Cliente;
import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class CategoriaDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(Categoria categoria) throws SQLException{
        
        sql = "insert into categoriaprod values (?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, categoria.getDescricaoCatProd());
        
       
        pst.execute();
        pst.close();

    }
    
    public void excluir(Categoria categoria) throws SQLException{
        sql = "delete from categoriaProd where idCategoriaProd=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, categoria.getIdCategoriaProd());
        pst.execute();
        pst.close();
    }
    
     public Categoria ListaCategoriaPorCodigo(int codigo) throws SQLException {
        Categoria categoria = null;
        sql = "select * from categoriaProd where idCategoriaProd=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, codigo);
        
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            categoria = new Categoria(rs.getInt("idCategoriaProd"), rs.getString("descricaoCatProd"));
        } 
        pst.close();
        return categoria;    
    }
    public List<Categoria> ListaCategoria() throws SQLException {
        List<Categoria> listaCategoria;
        listaCategoria= new ArrayList<>();
        sql = "select * from categoriaProd order by descricaoCatProd";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaCategoria.add(new Categoria(rs.getInt("idCategoriaProd"), rs.getString("descricaoCatProd")));
        } 
        pst.close();
        return listaCategoria;    
    }
}
