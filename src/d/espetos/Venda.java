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
    private float desconto;

    public Venda(Cliente cliente, Pedido pedido, FormaPagamento pagamento, float desconto) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.desconto = desconto;
    }

    public Venda(int codVenda, double valor, double desconto, Date dataCompra, Date dataEntrega, int codCliente) {
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

    public float getDesconto() {
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
    
    

}