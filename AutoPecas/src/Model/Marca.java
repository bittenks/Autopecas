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
public class Marca {
    private int idmarcaProd;
    private String descricao;

    public Marca(int idmarcaProd, String descricao) {
        this.idmarcaProd = idmarcaProd;
        this.descricao = descricao;
    }

    public int getIdmarcaProd() {
        return idmarcaProd;
    }

    public void setIdmarcaProd(int idmarcaProd) {
        this.idmarcaProd = idmarcaProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

   
    
}
