/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henri
 */
public class ClienteDAO {
    
    PreparedStatement pst;
    String sql;
    
    public void salvar(Cliente cliente) throws SQLException{
        
        sql = "insert into cliente values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cliente.getNomeCliente());
        pst.setString(3, cliente.getCpfCliente());
        pst.setString(4, cliente.getEmailCliente());
        pst.setString(5, cliente.getTelCliente());
        pst.setString(6, cliente.getEnderecoCliente());
        pst.setString(7, cliente.getNumeroCliente());
        pst.setString(8, cliente.getBairroCliente());
        pst.setString(9, cliente.getCidadeCliente());
        pst.setString(10, cliente.getEstadoCliente());
        pst.setString(11, cliente.getCepCliente());
        pst.setFloat(12, cliente.getLimite_creditoCliente());
        pst.execute();
        pst.close();

    }
    
    public void excluir(Cliente cliente) throws SQLException{
        sql = "delete from cliente where idCliente=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getIdCliente());
        pst.execute();
        pst.close();
    }
    
    public void alterar (Cliente cliente) throws SQLException{
        sql = "update cliente set nomeCliente=?, cpfCliente=?, emailCliente=?, telCliente=?, enderecoCliente=?,"
                + "numeroCliente=?, bairroCliente=?, cidadeCliente=?, estadoCliente=?, cepCliente=?, limite_creditoCliente=? where idCliente=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cliente.getNomeCliente());
        pst.setString(2, cliente.getCpfCliente());
        pst.setString(3, cliente.getEmailCliente());
        pst.setString(4, cliente.getTelCliente());
        pst.setString(5, cliente.getEnderecoCliente());
        pst.setString(6, cliente.getNumeroCliente());
        pst.setString(7, cliente.getBairroCliente());
        pst.setString(8, cliente.getCidadeCliente());
        pst.setString(9, cliente.getEstadoCliente());
        pst.setString(10, cliente.getCepCliente());
        pst.setFloat(11, cliente.getLimite_creditoCliente());
        pst.setInt(12, cliente.getIdCliente());
        pst.execute();
        pst.close();
    }
    
    public Cliente buscaClienteCodigo(String idCliente) throws SQLException{
        sql = "select * from cliente where idCliente = " + idCliente;
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        Cliente cli = null;
        while (rs.next()){
            cli = new Cliente(rs.getInt("idCliente"), rs.getString("nomeCliente"), rs.getString("cpfCliente"), rs.getString("emailCliente"),
            rs.getString("telCliente"), rs.getString("enderecoCliente"), rs.getString("numeroCliente"), rs.getString("bairroCliente"),
            rs.getString("cidadeCliente"), rs.getString("estadoCliente"), rs.getString("cepCliente"), rs.getFloat("limite_creditoCliente"));
        }
        pst.close();
        return cli;
    }
    
    public List<Cliente> ListaCliente() throws SQLException {
        List<Cliente> listaClientes;
        listaClientes = new ArrayList<>();
        sql = "select * from cliente order by nomeCliente";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            listaClientes.add(new Cliente(rs.getInt("idCliente"), rs.getString("nomeCliente"), rs.getString("cpfCliente"), rs.getString("emailCliente"),
            rs.getString("telCliente"), rs.getString("enderecoCliente"), rs.getString("numeroCliente"), rs.getString("bairroCliente"),
            rs.getString("cidadeCliente"), rs.getString("estadoCliente"), rs.getString("cepCliente"), rs.getFloat("limite_creditoCliente")));
        } 
        pst.close();
        return listaClientes;
    
    } 
}
