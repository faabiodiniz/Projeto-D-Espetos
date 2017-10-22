/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import d.espetos.Carne;
import d.espetos.Estoque;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestEstoque {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne("Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Estoque e = new Estoque(c, 20, 32.3f);
            Assert.assertEquals("Carne - Fabricação inválida", "10/10/2017", sourceFormat.format(e.getC().getFabricacao()));
            Assert.assertEquals("Carne - Nome inválido", "Picanha", e.getC().getNomeCarne());
            Assert.assertEquals("Carne - Quantidade inválida", 22f, e.getC().getQuantidade(), 0.001);
            Assert.assertEquals("Carne - Validade inválida", "10/10/2020", sourceFormat.format(e.getC().getValidade()));
            Assert.assertEquals("Carne - Valor Custo inválido", 15.32f, e.getC().getValorCusto(), 0.001);
            Assert.assertEquals("Quantidade inválida", 20, e.getQuantidade());
            Assert.assertEquals("Valor inválido", 32.3f, e.getValorVenda(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
    
    /**
     * Teste do Set e Get C
     */
    @Test
    public void testSetGetC() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c1 = new Carne("Bonetp", 25.32f, sourceFormat.parse("09/03/2015"), sourceFormat.parse("13/10/2011"), 19f);
            Carne c = new Carne("Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Estoque e = new Estoque(c1, 20, 32.3f);
            e.setC(c);
            Assert.assertEquals("Carne - Fabricação inválida", "10/10/2017", sourceFormat.format(e.getC().getFabricacao()));
            Assert.assertEquals("Carne - Nome inválido", "Picanha", e.getC().getNomeCarne());
            Assert.assertEquals("Carne - Quantidade inválida", 22f, e.getC().getQuantidade(), 0.001);
            Assert.assertEquals("Carne - Validade inválida", "10/10/2020", sourceFormat.format(e.getC().getValidade()));
            Assert.assertEquals("Carne - Valor Custo inválido", 15.32f, e.getC().getValorCusto(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
}
