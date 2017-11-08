/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

import Visao.MenuInicial;
import Visao.VerificarSerial;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Licenca {
    private static String licenca;
    private String status; //Ativo ou Desativo
    
    public Licenca(){
        
    }
    public Licenca(String serial, String status){
        this.licenca = serial;
        this.status = "Desativo";
    }
    
    public String getLicenca(){
        return this.licenca;
    }
}
