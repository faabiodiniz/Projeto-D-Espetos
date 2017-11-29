/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Carne;
import d.espetos.ExceptionTest;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class CarneDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Carne carne = new Carne();
    private static CarneDAO instance;
    
    public void Salvar(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo, String marca){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO TipoDeCarne(nome, valor, marca, tipo) values(?,?,?,?);"
                   + "INSERT INTO Carne(dataFabricacao, dataValidade, quantidade) values (?,?,?)");
            pst.setString(1, nome);
            pst.setDouble(2, valor);
            pst.setString(3, marca);
            pst.setString(4, tipo);
            pst.setString(5, fabricacao);
            pst.setString(6, validade);
            pst.setDouble(7, quantidade);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
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
                System.out.println("Carne: " + buildObjectView(rs).getNomeCarne());
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
        return this.retrieveGeneric("SELECT * FROM Fornecedor WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
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
        try {
            stmt = con.prepareStatement("UPDATE TipoDeCarne SET valor=? WHERE codTipoCarne = ?");
            stmt.setDouble(1, carne.getValorCusto());
            stmt.setInt(2, carne.getCodTipo());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        return false;
    }

    public void delete(Carne carne) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("DELETE FROM Carne WHERE codCarne = ?;DELETE FROM TipoDeCarne WHERE codTipoCarne = ?");
            stmt.setInt(1, carne.getIdProduto());
            stmt.setInt(2, carne.getCodTipo());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }

    public List<Carne> retrieveView() {
        return this.retrieveGenericView("SELECT * FROM view_CarnesDisponiveis");
    }

}
