/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ClassesDAO.EstoqueDAO;

/**
 *
 * @author faad2
 */
public class ControlEstoque {
    public static void criarEstoque(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo){
        EstoqueDAO.getInstance().Salvar(nome, valor, fabricacao, validade, quantidade, tipo);
    }
    
}
