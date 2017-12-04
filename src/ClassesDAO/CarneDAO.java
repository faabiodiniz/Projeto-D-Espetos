/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Carne;
import d.espetos.ExceptionTest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class CarneDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Carne carne = new Carne();
    private static CarneDAO instance;
    List<Carne> listCarne;
    private int ultCodCarne;
    
    public void Salvar(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo, String marca, int codTipoCarne){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("EXEC InsertTipoDeCarne @nome=?,@valor=?,@marca=?,@tipo=?;");
            pst.setString(1, nome);
            pst.setDouble(2, valor);
            pst.setString(3, marca);
            pst.setString(4, tipo);
            pst.execute();
            listCarne = getIdVenda(nome, marca, tipo);
            ultCodCarne = listCarne.get(0).getCodTipo();
            salvarCarne(fabricacao, validade, quantidade, ultCodCarne);
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }
    
    public void salvarCarne(String fabricacao, String validade, double quantidade, int codTipoCarne){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Carne(dataFabricacao, dataValidade, quantidade, codTipoCarne) values (?,?,?,?)");
            pst.setString(1, fabricacao);
            pst.setString(2, validade);
            pst.setDouble(3, quantidade);
            pst.setInt(4, codTipoCarne);
            pst.execute();
        } catch (SQLException ex) {
        }
    }
    
    public static CarneDAO getInstance() {
        if (instance == null) {
            instance = new CarneDAO();
            con = instance.conexao();
        }
        return instance;
    }
        
    private Carne buildObject(ResultSet rs) {
        Carne carne = null;
        try {
            carne = new Carne(rs.getInt("codCarne"), rs.getString("nome"), rs.getDouble("quantidade"), rs.getDate("dataFabricacao"),rs.getDate("dataValidade"), rs.getDouble("valor"), rs.getString("tipo"), rs.getString("marca"), rs.getInt("codTipoCarne"));       
        } catch (SQLException e) {
        }
        return carne;
    }
    
    private Carne buildObjectView(ResultSet rs){
        Carne carne = null;
        try {
            carne = new Carne(rs.getInt("codTipoCarne"),  rs.getDouble("quantidade"), rs.getString("nome"),rs.getDouble("valor"), rs.getString("tipo"), rs.getString("marca"));       
        } catch (SQLException e) {
        }
        return carne;
    }
        
    public List<Carne> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Carne> carnes = new ArrayList<>();
        ResultSet rs;
        try {
            instance.conexao();
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                carnes.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return carnes;
    }
    
        public List<Carne> retrieveGenericView(String query) {
        PreparedStatement stmt;
        List<Carne> carnes = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                carnes.add(buildObjectView(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return carnes;
    }

    public List<Carne> retrieveAll() {
        return this.retrieveGeneric("SELECT codCarne, quantidade, dataValidade, dataFabricacao, nome, valor, marca, tipo, TipoDeCarne.codTipoCarne FROM Carne, TipoDeCarne WHERE Carne.codTipoCarne = TipoDeCarne.codTipoCarne");
    }

    public List<Carne> retrieveAllOrderById() {
        return this.retrieveGeneric("SELECT * FROM Carne ORDER BY id");
    }

    public List<Carne> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT codCarne, quantidade, dataValidade, dataFabricacao, nome, valor, marca, tipo, TipoDeCarne.codTipoCarne FROM Carne, TipoDeCarne WHERE soundex(nome) = soundex('"+nome+"') AND TipoDeCarne.codTipoCarne = Carne.codTipoCarne ORDER BY codCarne");
    }

    public Carne retrieveById(int id) {
        Carne carne = null;
        List<Carne> contatos = this.retrieveGeneric("SELECT * FROM Fornecedor WHERE id="+id);
        if(!contatos.isEmpty()){
            carne = contatos.get(0);
        }
        return carne;
    }

    public boolean update(Carne carne) {
        PreparedStatement stmt;
        instance.conexao();
        try {
            stmt = con.prepareStatement("UPDATE TipoDeCarne SET valor=? WHERE codTipoCarne = ?");
            stmt.setDouble(1, carne.getValorCusto());
            stmt.setInt(2, carne.getCodTipo());
            int update = executeUpdate(stmt);
            if (update == 1) {
                JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        instance.desconecta();
        return false;
    }

    public void delete(Carne carne) {
        PreparedStatement stmt;
        instance.conexao();
        try {
            stmt = con.prepareStatement("DELETE FROM Carne WHERE codCarne = ?;DELETE FROM TipoDeCarne WHERE codTipoCarne = ?");
            stmt.setInt(1, carne.getIdProduto());
            stmt.setInt(2, carne.getCodTipo());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
        instance.desconecta();
    }

    public List<Carne> retrieveView() {
        return this.retrieveGenericView("SELECT * FROM view_CarnesDisponiveis");
    }
    
        private Carne buildObjectIdCarne(ResultSet rs) {
        Carne carne = null;
        try {
            carne = new Carne();
            carne.setCodTipo(rs.getInt("codTipoCarne"));
        } catch (SQLException e) {
            
        }
        return carne;
    } 

    public List<Carne> retrieveId(String query) {
        instance.conexao();
        PreparedStatement stmt;
        List<Carne> carnes = new ArrayList<>();
        ResultSet rs;
        try {
            instance.conexao();
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                carnes.add(buildObjectIdCarne(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        instance.desconecta();
        return carnes;
    }
        
    public List<Carne> getIdVenda(String nome, String marca, String tipo) {
        return this.retrieveId("select codTipoCarne from TipoDeCarne where SOUNDEX(nome) = soundex('"+nome+"') and soundex(marca) = soundex('"+marca+"') and soundex(tipo) = soundex('"+tipo+"');");
    }
}
