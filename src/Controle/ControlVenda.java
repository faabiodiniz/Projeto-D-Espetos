package Controle;

import ClassesDAO.VendaDAO;
import d.espetos.Cliente;
import d.espetos.ItemPedido;
import d.espetos.Venda;
import java.util.ArrayList;
import java.util.List;

public class ControlVenda {
    
    ConexaoBD conexao = new ConexaoBD();
    Venda venda = new Venda();
    
    public static void criarVenda(Venda venda)
    {
        VendaDAO.getInstance().Salvar(venda);
    }
    
    public static List<Venda> getListOfVendas(){
        return VendaDAO.getInstance().retrieveAll();
    }
    
    public static List<Venda> getListOfVendasCliente(Cliente cliente){
        return VendaDAO.getInstance().retrieveLike(cliente.getIdCliente());
    }
        
    public static Venda[] getListOfVendasAsArray(){
        List<Venda> list = getListOfVendas();
        Venda[] vetVenda = new Venda[list.size()];
        int i = 0;
        for(Venda v : list){
            vetVenda[i++] = v;
        }
        return vetVenda;
    }    
   
    public static ArrayList<ItemPedido> getListOfItens(Venda venda){
        List<ItemPedido> list = new ArrayList<ItemPedido>();
        list = venda.getPedido().getvList();
        
        return (ArrayList<ItemPedido>) list;
    }
    
    public static Venda getVendaById(int id){
        Venda venda = VendaDAO.getInstance().retrieveById(id);
        return venda;
    }
         
    
    
}
