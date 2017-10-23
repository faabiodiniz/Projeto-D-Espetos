/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import d.espetos.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class ControlCliente {
    ConexaoBD conexao = new ConexaoBD();
    Cliente cliente = new Cliente();
    
    public void Salvar(Cliente cliente){
        conexao.Conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO cliente (Nome, Telefone, E-mail, CPF) values (?,?,?,?)");
            pst.setString(1, cliente.getNomeCliente());
            pst.setString(3, cliente.getTelefoneCliente());
            pst.setString(4, cliente.getEmailCliente());
            pst.setString(5, cliente.getCpfCliente());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
        }
        conexao.desconecta();
    }
}
