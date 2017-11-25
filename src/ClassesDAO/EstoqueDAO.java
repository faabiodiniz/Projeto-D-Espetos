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
public class EstoqueDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Carne carne = new Carne();
    private static EstoqueDAO instance;
    
    public void Salvar(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo, String marca){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Carne(nome, valor, dataFabricacao, dataValidade, quantidade, tipo) values (?,?,?,?,?,?)");
            pst.setString(1, nome);
            pst.setDouble(2, valor);
            pst.setString(3, fabricacao);
            pst.setString(4, validade);
            pst.setDouble(5, quantidade);
            pst.setString(6, tipo);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }
    
    public static EstoqueDAO getInstance() {
        if (instance == null) {
            instance = new EstoqueDAO();
            con = instance.conexao();
        }
        return instance;
    }
        
    private Carne buildObject(ResultSet rs) {
        Carne carne = null;
        try {
            carne = new Carne(rs.getInt("codCarne"), rs.getString("nome"), rs.getDouble("quantidade"), rs.getDate("dataFabricacao"),rs.getDate("dataValidade"), rs.getDouble("valor"), rs.getString("tipo"), rs.getString("marca"));       
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

    public List<Carne> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM Carne ORDER BY codCarne");
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
            stmt = con.prepareStatement("UPDATE Carne SET nome=?, email=? , telefone=? WHERE id = ?");
            stmt.setString(1, carne.getNomeCarne());
            stmt.setDouble(2, carne.getQuantidade());
            stmt.setDouble(3, carne.getValorCusto());
            //stmt.setString(4, carne.getFabricacao());
            //stmt.setString(5, carne.getValidade());
            //stmt.setString(6, fornecedor.getBairro());
            //stmt.setString(7, fornecedor.getCidade());
            //stmt.setString(8, fornecedor.getEstado());
            stmt.setInt(4, carne.getIdProduto());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
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
            stmt = con.prepareStatement("DELETE FROM Carne WHERE id = ?");
            stmt.setInt(1, carne.getIdProduto());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
}
