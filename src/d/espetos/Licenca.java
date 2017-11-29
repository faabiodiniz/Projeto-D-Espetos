/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;


public class Licenca {
    private static String licenca;
    private static int status; //1 = Ativo ou 0 = Desativo
    
    public Licenca(){
        
    }
    public Licenca(String serial, int status) {
        this.licenca = serial;
        this.setStatus(status);
    }
    
    public String getLicenca(){
        return this.licenca;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if ((status != 0) || (status != 1)) {
            throw new ExceptionTest();
        }
        this.status = status;
    }
    
}
