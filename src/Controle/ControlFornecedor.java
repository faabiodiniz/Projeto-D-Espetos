/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.FornecedorDAO;
import d.espetos.Fornecedor;
import java.util.List;

/**
 *
 * @author faad2
 */
public class ControlFornecedor {
 
    public static void criarFornecedor(String nome, String telefone, String cnpj, String email, String rua, String numRua, String bairro, String cidade, String estado){
        FornecedorDAO.getInstance().Salvar(nome, telefone, cnpj, email, rua, numRua, bairro, cidade, estado);
    }
    
    public static List<Fornecedor> getListOfFornecedor(){
        return FornecedorDAO.getInstance().retrieveAll();
    }
    
    public static List<Fornecedor> getListOfFornecedorNome(String nome){
        return FornecedorDAO.getInstance().retrieveLike(nome);
    }
        
    public static Fornecedor[] getListOfFornecedorAsArray(){
        List<Fornecedor> list = getListOfFornecedor();
        Fornecedor[] vetCliente = new Fornecedor[list.size()];
        int i = 0;
        for(Fornecedor c : list){
            vetCliente[i++] = c;
        }
        return vetCliente;
    }    
    
    public static List<Fornecedor> getListOfFornecedorOrderById(){
        return FornecedorDAO.getInstance().retrieveAllOrderById();
    }
    
    public static Fornecedor getFornecedorById(int id){
        Fornecedor fornecedor = FornecedorDAO.getInstance().retrieveById(id);
        return fornecedor;
    }
    
    public static void updateFornecedor(Fornecedor f){
        FornecedorDAO.getInstance().update(f);
    }
}
