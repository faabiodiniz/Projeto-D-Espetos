package d.espetos;

import java.util.Date;

public class Fisico extends Cliente
{

	public Fisico(String nomeCliente, String cpf, String telefoneCliente, String emailCliente, String endereco, String bairro,
			int numero, Date nascimento) 
	{
		super(nomeCliente, telefoneCliente, emailCliente);
	}
    
	private String cpf;

    public Fisico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        public void setCpfCliente(String cpf){
            this.cpf = cpf;
        }

	public String getCpfCliente() {
		return cpf;
        }
}
