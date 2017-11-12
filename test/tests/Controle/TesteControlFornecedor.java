/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.Controle;

import Controle.ControlFornecedor;
import d.espetos.Fornecedor;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TesteControlFornecedor {
    
    /**
     * Teste  Insert e Select
     */
    @Test
    public void testInsertSelect() {
        ControlFornecedor.criarFornecedor("Nome", "telefone", "10", null, "Rua", "5", "Bairro", "Cidade", "Estado");
        List<Fornecedor> lista = ControlFornecedor.getListOfFornecedorNome("Nome");
        Fornecedor f = ControlFornecedor.getFornecedorById(8);
        

        Assert.assertEquals("getListOfFornecedorNome - Bairro inválido", "Bairro", f.getBairro());
        Assert.assertEquals("getListOfFornecedorNome - Cidade inválida", "Cidade", f.getCidade());  
        Assert.assertEquals("getListOfFornecedorNome - Email inválido", null, f.getEmail());  
        Assert.assertEquals("getListOfFornecedorNome - Rua inválido", "Rua", f.getRua());
        Assert.assertEquals("getListOfFornecedorNome - Estado inválido", "Estado", f.getEstado());
        Assert.assertEquals("getListOfFornecedorNome - Nome inválido", "Nome", f.getNomeFornecedor());
        Assert.assertEquals("getListOfFornecedorNome - Numero inválido", 5, f.getNumero());
        Assert.assertEquals("getListOfFornecedorNome - Telefone inválido", "telefone", f.getTelefone());
        Assert.assertEquals("getListOfFornecedorNome - CNPJ inválido", "10", f.getCnpj()); 
        
        
        Assert.assertEquals("getFornecedorById - Bairro inválido", "Bairro", lista.get(0).getBairro());
        Assert.assertEquals("getFornecedorById - Cidade inválida", "Cidade", lista.get(0).getCidade());  
        Assert.assertEquals("getFornecedorById - Email inválido", null, lista.get(0).getEmail());  
        Assert.assertEquals("getFornecedorById - Rua inválido", "Rua", lista.get(0).getRua());
        Assert.assertEquals("getFornecedorById - Estado inválido", "Estado", lista.get(0).getEstado());
        Assert.assertEquals("getFornecedorById - Nome inválido", "Nome", lista.get(0).getNomeFornecedor());
        Assert.assertEquals("getFornecedorById - Numero inválido", 5, lista.get(0).getNumero());
        Assert.assertEquals("getFornecedorById - Telefone inválido", "telefone", lista.get(0).getTelefone());
        Assert.assertEquals("getFornecedorById - CNPJ inválido", "10", lista.get(0).getCnpj()); 
        
    }
}
