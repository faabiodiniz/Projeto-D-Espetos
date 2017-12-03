package Controle;

import ClassesDAO.VendaDAO;
import d.espetos.Cliente;
import d.espetos.ItemPedido;
import d.espetos.Venda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControlVenda {
    
    ConexaoBD conexao = new ConexaoBD();
    Venda venda = new Venda();
    
    public static void criarVenda(int idCliente, String dataCompra, String dataEntrega, double desconto)
    {
        VendaDAO.getInstance().Salvar(idCliente, dataCompra, dataEntrega, desconto);
    }
    
    public static void insereItens(int idVenda, double quantidade, double valor, int codTipoCarne){
        VendaDAO.getInstance().SalvarItens(idVenda, quantidade, valor, codTipoCarne);
    }
    
    public static void formaDePagamento(double valor, int identificador, double valorParcela, int qtdParcelas, String nome, String data, String conta, String agencia, int codVenda){
        VendaDAO.getInstance().formaDePagamento(valor, identificador, valorParcela, qtdParcelas, nome, data, conta, agencia, codVenda);
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
     
    public static List<Venda> getIdVenda() throws SQLException{
        return VendaDAO.getInstance().getIdVenda();
    }
    
    
}
