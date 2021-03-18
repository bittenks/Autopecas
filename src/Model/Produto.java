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
public class Produto {
    
    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private int quantidadeProduto ;
    private float valorProduto ;
    private Categoria categoriaProduto;
    private Marca marcaProduto ;

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, int quantidadeProduto, float valorProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }    

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, int quantidadeProduto, float valorProduto, Categoria categoriaProduto, Marca marcaProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
        this.categoriaProduto = categoriaProduto;
        this.marcaProduto = marcaProduto;
    }

    public Produto(int idProduto, String nomeProduto, String descricaoProduto, int quantidadeProduto, float valorProduto, Categoria categoriaProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
        this.categoriaProduto = categoriaProduto;
    }
    

    

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categoria categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Marca getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(Marca marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

          
             
    public Produto() {
    } 
   

  
  
    
    
    
}