/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.FornecedorDAO;

/**
 *
 * @author faad2
 */
public class ControlFornecedor {
 
    public static void criarFornecedor(String nome, String telefone, String cnpj, String email, String rua, String numRua, String bairro, String cidade, String estado){
        FornecedorDAO.getInstance().Salvar(nome, telefone, cnpj, email, rua, numRua, bairro, cidade, estado);
    }
}
