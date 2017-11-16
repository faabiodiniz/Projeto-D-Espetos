/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.LicencaDAO;
import static Controle.ConexaoBD.con;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import d.espetos.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author faad2
 */
public class ControlLicenca {
    public static boolean verificaLicenca(String licenca){
        return LicencaDAO.getInstance().verificaSerial(licenca);
    }
    
    public static void updateLicenca(String serial){
        LicencaDAO.getInstance().update(serial);
    }
}
