/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

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
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Estoque e = new Estoque(c, 20, 32.3f);
            Assert.assertEquals("Carne - Código inválido", 1, e.getC().getIdProduto());
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
            Carne c1 = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Estoque e = new Estoque(c1, 20, 32.3f);
            e.setC(c);
            Assert.assertEquals("Carne - Código inválido", 1, e.getC().getIdProduto());
            Assert.assertEquals("Carne - Fabricação inválida", "10/10/2017", sourceFormat.format(e.getC().getFabricacao()));
            Assert.assertEquals("Carne - Nome inválido", "Picanha", e.getC().getNomeCarne());
            Assert.assertEquals("Carne - Quantidade inválida", 22f, e.getC().getQuantidade(), 0.001);
            Assert.assertEquals("Carne - Validade inválida", "10/10/2020", sourceFormat.format(e.getC().getValidade()));
            Assert.assertEquals("Carne - Valor Custo inválido", 15.32f, e.getC().getValorCusto(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
    
    /**
     * Teste de quantidade - a quantidade não pode ser negativa
     */
    @Test
    public void testQuantidadeConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Estoque e = new Estoque(c, -1, 32.3f);
            Assert.assertEquals("O construtor aceitou quantidade negativa", 0, e.getQuantidade());
            Estoque e1 = new Estoque(c, 0, 32.3f);
            Assert.assertEquals("O construtor não aceitou quantidade 0 (deveria aceitar)", 0, e1.getQuantidade());
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
    
    /**
     * Teste de quantidade - a quantidade não pode ser negativa
     */
    @Test
    public void testQuantidadeSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Estoque e = new Estoque(c, 15, 32.3f);
            e.setQuantidade(-1);
            Assert.assertEquals("O Setter aceitou quantidade negativa", 15, e.getQuantidade());
            e.setQuantidade(0);
            Assert.assertEquals("O Setter não aceitou quantidade 0 (deveria aceitar)", 0, e.getQuantidade());
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
    
    /**
     * Teste de valor de venda - o valor de venda não pode ser menor ou igual a 0
     */
    @Test
    public void testValorVendaConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Estoque e = new Estoque(c, 15, -1f);
            Assert.assertNotEquals("O construtor aceitou valor de venda negativo", -1f, e.getValorVenda(), 0.001);
            Estoque e1 = new Estoque(c, 15, 0f);
            Assert.assertNotEquals("O construtor aceitou valor de venda negativo", 0f, e1.getValorVenda(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
    
    /**
     * Teste de valor de venda - o valor de venda não pode ser menor ou igual a 0
     */
    @Test
    public void testValorVendaSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Estoque e = new Estoque(c, 15, 15f);
            e.setValorVenda(-1f);
            Assert.assertNotEquals("O Setter aceitou valor de venda negativo", -1f, e.getValorVenda(), 0.001);
            e.setValorVenda(0f);
            Assert.assertNotEquals("O Setter aceitou valor de venda negativo", 0f, e.getValorVenda(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    } 
}
