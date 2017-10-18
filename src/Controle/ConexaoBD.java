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
    String mydatabase = "d'espetos";
    String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=" + mydatabase;
    String username = "sa";
    String password = "sqlserverbd";
    
    public void Conexao(){
        try {
            System.setProperty("jdbc.Drivers", connectionUrl);
            con = DriverManager.getConnection(connectionUrl, username, password);
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

