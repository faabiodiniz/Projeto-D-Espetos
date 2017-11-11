package d.espetos;

import java.util.ArrayList;

public class PedidoCompra extends Pedido 
{

	private String tipo = "Compra";
	
	public PedidoCompra(Cliente cliente, ArrayList<ItemPedido> vList) {
		super(cliente, vList);
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
