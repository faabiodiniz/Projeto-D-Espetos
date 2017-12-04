/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import static Controle.ConexaoBD.con;
import d.espetos.Cliente;
import d.espetos.Fornecedor;
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
public class FornecedorDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Fornecedor fornecedor = new Fornecedor();
    private static FornecedorDAO instance;
    
    
    public void Salvar(String nome, String telefone, String cnpj, String email, String rua, String numRua, String bairro, String cidade, String estado){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Fornecedor(nome, telefone, CNPJ, email, rua, numeroRua, bairro ,cidade, estado) values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, nome);
            pst.setString(2, telefone);
            pst.setString(4, email);
            pst.setString(3, cnpj);
            pst.setString(5, rua);
            pst.setString(6, numRua);
            pst.setString(7, bairro);
            pst.setString(8, cidade);
            pst.setString(9, estado);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
        }
        instance.desconecta();
    }
    
    public static FornecedorDAO getInstance() {
    if (instance == null) {
        instance = new FornecedorDAO();
        con = instance.conexao();
    }
    return instance;
    }
        
    private Fornecedor buildObject(ResultSet rs) {
        Fornecedor fornecedor = null;
        try {
            fornecedor = new Fornecedor(rs.getInt("codFornecedor"), rs.getString("cnpj"), rs.getString("nome"), rs.getString("email"), rs.getString("telefone"),  rs.getString("rua"), rs.getString("bairro"), rs.getInt("numeroRua"), rs.getString("cidade"), rs.getString("estado"));       
        } catch (SQLException e) {
        }
        return fornecedor;
    }
        
    public List<Fornecedor> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Fornecedor> fornecedores = new ArrayList<>();
        ResultSet rs;
        try {
            conexao();
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                fornecedores.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        desconecta();
        return fornecedores;
    }

    public List<Fornecedor> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM Fornecedor ORDER BY codFornecedor");
    }

    public List<Fornecedor> retrieveAllOrderById() {
        return this.retrieveGeneric("SELECT * FROM Fornecedor ORDER BY id");
    }

    public List<Fornecedor> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM Fornecedor WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }

    public Fornecedor retrieveById(int id) {
        Fornecedor fornecedor = null;
        List<Fornecedor> contatos = this.retrieveGeneric("SELECT * FROM Fornecedor WHERE id="+id);
        if(!contatos.isEmpty()){
            fornecedor = contatos.get(0);
        }
        return fornecedor;
    }

    public boolean update(Fornecedor fornecedor) {
        PreparedStatement stmt;
        System.out.println("id do fornecedor: "+ fornecedor.getIdFornecedor()+"Cnpj Editado: " + fornecedor.getCnpj());
        try {
            conexao();
            stmt = con.prepareStatement("UPDATE Fornecedor SET nome=?, email=?, telefone=?, rua=?, numeroRua=?, bairro=?, cidade=?, estado=?, cnpj=?  WHERE codFornecedor = ?");
            stmt.setString(1, fornecedor.getNomeFornecedor());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getRua());
            stmt.setInt(5, fornecedor.getNumero());
            stmt.setString(6, fornecedor.getBairro());
            stmt.setString(7, fornecedor.getCidade());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCnpj());
            stmt.setInt(10, fornecedor.getIdFornecedor());
            int update = executeUpdate(stmt);
            if (update == 1) {
                JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("erro: " + ex);
        }
        return false;
    }

    public void delete(Fornecedor fornecedor) {
        PreparedStatement stmt;
        conexao();
        try {
            stmt = con.prepareStatement("DELETE FROM Fornecedor WHERE codFornecedor = ?");
            stmt.setInt(1, fornecedor.getIdFornecedor());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
        desconecta();
    }
    
}
