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
    private static int status; //1 = Ativo ou 0 = Desativo
    
    public Licenca(){
        
    }
    public Licenca(String serial, int status){
        this.licenca = serial;
        this.status = 0;
    }
    
    public String getLicenca(){
        return this.licenca;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
