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
public class Funcionario {
    
    private int idUsuario;
    private String nomeUsuario;
    private String cpfUsuario;
    private String enderecoUsuario;
    private String telUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private String funcaoUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getFuncaoUsuario() {
        return funcaoUsuario;
    }

    public void setFuncaoUsuario(String funcaoUsuario) {
        this.funcaoUsuario = funcaoUsuario;
    }

    public Funcionario(int idUsuario, String nomeUsuario, String cpfUsuario, String enderecoUsuario, String telUsuario, String emailUsuario, String senhaUsuario, String funcaoUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.telUsuario = telUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.funcaoUsuario = funcaoUsuario;
    }

    public Funcionario() {
    }
    
    
}
