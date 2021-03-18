/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import Model.Marca;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henri
 */
public class ProdutoDAO {
    
    PreparedStatement pst;
    String sql;
    MarcaDAO marcaDAO;    
    CategoriaDAO categoriaDAO;
    
    
    public void salvar(Produto produto) throws SQLException{
        
        sql = "insert into produto values (?, ?, ?, ?, ?, ?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getNomeProduto());
        pst.setString(3, produto.getDescricaoProduto());
        pst.setInt(4, produto.getQuantidadeProduto());
        pst.setFloat(5, produto.getValorProduto());
        pst.setInt(6, produto.getCategoriaProduto().getIdCategoriaProd());
        pst.setInt(7, produto.getMarcaProduto().getIdmarcaProd());
       
        pst.execute();
        pst.close();

    }
    
    public void excluir(Produto produto) throws SQLException{
        sql = "delete from produto where idProduto=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getIdProduto());
        pst.execute();
        pst.close();
    }
    
    public void alterar (Produto produto) throws SQLException{
        sql = "update produto set nomeproduto=?, descricaoProduto=?, quantidadeProduto=?, valorProduto=?, categoriaProduto=?,"
                + "marcaProduto=?";
       pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, produto.getNomeProduto());
        pst.setString(3, produto.getDescricaoProduto());
        pst.setInt(4, produto.getQuantidadeProduto());
        pst.setFloat(5, produto.getValorProduto());
        pst.setInt(6, produto.getCategoriaProduto().getIdCategoriaProd());
        pst.setInt(7, produto.getMarcaProduto().getIdmarcaProd());
       
        pst.execute();
        pst.close();
    }
    
    public Produto buscaProdutoCodigo(String idProduto) throws SQLException{
        sql = "select * from produto where idProduto = " + idProduto;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Produto pro = null;
        categoriaDAO = new CategoriaDAO();
        while (rs.next()){
            pro = new Produto(rs.getInt("idProduto"), rs.getString("nomeProduto"), rs.getString("descricaoProduto"),rs.getInt("quantidadeProduto"),
                    rs.getFloat("valorProduto"), categoriaDAO.ListaCategoriaPorCodigo(rs.getInt("categoriaProduto")));
            
        }
        pst.close();
        return pro;
    }
    
    public List<Produto> ListaProduto() throws SQLException {
        List<Produto> listaProdutos;
        listaProdutos= new ArrayList<>();
        sql = "select * from produto order by nomeProduto";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        categoriaDAO = new CategoriaDAO();
        while (rs.next()){
            listaProdutos.add(new Produto(rs.getInt("idProduto"), rs.getString("nomeProduto"), rs.getString("descricaoProduto"),rs.getInt("quantidadeProduto"),
                    rs.getFloat("valorProduto"),categoriaDAO.ListaCategoriaPorCodigo(rs.getInt("categoriaProduto"))));
        } 
        pst.close();
        return listaProdutos;
    
    }    
   
       
        
    
}
