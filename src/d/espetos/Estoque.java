package d.espetos;

public class Estoque 
{

    private Carne c;
    private int quantidade;
    private float valorVenda;
	
    public Estoque(Carne c, int quantidade, float valorVenda) {
		super();
		this.c = c;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
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
		this.quantidade = quantidade;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

    

    
}
