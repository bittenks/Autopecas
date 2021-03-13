/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Conexao;
import Model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henri
 */
public class FuncionarioDAO {
    
     PreparedStatement pst;
     String sql;
    
    public void salvar(Funcionario funcionario) throws SQLException{
        
        sql = "insert into usuario values (?, ?, ?, ?, ?, ?, ?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, funcionario.getNomeUsuario());
        pst.setString(3, funcionario.getCpfUsuario());
        pst.setString(4, funcionario.getEnderecoUsuario());
        pst.setString(5, funcionario.getTelUsuario());
        pst.setString(6, funcionario.getEmailUsuario());
        pst.setString(7, funcionario.getSenhaUsuario());
        pst.setString(8, funcionario.getFuncaoUsuario());
        pst.execute();
        pst.close();

    }
    
    public void excluir(Funcionario funcionario) throws SQLException{
        sql = "delete from usuario where idUsuario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getIdUsuario());
        pst.execute();
        pst.close();
    }
    
    public void alterar (Funcionario funcionario) throws SQLException{
        sql = "update usuario set nomeUsuario=?, cpfUsuario=?, enderecoUsuario=?, telUsuario=?, emailUsuario=?,"
                + "senhaUsuario=?, funcaoUsuario=? where idUsuario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNomeUsuario());
        pst.setString(2, funcionario.getCpfUsuario());
        pst.setString(3, funcionario.getEnderecoUsuario());
        pst.setString(4, funcionario.getTelUsuario());
        pst.setString(5, funcionario.getEmailUsuario());
        pst.setString(6, funcionario.getSenhaUsuario());
        pst.setString(7, funcionario.getFuncaoUsuario());
        pst.setInt(8, funcionario.getIdUsuario());
        pst.execute();
        pst.close();
    }
    
    public Funcionario buscaFuncionarioCodigo(String idUsuario) throws SQLException{
        sql = "select * from usuario where idUsuario = " + idUsuario;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Funcionario fun = null;
        while (rs.next()){
            fun = new Funcionario(rs.getInt("idUsuario"), rs.getString("nomeUsuario"), rs.getString("cpfUsuario"),rs.getString("EnderecoUsuario"),
                    rs.getString("telUsuario"), rs.getString("emailUsuario"), rs.getString("senhaUsuario"), rs.getString("funcaoUsuario"));
        }
        pst.close();
        return fun;
    }
    
    public List<Funcionario> ListaFuncionario() throws SQLException {
        List<Funcionario> listaFuncionarios;
        listaFuncionarios = new ArrayList<>();
        sql = "select * from usuario order by nomeUsuario";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaFuncionarios.add(new Funcionario(rs.getInt("idUsuario"), rs.getString("nomeUsuario"), rs.getString("cpfUsuario"),rs.getString("EnderecoUsuario"),
                    rs.getString("telUsuario"), rs.getString("emailUsuario"), rs.getString("senhaUsuario"), rs.getString("funcaoUsuario")));
        } 
        pst.close();
        return listaFuncionarios;
    
    } 
}
