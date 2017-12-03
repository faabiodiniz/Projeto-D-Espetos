/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import static Controle.ConexaoBD.con;
import Controle.ControlLicenca;
import d.espetos.Cliente;
import d.espetos.Licenca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class LicencaDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    private static LicencaDAO instance;
    
    public static LicencaDAO getInstance() {
        if (instance == null) {
            instance = new LicencaDAO();
            con = instance.conexao();
        }
        return instance;
    }
    
    private Licenca buildObject(ResultSet rs) {
        Licenca licenca = null;
        try {
            licenca = new Licenca(rs.getString("Licenca"), rs.getInt("Status"));
        } catch (SQLException e) {
        }
        return licenca;
    }
    public List<Licenca> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Licenca> licenca = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = con.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                licenca.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return licenca;
    }
    public static boolean verificaSerial(String nroLicenca){
        instance.conexao();
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("SELECT * FROM Serial WHERE Licenca=?");
            stmt.setString(1, nroLicenca);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            if(rs.getString("Licenca").equals(nroLicenca) && rs.getInt("Status") == 0){
                return true;
            } else {
                //Serial ja utilizado
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public boolean update(String serial) {
        PreparedStatement stmt;
        instance.conexao();
        try {
            stmt = con.prepareStatement("UPDATE Serial SET Status=1 WHERE Licenca = ?");
            stmt.setString(1, serial);
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        instance.desconecta();
        return false;
    }
}
