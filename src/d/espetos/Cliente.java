/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

/**
 *
 * @author faad2
 */
public class Cliente{    
    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String endereco;

    public Cliente() {
    }
    
    public Cliente(String nome, String cpf, String telefone, String email, String endereco){
        this.cpfCliente = cpf;
        this.emailCliente = email;
        this.endereco = endereco;
        this.nomeCliente = nome;
        this.telefoneCliente = telefone;
    }
    
    public String getCpf(){
        return this.cpfCliente;
    }
    
    public String getNome(){
        return this.nomeCliente;
    }
    
    public String getTelefone(){
        return this.telefoneCliente;
    }
    
    public String getEmail(){
        return this.emailCliente;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefoneCliente = telefone;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setEmail(String email){
        this.emailCliente = email;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpf(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    
    
    
}
