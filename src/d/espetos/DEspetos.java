/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;
import Controle.ConexaoBD;
import Visao.MenuInicial;
import Visao.VerificarSerial;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class DEspetos {

    public static void main(String[] args) {
        ConexaoBD bdConnection = new ConexaoBD();
        //bdConnection.conexao();
        
        File file = new File("javaX.txt");        
        if(file.exists()){
            MenuInicial principal = new MenuInicial();
            principal.setVisible(true);
        }
        else{
            VerificarSerial serial = new VerificarSerial();
            serial.setVisible(true);
        }
    }
}
