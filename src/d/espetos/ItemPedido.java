/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

import java.util.ArrayList;

/**
 *
 * @author leoau
 */
public class ItemPedido extends Pedido
{

	private Carne c;
	private double quantidade;
	private double valorVenda;
		
	public ItemPedido(Cliente cliente, ArrayList<ItemPedido> vList, Carne c, double quantidade, double valorVenda) {
		super(cliente, vList);
		this.c = c;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
	}

        public ItemPedido(Cliente cliente, ArrayList<ItemPedido> vList) {
            super(cliente, vList);
        }

	public Carne getC() {
		return c;
	}

	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
}
