package d.espetos;

import java.util.Date;

public class Carne {

    private int idProduto;
    private String nomeCarne;
    private double quantidade;
    private Date fabricacao;
    private Date validade;
    private double valorCusto;
	
    public Carne(int id, String nomeCarne, double quantidade, Date fabricacao, Date validade, double valorCusto) {
        this.nomeCarne = nomeCarne;
        this.quantidade = quantidade;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.valorCusto = valorCusto;
        this.idProduto = id;
    }

    public Carne() {
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeCarne(String nomeCarne) {
        this.nomeCarne = nomeCarne;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    public double getQuantidade() {
            return quantidade;
    }

    public void setQuantidade(double quantidade) {
            this.quantidade = quantidade;
    }

    public double getValorCusto() {
            return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
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
