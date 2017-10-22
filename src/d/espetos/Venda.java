package d.espetos;

import java.util.ArrayList;

public class Venda 
{
    
    private int idVenda;
    private Cliente cliente;
    private ArrayList<Carne> vCarne;
	
    public Venda(Cliente cliente, ArrayList<Carne> vCarne) {
		super();
		this.cliente = cliente;
		this.vCarne = new ArrayList<Carne>();
	}

	public int getIdVenda() {
		return idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<Carne> getvCarne() {
		return vCarne;
	}
    
	//**Metodo para adicionar itens a lista**//
	
	public void addCarne(Carne c)
	{
		vCarne.add(c);
	}
	
	//**Metodo para imprimir Pedido**//
	
	public String toString()
	{
		String str = new String("Pedido de venda do cliente " + cliente.getNomeCliente() + ": \n");
		int i = 1;
		for(Carne c : vCarne)
		{
			str += i + " - ";
			str += c.getNomeCarne();
		}
		
		return str;
	}
    
	
          
}
