package d.espetos;

import java.util.Date;

public class Boi extends Carne
{

    public Boi(String nomeCarne, double quantidade, Date fabricacao, Date validade, float valorCusto)
    {
        super(nomeCarne, quantidade, fabricacao, validade, valorCusto);
    }
    
    private String tipo = "Boi";
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }

    
    
}
