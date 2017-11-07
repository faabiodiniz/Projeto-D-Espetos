/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author faad2
 */
public class ConexaoBD {
    public static Statement stm;
    public static ResultSet rs;
    public static Connection con;
    String mydatabase = "despetos";
    String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=" + mydatabase;
    String username = "sa";
    String password = "sqlserverbd";
    
    protected Connection conexao(){
        try {
            System.setProperty("jdbc.Drivers", connectionUrl);
            con = DriverManager.getConnection(connectionUrl, username, password);
            JOptionPane.showMessageDialog(null, "Login no BD realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao realizar login no BD!\n" + ex.getMessage());
        }
        return con;
    }
    protected void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nao desconectou\n" + ex.getMessage());
        }
    }
    protected ResultSet getResultSet(PreparedStatement queryStatement) throws SQLException {
        ResultSet rs;
        rs = queryStatement.executeQuery();
        return rs;
    }

    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        int update;
        update = queryStatement.executeUpdate();
        return update;
    }
}

