/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.espetos;

import java.util.Calendar;

/**
 *
 * @author faad2
 */
public class Carne {

    private final String tipoCarne;
    private float precoCarne;
    private float quantidadeCarne;
    
    
    public Carne(String tipoCarne, float precoCarne, float quantidadeCarne){
        this.tipoCarne = tipoCarne;
        this.precoCarne = precoCarne;
        this.quantidadeCarne = quantidadeCarne;
    }

    private void setPreco(float preco){
        this.precoCarne = preco;
    }
    private void setQuantidade(float quantidade){
        this.quantidadeCarne = quantidade;
    }
    
    public String getTipo(){
        return this.tipoCarne;
    }
    
    public float getPreco(){
        return this.precoCarne;
    }
    
    public float getQuantidade(){
        return this.quantidadeCarne;
    }
    
}
