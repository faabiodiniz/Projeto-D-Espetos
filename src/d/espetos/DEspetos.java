/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;
import Controle.ConexaoBD;
import Visao.menuInicial;
import Visao.verificarSerial;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class DEspetos {

    public static void main(String[] args) {
        ConexaoBD bdConnection = new ConexaoBD();
        bdConnection.Conexao();
        
        File file = new File("javaX.txt");
        Licenca licensa = new Licenca();        
        if(file.exists()){
            menuInicial principal = new menuInicial();
            principal.setVisible(true);
        }
        else{
            verificarSerial serial = new verificarSerial();
            serial.setVisible(true);
        }
        
        Calendar c = Calendar.getInstance();
        c.set(1997,03,22);
        
    }

	private static Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}    
}
