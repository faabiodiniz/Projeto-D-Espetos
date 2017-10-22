/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import d.espetos.Carne;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestCarne {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne("Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertEquals("Fabricação inválida", "10/10/2017", sourceFormat.format(c.getFabricacao()));
            Assert.assertEquals("Nome inválido", "Picanha", c.getNomeCarne());
            Assert.assertEquals("Quantidade inválida", 22f, c.getQuantidade(), 0.001);
            Assert.assertEquals("Validade inválida", "10/10/2020", sourceFormat.format(c.getValidade()));
            Assert.assertEquals("Valor Custo inválido", 15.32f, c.getValorCusto(), 0.001);
            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
}
