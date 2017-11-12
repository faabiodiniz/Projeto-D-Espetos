/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.VendedorRepresentante;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestVendedorRepresentante {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        Assert.fail("O Vendedor Representante possui um ID que só é possível pegar, e não settar nem passar por construtor");
        Assert.fail("No banco, o vendedor representante possui um fornecedor, e não o contrário");
        VendedorRepresentante v = new VendedorRepresentante("vendedor", "v@endedor.com", "(11) 1515-1515");
        Assert.assertEquals("Email inválido", "v@endedor.com", v.getEmail()); 
        Assert.assertEquals("Nome inválido", "vendedor", v.getNome()); 
        Assert.assertEquals("Telefone inválido", "(11) 1515-1515", v.getTelefone()); 
    }
    
    /**
     * Teste do nome - o nome não pode ser vazio nem nulo
     */
    @Test
    public void testNomeConstrutor() {
        VendedorRepresentante v = new VendedorRepresentante("", "v@endedor.com", "(11) 1515-1515");
        Assert.assertNotEquals("O construtor permitiu o nome ser vazio", "", v.getNome()); 
        VendedorRepresentante v1 = new VendedorRepresentante(null, "v@endedor.com", "(11) 1515-1515");
        Assert.assertNotEquals("O construtor permitiu o nome ser null", null, v1.getNome()); 
    }
}
