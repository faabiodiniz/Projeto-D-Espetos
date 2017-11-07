/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.ClienteDAO;
import d.espetos.Cliente;
import d.espetos.Fisico;
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

    /**
     *
     * @param nome
     * @param cpf
     * @param email
     * @param telefone
     */
    public static void criarCliente(String nome, String cpf, String email, String telefone){
        ClienteDAO.getInstance().Salvar(nome, cpf, email, telefone);
    }
    
}
