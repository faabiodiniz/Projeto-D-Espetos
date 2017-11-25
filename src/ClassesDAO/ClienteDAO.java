/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Cliente;
import d.espetos.ExceptionTest;
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
public class ClienteDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Cliente cliente = new Cliente();
    private static ClienteDAO instance;
    
    public void Salvar(String nome, String cpf, String email, String telefone, String tipo){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Cliente(nome, telefone, email, cpfcnpj, tipo) values (?,?,?,?,?)");
            pst.setString(1, nome);
            pst.setString(2, telefone);
            pst.setString(3, email);
            pst.setString(4, cpf);
            pst.setString(5, tipo);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }
    
    
    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
            con = instance.conexao();
        }
        return instance;
    }
    
    private Cliente buildObject(ResultSet rs) {
        Cliente cliente = null;
        try {
            cliente = new Cliente(rs.getInt("codCliente"), rs.getString("nome"), rs.getString("telefone"), rs.getString("email"), rs.getString("tipo"), rs.getString("cpfcnpj"));
        } catch (SQLException e) {
        }
        return cliente;
    }
        
    public List<Cliente> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Cliente> contatos = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                contatos.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return contatos;
    }

    public List<Cliente> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM Cliente ORDER BY codCliente");
    }

    public List<Cliente> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM Cliente WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }

    public Cliente retrieveById(int id) {
        Cliente cliente = null;
        List<Cliente> contatos = this.retrieveGeneric("SELECT * FROM Cliente WHERE codCliente="+id);
        if(!contatos.isEmpty()){
            cliente = contatos.get(0);
        }
        return cliente;
    }

    public boolean update(Cliente cliente) {
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("UPDATE Cliente SET nome=?, email=?, telefone=?, tipo=?, cpfcnpj=? WHERE codCliente = ?");
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getEmailCliente());
            stmt.setString(3, cliente.getTelefoneCliente());
            stmt.setString(4, cliente.getTipo());
            stmt.setString(5, cliente.getCpfcnpj());
            stmt.setInt(6, cliente.getIdCliente());
            int update = executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        return false;
    }

    public void delete(Cliente cliente) {
        PreparedStatement stmt;
        try {
            stmt = conexao.con.prepareStatement("DELETE FROM Cliente WHERE codCliente = ?");
            stmt.setInt(1, cliente.getIdCliente());
            executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
}
