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
public class ClienteDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Cliente cliente = new Cliente();
    private static ClienteDAO instance;
    
    public void Salvar(String nome, String cpf, String email, String telefone){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Cliente(nome, telefone, email, cpfcnpj) values (?,?,?,?)");
            pst.setString(1, nome);
            pst.setString(2, telefone);
            pst.setString(3, email);
            pst.setString(4, cpf);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }
    
    public void ListarClientes(){
        
    }
    
    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
            con = instance.conexao();
        }
        return instance;
    }
}
