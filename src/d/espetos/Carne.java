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
        this.setNomeCarne(nomeCarne);
        this.setQuantidade(quantidade);
        this.setFabricacao(fabricacao);
        this.setValidade(validade);
        this.setValorCusto(valorCusto);
        this.setIdProduto(id);
        this.setMarca(marca);
        this.setTipo(tipo);
        this.setCodTipo(codTipo);
    }
    public Carne(int id, double quantidade,String nomeCarne, double valor, String tipo, String marca){
        this.setCodTipo(id);
        this.setNomeCarne(nomeCarne);
        this.setValorCusto(valor);
        this.setTipo(tipo);
        this.setMarca(marca);
        this.setQuantidade(quantidade);
    }
    
    public Carne(int idCarne, int codTipo){
        this.setIdProduto(idCarne);
        this.setCodTipo(codTipo);
    }

    public Carne() {
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeCarne(String nomeCarne) {
        if ((nomeCarne == null) || (nomeCarne.equals(""))) {
            this.nomeCarne = "";
        }
        this.nomeCarne = nomeCarne;
    }

    public void setFabricacao(Date fabricacao) {
        if (fabricacao == null) {
        }
        this.fabricacao = fabricacao;
    }

    public void setValidade(Date validade) {
        if (validade == null) {
        }
        if (this.getFabricacao() != null) {
            if ((validade.before(this.getFabricacao())) || (validade.compareTo(this.getFabricacao()) == 0)) {
            }
        }
        this.validade = validade;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        }
        this.quantidade = quantidade;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        if (valorCusto < 0) {
            this.valorCusto = 0;
        }
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
