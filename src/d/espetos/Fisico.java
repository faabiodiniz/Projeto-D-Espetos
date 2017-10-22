package d.espetos;

import java.util.Date;

public class Fisico extends Cliente
{

	public Fisico(String nomeCliente, int cpf, String telefoneCliente, String emailCliente, String endereco, String bairro,
			int numero, Date nascimento) 
	{
		super(nomeCliente, telefoneCliente, emailCliente, endereco, bairro, numero, nascimento);
	}
    
	private int cpf;

	public int getCPF() {
		return cpf;
	}
	    
}
