package d.espetos;

import java.util.Date;

public class Juridico extends Cliente
{
    
    public Juridico(String nome, String cnpj, String telefone, String email) 
    {
        super(nome, telefone, email);
    }
    private String Cnpj;
    
    public String getCnpjCliente(){
        return this.Cnpj;
    }
    
}
