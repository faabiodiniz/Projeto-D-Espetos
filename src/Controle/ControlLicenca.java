/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visao.MenuInicial;
import Visao.VerificarSerial;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import d.espetos.*;

/**
 *
 * @author faad2
 */
public class ControlLicenca {
    Licenca licenca = new Licenca();
    public void verificarLicenca(String nroLicenca){
        if(licenca.getLicenca().equals("xxxx-xxxx-xxxx")){
            MenuInicial principal = new MenuInicial();
            principal.setVisible(true);
            try {
                FileWriter arq = new FileWriter("javaX.txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.printf("Código serial utilizado: " + licenca);
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(VerificarSerial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Código Serial invalido");
            VerificarSerial Validacao = new VerificarSerial();
            Validacao.setVisible(true);
        }
    }
    
    public void criarLicenca(){
        
    }
}
