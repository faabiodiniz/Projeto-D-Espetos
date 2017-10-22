/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

import java.util.ArrayList;

public class Pedido 
{

	private int idPedido;
	private Cliente cliente;
	private ArrayList<ItemPedido> vList;
	
	public Pedido(Cliente cliente, ArrayList<ItemPedido> vList) {
		super();
		this.cliente = cliente;
		this.vList = vList;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<ItemPedido> getvList() {
		return vList;
	}
	
	public void addItem(ItemPedido item)
	{
		vList.add(item);
	}
	
	
	
	
	
}
