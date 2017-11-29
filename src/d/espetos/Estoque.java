package d.espetos;

public class Estoque 
{

    private Carne c;
    private int quantidade;
    private float valorVenda;
	
    public Estoque(Carne c, int quantidade, float valorVenda) {
        super();
        this.setC(c);
        this.setQuantidade(quantidade);
        this.setValorVenda(valorVenda);
    }

    public Carne getC() {
        return c;
    }

    public void setC(Carne c) {
        this.c = c;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new ExceptionTest();
        }
        this.quantidade = quantidade;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        if (valorVenda <= 0) {
            throw new ExceptionTest();
        }
        this.valorVenda = valorVenda;
    }
}
