/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author andre
 */
public class Categoria {
    private int idCategoriaProd;
    private String descricaoCatProd;

    public int getIdCategoriaProd() {
        return idCategoriaProd;
    }

    public void setIdCategoriaProd(int idCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
    }

    public String getDescricaoCatProd() {
        return descricaoCatProd;
    }

    public void setDescricaoCatProd(String descricaoCatProd) {
        this.descricaoCatProd = descricaoCatProd;
    }

    public Categoria(int idCategoriaProd, String descricaoCatProd) {
        this.idCategoriaProd = idCategoriaProd;
        this.descricaoCatProd = descricaoCatProd;
    }

    public Categoria() {
    }
    
    
}
