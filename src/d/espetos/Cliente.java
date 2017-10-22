package d.espetos;

import java.util.Date;
       
public class Cliente{
    private int idCliente;
    private final String nomeCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String endereco;
    private String bairro;
    private int numero;
    private Date nascimento;
	
    public Cliente(String nomeCliente, String telefoneCliente, String emailCliente, String endereco, String bairro,
			int numero, Date nascimento) 
    {
		this.nomeCliente = nomeCliente;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
		this.endereco = endereco;
		this.bairro = bairro;
		this.numero = numero;
		this.nascimento = nascimento;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getNumero() {
		return numero;
	}

	public Date getNascimento() {
		return nascimento;
	}
       
}
