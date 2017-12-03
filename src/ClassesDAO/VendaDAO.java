package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Venda;
import d.espetos.ExceptionTest;
import d.espetos.ItemPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaDAO extends ConexaoBD
{

    ConexaoBD conexao = new ConexaoBD();
    Venda venda = new Venda();
    private static VendaDAO instance;
    
    public void Salvar(int idCliente, String dataCompra, String dataEntrega, double desconto){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Venda(codCliente, dataCompra, dataEntrega, desconto) values (?,?,?,?)");
            pst.setInt(1, idCliente);
            pst.setString(2, dataCompra);
            pst.setString(3, dataEntrega);
            pst.setDouble(4, desconto);
            pst.execute();            
        } catch (SQLException ex) {
        }
        instance.desconecta();
    }
    
    public void SalvarItens(int idVenda, double quantidade, double valor, int codTipoCarne)
    {
        instance.conexao();
        try 
        {
            PreparedStatement pst = conexao.con.prepareStatement("EXEC insertItemVenda @quantidade = ?, @valor = ?, @codTipoCarne = ?, @codVenda = ?;");
            pst.setInt(4, idVenda);
            pst.setInt(3, codTipoCarne);
            pst.setDouble(1, quantidade);
            pst.setDouble(2, valor);
            pst.execute();
        } catch (SQLException ex)
        {
        }
    }
    
    public void formaDePagamento(double valor, int identificador, double valorParcela, int qtdParcelas, String nome, String data, String conta, String agencia, int codVenda){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("EXEC insertPagamento @valor = ?, @identificador = ?, @valorParcela = ?, @qtdParcelas = ?, @nome = ?, @data = ?, @conta = ?, @agencia = ?, @codVenda = ?");
            pst.setDouble(1, valor);
            pst.setInt(2, identificador);
            pst.setDouble(3, valorParcela);
            pst.setInt(4, qtdParcelas);
            pst.setString(5, nome);
            pst.setString(6, data);
            pst.setString(7, conta);
            pst.setString(8, agencia);
            pst.setInt(9, codVenda);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
        }
        instance.desconecta();
    }
    
    
    public static VendaDAO getInstance() {
        if (instance == null) {
            instance = new VendaDAO();
            con = instance.conexao();
        }
        return instance;
    }

    private Venda buildObjectIdVenda(ResultSet rs) {
        Venda venda = null;
        try {
            venda = new Venda();
            venda.setIdVenda(rs.getInt("codVenda"));
        } catch (SQLException e) {
            
        }
        return venda;
    }    
    private Venda buildObject(ResultSet rs) {
        Venda venda = null;
        try {
            venda = new Venda(rs.getInt("codVenda"), rs.getDouble("valor"), rs.getDouble("desconto"), rs.getDate("dataEntrega"), rs.getDate("dataCompra") , rs.getString("nome"), rs.getInt("codCliente"));
        } catch (SQLException e) {
            
        }
        return venda;
    }
        
    public List<Venda> retrieveGeneric(String query) {
        instance.conexao();
        PreparedStatement stmt;
        List<Venda> vendas = new ArrayList<>();
        ResultSet rs;
        try {
            instance.conexao();
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                vendas.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        instance.desconecta();
        return vendas;
    }

    public List<Venda> retrieveAll() {
        return this.retrieveGeneric("SELECT Venda.codVenda, Venda.valor, Venda.desconto, Venda.dataCompra, Venda.dataEntrega, Cliente.nome, Cliente.codCliente FROM Venda, Cliente WHERE Venda.codCliente = Cliente.codCliente");
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

    public List<Venda> retrieveId(String query) {
        instance.conexao();
        PreparedStatement stmt;
        List<Venda> vendas = new ArrayList<>();
        ResultSet rs;
        try {
            instance.conexao();
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                vendas.add(buildObjectIdVenda(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        instance.desconecta();
        return vendas;
    }
        
    public List<Venda> getIdVenda() {
        return this.retrieveId("SELECT codVenda from Venda ORDER BY codVenda DESC;");
    }
}