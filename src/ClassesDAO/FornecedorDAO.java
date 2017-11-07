/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class FornecedorDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Fornecedor fornecedor = new Fornecedor();
    private static FornecedorDAO instance;
    
    
    public void Salvar(Fornecedor fornecedor){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Fornecedor(nome, telefone, CNPJ, email, rua, numeroRua, bairro ,cidade, estado) values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, fornecedor.getNomeFornecedor());
            pst.setString(2, fornecedor.getTelefone());
            pst.setString(4, fornecedor.getEmail());
            pst.setString(3, fornecedor.getCnpj());
            pst.setString(5, fornecedor.getRua());
            pst.setString(6, fornecedor.getNumero());
            pst.setString(7, fornecedor.getBairro());
            pst.setString(8, fornecedor.getCidade());
            pst.setString(9, fornecedor.getEstado());
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
}
