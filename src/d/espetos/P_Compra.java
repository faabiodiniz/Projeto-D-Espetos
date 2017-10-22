package d.espetos;

import java.util.ArrayList;

public class P_Compra extends Pedido 
{

	private String tipo = "Compra";
	
	public P_Compra(Cliente cliente, ArrayList<ItemPedido> vList) {
		super(cliente, vList);
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
