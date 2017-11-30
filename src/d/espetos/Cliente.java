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
        this.setIdCliente(id);
	this.setNomeCliente(nomeCliente);
        this.setTelefoneCliente(telefoneCliente);
        this.setEmailCliente(emailCliente);
        this.setTipo(tipo);
        this.setCpfcnpj(cpf);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ((tipo == null) || ((!tipo.equals("Jurídico")) && (!tipo.equals("Físico  ")))){
            throw new ExceptionTest();
        }
        this.tipo = tipo;
    }

    public void setNomeCliente(String nomeCliente) {
        if ((nomeCliente == null) || (nomeCliente.equals(""))){
            throw new ExceptionTest();
        }
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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
