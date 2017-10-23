package d.espetos;

import java.util.Date;
       
public class Cliente{
    private int idCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String cpfCliente;
    
    public Cliente(){
        
    }
	
    public Cliente(String nomeCliente, String telefoneCliente, String emailCliente, String cpfCliente) 
    {
        this.cpfCliente = cpfCliente;
	this.nomeCliente = nomeCliente;
	this.telefoneCliente = telefoneCliente;
	this.emailCliente = emailCliente;
    }

        public void setCpfCliente(String Cpf) {
            this.cpfCliente = Cpf;
        }

        public String getCpfCliente(){
            return cpfCliente;
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
}
