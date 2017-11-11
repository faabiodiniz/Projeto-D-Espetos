package d.espetos;

import java.util.ArrayList;

public class PedidoVenda extends Pedido 
{

	private String tipo = "Venda";
	
	public PedidoVenda(Cliente cliente, ArrayList<ItemPedido> vList) {
		super(cliente, vList);
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
