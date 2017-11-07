package d.espetos;

import java.util.Date;

public class Fisico extends Cliente
{

	public Fisico(int id, String nomeCliente, String telefoneCliente, String emailCliente, String tipo, String cpf) 
	{
		super(id, nomeCliente, telefoneCliente, emailCliente, tipo, cpf);
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
