package d.espetos;

import java.util.Date;

public class Juridico extends Cliente
{
    
    public Juridico(int id, String nome, String cnpj, String telefone, String email, String tipo, String cpf) 
    {
        super(id , nome, telefone, email, tipo, cpf);
    }
    private String Cnpj;
    
    public String getCnpjCliente(){
        return this.Cnpj;
    }
    
}
