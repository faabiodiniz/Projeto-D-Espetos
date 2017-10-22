package d.espetos;

import java.util.Date;

public class Frango extends Carne
{

    public Frango(String nomeCarne, double quantidade, Date fabricacao, Date validade, float valorCusto)
    {
        super(nomeCarne, quantidade, fabricacao, validade, valorCusto);
    }
    
    private String tipo = "Frango";
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }

    
    
}
