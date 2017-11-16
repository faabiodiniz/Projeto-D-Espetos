/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.ClienteDAO;
import d.espetos.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class ControlCliente {
    ConexaoBD conexao = new ConexaoBD();
    Cliente cliente = new Cliente();

    /**
     *
     * @param nome
     * @param cpf
     * @param email
     * @param telefone
     * @param tipo
     */
    public static void criarCliente(String nome, String cpf, String email, String telefone, String tipo){
        ClienteDAO.getInstance().Salvar(nome, cpf, email, telefone, tipo);
    }
    
    public static List<Cliente> getListOfClientes(){
        return ClienteDAO.getInstance().retrieveAll();
    }
    
    public static List<Cliente> getListOfClientesNome(String nome){
        return ClienteDAO.getInstance().retrieveLike(nome);
    }
        
    public static Cliente[] getListOfClientesAsArray(){
        List<Cliente> list = getListOfClientes();
        Cliente[] vetCliente = new Cliente[list.size()];
        int i = 0;
        for(Cliente c : list){
            vetCliente[i++] = c;
        }
        return vetCliente;
    }    
    
    public static List<Cliente> getListOfClientesOrderById(){
        return ClienteDAO.getInstance().retrieveAllOrderById();
    }
    
    public static Cliente getClienteById(int id){
        Cliente cliente = ClienteDAO.getInstance().retrieveById(id);
        return cliente;
    }
    
    public static void updateCliente(Cliente c){
        ClienteDAO.getInstance().update(c);
    }
    
}
