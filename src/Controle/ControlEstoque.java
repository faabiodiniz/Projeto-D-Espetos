/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.EstoqueDAO;
import d.espetos.Carne;
import java.util.Date;
import java.util.List;

/**
 *
 * @author faad2
 */
public class ControlEstoque {
    public static void criarEstoque(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo, String marca){
        EstoqueDAO.getInstance().Salvar(nome, valor, fabricacao, validade, quantidade, tipo, marca);
    }
    
    public static List<Carne> getListOfCarne(){
        return EstoqueDAO.getInstance().retrieveAll();
    }
    
    public static List<Carne> getListOfCarneNome(String nome){
        return EstoqueDAO.getInstance().retrieveLike(nome);
    }
        
    public static Carne[] getListOfCarneAsArray(){
        List<Carne> list = getListOfCarne();
        Carne[] vetCliente = new Carne[list.size()];
        int i = 0;
        for(Carne c : list){
            vetCliente[i++] = c;
        }
        return vetCliente;
    }    
    
    public static List<Carne> getListOfCarneOrderById(){
        return EstoqueDAO.getInstance().retrieveAllOrderById();
    }
    
    public static Carne getCarneById(int id){
        Carne carne = EstoqueDAO.getInstance().retrieveById(id);
        return carne;
    }
    
    public static void updateCarne(Carne c){
        EstoqueDAO.getInstance().update(c);
    }
    
}
