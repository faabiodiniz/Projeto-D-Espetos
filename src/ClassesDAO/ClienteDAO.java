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
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class ClienteDAO {
    ConexaoBD conexao = new ConexaoBD();
    Cliente cliente = new Cliente();
    
    public void Salvar(Cliente cliente){
        conexao.Conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Cliente(Nome, Telefone, CPF, Email) values (?,?,?,?)");
            pst.setString(1, cliente.getNomeCliente());
            pst.setString(3, cliente.getTelefoneCliente());
            pst.setString(4, cliente.getEmailCliente());
            pst.setString(5, cliente.getCpfCliente());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        conexao.desconecta();
    }
    
    public void ListarClientes(){
        
    }
}
