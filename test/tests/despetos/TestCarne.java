/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.Carne;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertEquals("Código inválido", 1, c.getIdProduto());
            Assert.assertEquals("Fabricação inválida", "10/10/2017", sourceFormat.format(c.getFabricacao()));
            Assert.assertEquals("Nome inválido", "Picanha", c.getNomeCarne());
            Assert.assertEquals("Quantidade inválida", 22f, c.getQuantidade(), 0.001);
            Assert.assertEquals("Validade inválida", "10/10/2020", sourceFormat.format(c.getValidade()));
            Assert.assertEquals("Valor Custo inválido", 15.32f, c.getValorCusto(), 0.001);
            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de quantidade - não deve ser possível existir uma quantidade negativo
     */
    @Test
    public void testQuantidadeConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", -1f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertEquals("O construtor aceitou quantidade negativa", 0f, c.getQuantidade(), 0.001);
            Carne c1 = new Carne(1, "Picanha", 0f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertEquals("O construtor não aceitou quantidade 0 (deveria aceitar)", 0f, c1.getQuantidade(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de quantidade - não deve ser possível existir uma quantidade negativo
     */
    @Test
    public void testQuantidadeSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            c.setQuantidade(-1);
            Assert.assertEquals("O Setter aceitou quantidade negativa", 22f, c.getQuantidade(), 0.001);
            c.setQuantidade(0);
            Assert.assertEquals("O Setter não aceitou quantidade 0 (deveria aceitar)", 0f, c.getQuantidade(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de validade - não deve ser possível a fabricação ser no mesmo dia ou posterior à validade
     */
    @Test
    public void testValidadeConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fabricacao = sourceFormat.parse("10/10/2017");
            Date validade = sourceFormat.parse("10/10/2015");
            Carne c = new Carne(1, "Picanha", 22f, fabricacao, validade, 15.32f);
            
            Assert.assertNotEquals("O construtor aceitou uma válidade anterior à fabricação", "10/10/2015", sourceFormat.format(c.getValidade()));
            
            validade = sourceFormat.parse("10/10/2017");
            c.setValidade(validade);
            Assert.assertNotEquals("O construtor aceitou uma válidade igual à fabricação", "10/10/2017", sourceFormat.format(c.getValidade()));
            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de validade - não deve ser possível a fabricação ser no mesmo dia ou posterior à validade
     */
    @Test
    public void testValidadeSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fabricacao = sourceFormat.parse("10/10/2017");
            Date validade = sourceFormat.parse("10/10/2018");
            Carne c = new Carne(1, "Picanha", 22f, fabricacao, validade, 15.32f);
            
            validade = sourceFormat.parse("10/10/2015");
            c.setValidade(validade);
            Assert.assertNotEquals("O Setter aceitou uma válidade anterior à fabricação", "10/10/2015", sourceFormat.format(c.getValidade()));
            
            validade = sourceFormat.parse("10/10/2017");
            c.setValidade(validade);
            Assert.assertNotEquals("O Setter aceitou uma válidade igual à fabricação", "10/10/2017", sourceFormat.format(c.getValidade()));
            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de valor de custo - não deve ser possível o valor de custo ser menor do que zero
     */
    @Test
    public void testValorCustoConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), -1f);
            Assert.assertEquals("O construtor aceitou valor de custo negativo", 0f, c.getValorCusto(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de valor de custo - não deve ser possível o valor de custo ser menor do que zero
     */
    @Test
    public void testValorCustoSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            c.setValorCusto(-1f);
            Assert.assertEquals("O Setter aceitou valor de custo negativo", 15.32f, c.getValorCusto(), 0.001);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de nome - não deve ser possível o nome ser vazio ou nulo
     */
    @Test
    public void testNomeConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertNotEquals("O construtor aceitou um nome vazio", "", c.getNomeCarne());
            Carne c1 = new Carne(1, null, 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertNotEquals("O construtor aceitou um nome null", null, c1.getNomeCarne());
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de nome - não deve ser possível o nome ser vazio ou nulo
     */
    @Test
    public void testNomeSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            c.setNomeCarne("");
            Assert.assertNotEquals("O Setter aceitou um nome vazio", "", c.getNomeCarne());
            c.setNomeCarne(null);
            Assert.assertNotEquals("O Setter aceitou um nome vazio", null, c.getNomeCarne());
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de datas - não deve ser possível inserir uma data nula
     */
    @Test
    public void testDatasConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "", 22f, null, sourceFormat.parse("10/10/2020"), 15.32f);
            Assert.assertNotEquals("O construtor aceitou um data de fabricação nula", null, c.getFabricacao());
            Carne c1 = new Carne(1, null, 22f, sourceFormat.parse("10/10/2017"), null, 15.32f);
            Assert.assertNotEquals("O construtor aceitou um data de validade nula", null, c1.getValidade());
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
    
    /**
     * Teste de datas - não deve ser possível inserir uma data nula
     */
    @Test
    public void testDatasSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f);
            
            c.setFabricacao(null);
            Assert.assertNotEquals("O Setter aceitou um data de fabricação nula", null, c.getFabricacao());
            c.setValidade(null);
            Assert.assertNotEquals("O Setter aceitou um data de validade nula", null, c.getValidade());
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
}
