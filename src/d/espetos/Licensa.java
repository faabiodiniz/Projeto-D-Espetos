/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

import java.util.Scanner;

/**
 *
 * @author faad2
 */
public class Licensa {
    private final String licensa;
    private String status; //Ativo ou Desativo
    private static String nroLicensa;
    private int i;
    
    public Licensa(){
        this.licensa = "";
        this.status = "Desativo";
    }
    
    public void verificarLicensa(String nroLicensa){
        
    }
    
    private void validarLicensa(){
        
    }
    public String getLicensa(){
        return this.licensa;
    }
}
