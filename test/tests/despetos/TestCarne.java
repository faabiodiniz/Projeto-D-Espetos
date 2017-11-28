/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.Carne;
import d.espetos.ExceptionTest;
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
                                
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Assert.assertEquals("Código inválido", 1, c.getIdProduto());
            Assert.assertEquals("Fabricação inválida", "10/10/2017", sourceFormat.format(c.getFabricacao()));
            Assert.assertEquals("Nome inválido", "Picanha", c.getNomeCarne());
            Assert.assertEquals("Quantidade inválida", 22f, c.getQuantidade(), 0.001);
            Assert.assertEquals("Validade inválida", "10/10/2020", sourceFormat.format(c.getValidade()));
            Assert.assertEquals("Valor Custo inválido", 15.32f, c.getValorCusto(), 0.001);
            Assert.assertEquals("Tipo invalido", "Bovina", c.getTipo());
            Assert.assertEquals("Código tipo inválido", 1, c.getCodTipo());
            Assert.assertEquals("Marca inválida", "Friboi", c.getMarca());
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
            Carne c = new Carne(1, "Picanha", -1f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Assert.fail("O construtor aceitou quantidade negativa");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
        catch (ExceptionTest ex){
            
        }
        
        try {
            Carne c1 = new Carne(1, "Picanha", 0f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            Assert.fail("O construtor não aceitou quantidade 0 (deveria aceitar)");
        }
    }
    
    /**
     * Teste de quantidade - não deve ser possível existir uma quantidade negativo
     */
    @Test
    public void testQuantidadeSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            c.setQuantidade(-1);
            Assert.fail("O Setter aceitou quantidade negativa");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
        catch (ExceptionTest ex){
            
        }
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            c.setQuantidade(0);
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            Assert.fail("O Setter não aceitou quantidade 0 (deveria aceitar)");
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
            Carne c = new Carne(1, "Picanha", 22f, fabricacao, validade, 15.32f, "Bovina", "Friboi", 1);      
            Assert.fail("O construtor aceitou uma válidade anterior à fabricação");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Date fabricacao = sourceFormat.parse("10/10/2017");
            Date validade = sourceFormat.parse("10/10/2017");
            Carne c1 = new Carne(1, "Picanha", 22f, fabricacao, validade, 15.32f, "Bovina", "Friboi", 1);     
            Assert.fail("O construtor aceitou uma válidade igual à fabricação");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
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
            Carne c = new Carne(1, "Picanha", 22f, fabricacao, validade, 15.32f, "Bovina", "Friboi", 1);
            
            validade = sourceFormat.parse("10/10/2015");
            c.setValidade(validade);       
            Assert.fail("O Setter aceitou uma válidade anterior à fabricação");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Date fabricacao = sourceFormat.parse("10/10/2017");
            Date validade = sourceFormat.parse("10/10/2018");
            Carne c = new Carne(1, "Picanha", 22f, fabricacao, validade, 15.32f, "Bovina", "Friboi", 1);
            Assert.fail("O Setter aceitou uma válidade igual à fabricação");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de valor de custo - não deve ser possível o valor de custo ser menor do que zero
     */
    @Test
    public void testValorCustoConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), -1f, "Bovina", "Friboi", 1);
            Assert.fail("O construtor aceitou valor de custo negativo");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de valor de custo - não deve ser possível o valor de custo ser menor do que zero
     */
    @Test
    public void testValorCustoSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            c.setValorCusto(-1f);
            Assert.fail("O Setter aceitou valor de custo negativo");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de nome - não deve ser possível o nome ser vazio ou nulo
     */
    @Test
    public void testNomeConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Assert.fail("O construtor aceitou um nome vazio");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Carne c1 = new Carne(1, null, 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Assert.fail("O construtor aceitou um nome null");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de nome - não deve ser possível o nome ser vazio ou nulo
     */
    @Test
    public void testNomeSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            c.setNomeCarne("");
            Assert.fail("O Setter aceitou um nome vazio");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            c.setNomeCarne(null);
            Assert.fail("O Setter aceitou um nome null");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de datas - não deve ser possível inserir uma data nula
     */
    @Test
    public void testDatasConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, null, sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            Assert.fail("O construtor aceitou um data de fabricação nula");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Carne c1 = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), null, 15.32f, "Bovina", "Friboi", 1);
            Assert.fail("O construtor aceitou um data de validade nula");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de datas - não deve ser possível inserir uma data nula
     */
    @Test
    public void testDatasSetter() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            
            c.setFabricacao(null);
            Assert.fail("O Setter aceitou um data de fabricação nula");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Carne c = new Carne(1, "Picanha", 22f, sourceFormat.parse("10/10/2017"), sourceFormat.parse("10/10/2020"), 15.32f, "Bovina", "Friboi", 1);
            
            c.setValidade(null);
            Assert.fail("O Setter aceitou um data de validade nula");
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (ExceptionTest ex){
            
        }
    }
}
