package d.espetos;

import java.util.Date;

public class Porco extends Carne
{

    public Porco(String nomeCarne, String tipo, double quantidade, Date fabricacao, Date validade, float valorCusto)
    {
        super(nomeCarne, quantidade, fabricacao, validade, valorCusto);
    }
    
    private String tipo = "Porco";
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }

    
    
}
