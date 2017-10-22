/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

public class Licenca {
    private final String licenca;
    private String status; //Ativo ou Desativo
    private static String nroLicenca;
    private int i;
    
    public Licenca(){
        this.licenca = "";
        this.status = "Desativo";
    }
    
    public void verificarLicenca(String nroLicenca){
        
    }
    
    public String getLicenca(){
        return this.licenca;
    }
}
