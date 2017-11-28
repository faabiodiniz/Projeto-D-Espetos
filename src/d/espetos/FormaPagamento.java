/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

/**
 *
 * @author informatica
 */
public class FormaPagamento {
    
    private int idFormaPagamento;
    private double valorPago;
    private int identificador;
    private int codVenda;

    public FormaPagamento(double valorPago, int identificador, int codVenda) {
        this.valorPago = valorPago;
        this.identificador = identificador;
        this.codVenda = codVenda;
    }

    public int getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }
    
    
    
}
