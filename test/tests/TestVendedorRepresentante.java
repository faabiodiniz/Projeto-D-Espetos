/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

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
        VendedorRepresentante v = new VendedorRepresentante("vendedor", "v@endedor.com", "(11) 1515-1515");
        Assert.assertEquals("Email inválido", "v@endedor.com", v.getEmail()); 
        Assert.assertEquals("Nome inválido", "vendedor", v.getNome()); 
        Assert.assertEquals("Telefone inválido", "(11) 1515-1515", v.getTelefone()); 
    }
}
