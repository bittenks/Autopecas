/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author henri
 */
public class ItensVenda {
    private int idItem;
    private Produto produto;
    private float quantidade;
    private float preco;
    private float precototalItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPrecototalItem() {
        return precototalItem;
    }

    public void setPrecototalItem(float precototalItem) {
        this.precototalItem = precototalItem;
    } 

    public ItensVenda(int idItem, Produto produto, float quantidade, float preco, float precototalItem) {
        this.idItem = idItem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precototalItem = precototalItem;
    }
    
    public ItensVenda() {
    }
    
    
    
}
