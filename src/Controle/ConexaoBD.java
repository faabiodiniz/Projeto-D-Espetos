/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    String driver = "org.gjt.mm.mysql.Driver";
    String serverName = "jdbc:mysql://localhost";
    String mydatabase = "d'espetos";
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    String username = "root";
    String password = "";
    
    public void Conexao(){
        try {
            System.setProperty("jdbc.Drivers", serverName);
            con = DriverManager.getConnection(serverName, username, password);
            JOptionPane.showMessageDialog(null, "Login feito!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Login nao rolou!\n" + ex.getMessage());
        }
    }
    public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nao desconectou\n" + ex.getMessage());
        }
    }
}

