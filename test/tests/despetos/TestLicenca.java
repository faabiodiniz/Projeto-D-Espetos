/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.Licenca;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestLicenca {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        Assert.fail("O construtor requer o Status, mas não faz nada com o Status passado por parâmetro");
        Licenca l = new Licenca("123", 1);
        Assert.assertEquals("Licença inválida", "123", l.getLicenca());
    }
}
