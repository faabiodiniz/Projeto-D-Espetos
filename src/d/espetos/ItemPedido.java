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
	private float valorVenda;
		
	public ItemPedido(Cliente cliente, ArrayList<ItemPedido> vList, Carne c, double quantidade, float valorVenda) {
		super(cliente, vList);
		this.c = c;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
	}

        //public ItemPedido() {
        //}

	public Carne getC() {
		return c;
	}

	public double getQuantidade() {
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
