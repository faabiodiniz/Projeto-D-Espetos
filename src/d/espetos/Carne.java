package d.espetos;

import java.util.Date;

public class Carne {

    private int idProduto;
    private String nomeCarne;
    private double quantidade;
    private Date fabricacao;
    private Date validade;
    private double valorCusto;
    private String marca;
    private String tipo;
    private int codTipo;
	
    public Carne(int id, String nomeCarne, double quantidade, Date fabricacao, Date validade, double valorCusto, String tipo ,String marca, int codTipo) {
        this.nomeCarne = nomeCarne;
        this.quantidade = quantidade;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.valorCusto = valorCusto;
        this.idProduto = id;
        this.marca = marca;
        this.tipo = tipo;
        this.codTipo = codTipo;
    }
    public Carne(int id, String nomeCarne, double valor, String tipo){
        this.codTipo = id;
        this.nomeCarne = nomeCarne;
        this.valorCusto = valor;
        this.tipo = tipo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }
    
}
