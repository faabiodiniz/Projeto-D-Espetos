package d.espetos;

import java.util.ArrayList;
import java.util.Date;

public class Venda 
{
    
    private int idVenda;
    private Cliente cliente;
    private Pedido pedido;
    private Date dataEntrega;
    private Date dataCompra;
    private FormaPagamento pagamento;
    private double desconto;
    private double valor;
    private int codVenda;
    private String nomeCliente;

    public Venda(Cliente cliente, Pedido pedido, FormaPagamento pagamento, double desconto, Date entrega, Date compra) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.desconto = desconto;
        this.dataCompra = compra;
        this.dataEntrega = entrega;
    }

    public Venda(int codVenda, double valor, double desconto, Date dataCompra, Date dataEntrega, String nomeCliente) {
        this.idVenda = codVenda;
        this.nomeCliente = nomeCliente;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.valor = valor;
        this.desconto = desconto;
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

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
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
    
    

}