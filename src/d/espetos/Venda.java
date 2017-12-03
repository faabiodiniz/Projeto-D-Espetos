package d.espetos;

import java.util.ArrayList;
import java.util.Date;

public class Venda 
{
    
    private int idVenda;
    private Cliente cliente;
    private Pedido pedido;
    private java.sql.Date dataEntrega;
    private java.sql.Date dataCompra;
    private FormaPagamento pagamento;
    private double desconto;
    private double valor;
    private int codVenda;
    private int codCliente;
    String nomeCliente;

    public Venda(Cliente cliente, Pedido pedido, FormaPagamento pagamento, double desconto, java.sql.Date entrega, java.sql.Date compra) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.desconto = desconto;
        this.dataCompra = compra;
        this.dataEntrega = entrega;
    }

    public Venda(int codVenda, double valor, double desconto, java.sql.Date dataCompra, java.sql.Date dataEntrega, String nomeCliente,int idCodCliente) {
        this.idVenda = codVenda;
        this.codCliente = idCodCliente;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.valor = valor;
        this.desconto = desconto;
        this.nomeCliente = nomeCliente;
    }
    
    public Venda(){
        
    }

    public int getIdVenda() {
        return idVenda;
    }

     public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public FormaPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public java.sql.Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(java.sql.Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public java.sql.Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(java.sql.Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setIdVenda(int aInt) {
        this.idVenda = aInt;
    }
}