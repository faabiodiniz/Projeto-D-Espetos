/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class ExceptionCampoVazio extends RuntimeException{

    ExceptionCampoVazio(String campo) {
        JOptionPane.showMessageDialog(null, "O campo " + campo + "deve ser preenchido.");
    }
}
