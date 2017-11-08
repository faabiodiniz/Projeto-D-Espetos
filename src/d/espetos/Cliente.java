package d.espetos;

import java.util.Date;
       
public class Cliente{
    private int idCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String tipo;
    private String cpfcnpj;
    
    public Cliente(){
        
    }
	
    public Cliente(int id, String nomeCliente, String telefoneCliente, String emailCliente, String tipo, String cpf) 
    {
        this.idCliente = id;
	this.nomeCliente = nomeCliente;
	this.telefoneCliente = telefoneCliente;
	this.emailCliente = emailCliente;
        this.tipo = tipo;
        this.cpfcnpj = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
            return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
            this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
            return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
            this.emailCliente = emailCliente;
    }

    public int getIdCliente() {
            return idCliente;
    }

    public String getNomeCliente() {
            return nomeCliente;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }
    
}
