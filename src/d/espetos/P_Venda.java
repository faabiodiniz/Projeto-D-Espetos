package d.espetos;

import java.util.ArrayList;

public class P_Venda extends Pedido 
{

	private String tipo = "Venda";
	
	public P_Venda(Cliente cliente, ArrayList<ItemPedido> vList) {
		super(cliente, vList);
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
