package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Venda;
import d.espetos.ExceptionTest;
import d.espetos.ItemPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaDAO extends ConexaoBD
{

    ConexaoBD conexao = new ConexaoBD();
    Venda venda = new Venda();
    private static VendaDAO instance;
    
    public void Salvar(Venda venda){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Venda(codCliente, dataCompra, dataEntrega, desconto) values (?,?,?,?);" + "INSERT INTO FormaDePagamento(valor, identificador) values (?,?)");
            pst.setInt(1, venda.getCliente().getIdCliente());
            pst.setDate(2, (java.sql.Date) venda.getDataCompra());
            pst.setDate(3, (java.sql.Date) venda.getDataEntrega());
            pst.setDouble(4, venda.getDesconto());
            pst.setDouble(5, venda.getPagamento().getValorPago());
            pst.setInt(6, venda.getPagamento().getIdentificador());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }
    
    public void SalvarItens(Venda venda)
    {
        instance.conexao();
        for(ItemPedido i : venda.getPedido().getvList())
        {
            try 
            {
                PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO ItemDaVenda(codCarne, codVenda, valor, quantidade) values (?, ?, ?, ?)");
                pst.setInt(1, i.getC().getIdProduto());
                pst.setInt(2, venda.getIdVenda());
                pst.setDouble(3, i.getValorVenda());
                pst.setDouble(4, i.getQuantidade());
            } catch (SQLException ex)
            {
            throw new ExceptionTest();
            }
        }
    }
    
    
    public static VendaDAO getInstance() {
        if (instance == null) {
            instance = new VendaDAO();
            con = instance.conexao();
        }
        return instance;
    }
    
    private Venda buildObject(ResultSet rs) {
        Venda venda = null;
        try {
            venda = new Venda(rs.getInt("codVenda"), rs.getDouble("valor"), rs.getDouble("desconto"), rs.getDate("dataEntrega"), rs.getDate("dataCompra") , rs.getString("nome"));
        } catch (SQLException e) {
            
        }
        return venda;
    }
        
    public List<Venda> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Venda> vendas = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                vendas.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return vendas;
    }

    public List<Venda> retrieveAll() {
        return this.retrieveGeneric("SELECT Venda.codVenda, Venda.valor, Venda.desconto, Venda.dataCompra, Venda.dataEntrega, Cliente.nome FROM Venda, Cliente WHERE Venda.codCliente = Cliente.codCliente");
    }

    //recuperar pelo codigo de cliente//
    
    public List<Venda> retrieveLike(int codCliente) {
        return this.retrieveGeneric("SELECT * FROM Cliente WHERE codCliente LIKE '%"+codCliente+"%' ORDER BY codCliente");
    }

    //Recuperar atraves do ID da venda//
    
    public Venda retrieveById(int id) {
        Venda venda = null;
        List<Venda> vendas = this.retrieveGeneric("SELECT * FROM Cliente WHERE codVenda="+id);
        if(!vendas.isEmpty()){
            venda = vendas.get(0);
        }
        return venda;
    }

}