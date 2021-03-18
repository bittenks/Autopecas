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
public class Cliente {
    
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;
    private String telCliente;
    private String enderecoCliente;
    private String numeroCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String estadoCliente;
    private String cepCliente;
    private float limite_creditoCliente;



    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public float getLimite_creditoCliente() {
        return limite_creditoCliente;
    }

    public void setLimite_creditoCliente(float limite_creditoCliente) {
        this.limite_creditoCliente = limite_creditoCliente;
    }

    public Cliente(int idCliente, String nomeCliente, String cpfCliente, String emailCliente, String telCliente, String enderecoCliente, String numeroCliente, String bairroCliente, String cidadeCliente, String estadoCliente, String cepCliente, float limite_creditoCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
        this.telCliente = telCliente;
        this.enderecoCliente = enderecoCliente;
        this.numeroCliente = numeroCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        this.cepCliente = cepCliente;
        this.limite_creditoCliente = limite_creditoCliente;
    }

    public Cliente() {
    }

    
    
    

   

   



   

    
    
    
}