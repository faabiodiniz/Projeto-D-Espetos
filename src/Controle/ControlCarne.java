/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.CarneDAO;
import d.espetos.Carne;
import java.util.List;

/**
 *
 * @author faad2
 */
public class ControlCarne {
    public static void criarEstoque(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo, String marca){
        CarneDAO.getInstance().Salvar(nome, valor, fabricacao, validade, quantidade, tipo, marca, 0);
    }
    
    public static List<Carne> getListOfCarne(){
        return CarneDAO.getInstance().retrieveAll();
    }
    
    public static List<Carne> getListOfCarneNome(String nome){
        return CarneDAO.getInstance().retrieveLike(nome);
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
        return CarneDAO.getInstance().retrieveAllOrderById();
    }
    
    public static Carne getCarneById(int id){
        Carne carne = CarneDAO.getInstance().retrieveById(id);
        return carne;
    }
    
    public static void updateCarne(Carne c){
        CarneDAO.getInstance().update(c);
    }
    
    public static List<Carne> getListOfCarnesView(){
        System.out.println("Passou no getView!");
        return CarneDAO.getInstance().retrieveView();
    }
    
    public static String format(double x){
        return String.format("%.2f", x);
    }
    
}
