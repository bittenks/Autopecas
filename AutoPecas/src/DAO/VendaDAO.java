/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ItensVenda;
import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author henri
 */
public class VendaDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(Venda venda) throws SQLException{
        int id_Venda = 0;
        sql = "insert into venda values (?, ?, ?, ?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1, 0);
        pst.setInt(2, venda.getCliente().getIdCliente());
        pst.setInt(3, venda.getFuncionario().getIdUsuario());
        pst.setFloat(4, venda.getTotalVenda());
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();
        while (rs.next()) {
            id_Venda = rs.getInt(1);
        }
        pst.close();
        salvarItensVenda(venda.getItensVenda(), id_Venda);
    }
    
    public void salvarItensVenda (List<ItensVenda> itensVenda, int id_Venda) throws SQLException {
        for (ItensVenda itens : itensVenda) {
            sql = "insert into itemvenda values (?, ?, ?, ?, ?, ?)";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setInt(1, 0);
            pst.setInt(2, id_Venda);
            pst.setInt(3, itens.getProduto().getIdProduto());
            pst.setFloat(4, itens.getQuantidade());
            pst.setFloat(4, itens.getPreco());
            pst.setFloat(4, itens.getPrecototalItem());
            pst.execute();
            pst.close();
}
    }
}


