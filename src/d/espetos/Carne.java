package d.espetos;

import java.util.Date;

public class Carne {

    private int idProduto;
    private String nomeCarne;
    private double quantidade;
    private Date fabricacao;
    private Date validade;
    private float valorCusto;
	
    public Carne(String nomeCarne, double quantidade, Date fabricacao, Date validade, float valorCusto) {
		super();
		this.nomeCarne = nomeCarne;
		this.quantidade = quantidade;
		this.fabricacao = fabricacao;
		this.validade = validade;
		this.valorCusto = valorCusto;
	}

    public Carne() {
    }

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public String getNomeCarne() {
		return nomeCarne;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public Date getValidade() {
		return validade;
	}
    
    
    
}
