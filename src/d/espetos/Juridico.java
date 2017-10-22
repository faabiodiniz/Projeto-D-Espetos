package d.espetos;

import java.util.Date;

public class Juridico extends Cliente
{
    
    public Juridico(String nome, int cnpj, String telefone, String email, String endereco, String bairro, int numero, Date nascimento) 
    {
        super(nome, telefone, email, endereco, bairro, numero, nascimento);
    }
    private int cnpj;
    
    public int getCNPJ(){
        return this.cnpj;
    }
    
}
