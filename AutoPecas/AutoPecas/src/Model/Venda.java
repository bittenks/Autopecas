/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author henri
 */
public class Venda {
    private int idVenda;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<ItensVenda> itensVenda;
    private float totalVenda;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItensVenda> itenVenda) {
        this.itensVenda = itenVenda;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Venda(int idVenda, Cliente cliente, Funcionario funcionario, List<ItensVenda> itensVenda, float totalVenda) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.itensVenda = itensVenda;
        this.totalVenda = totalVenda;
    }

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }
    
    
    
    

    
    
    
    
}
