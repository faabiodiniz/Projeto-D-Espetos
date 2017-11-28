/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.Cliente;
import d.espetos.ExceptionTest;
import org.junit.*;

/**
 *
 * @author rafae
 */
public class TestCliente {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
        Assert.assertEquals("Email inválido", "con@tr.com", c.getEmailCliente());
        Assert.assertEquals("Nome inválido", "construtor", c.getNomeCliente());
        Assert.assertEquals("Código inválido", 1, c.getIdCliente());
        Assert.assertEquals("Telefone inválido", "(11) 1111-1222", c.getTelefoneCliente());
        Assert.assertEquals("Tipo inválido", "Físico", c.getTipo());
        Assert.assertEquals("CpfCnpj inválido", "123.456.789-10", c.getCpfcnpj());
    }
    
    /**
     * Teste de nome - o nome não pode ser vazio ou null
     */
    @Test
    public void testNomeConstrutor() {
        try {
            Cliente c = new Cliente(1, "", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
            Assert.fail("O construtor permitiu o nome ser vazio");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Cliente c1 = new Cliente(1, null, "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
            Assert.fail("O construtor permitiu o nome ser nulo");
        } catch (ExceptionTest ex){
            
        }
    } 
    
    /**
     * Teste de nome - o nome não pode ser vazio ou null
     */
    @Test
    public void testNomeSetter() {
        try {
            Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
            c.setNomeCliente("");
            Assert.fail("O Setter permitiu o nome ser vazio");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
            c.setNomeCliente(null);
            Assert.fail("O Setter permitiu o nome ser nulo");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de nome - o tipo deve poder ser apenas "Físico" ou "Jurídico"
     */
    @Test
    public void testTipoConstrutor() {
        try {
            Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "asdda", "123.456.789-10");
            Assert.fail("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico' - test1");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Cliente c2 = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "", "123.456.789-10");
            Assert.fail("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico' - test2");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Cliente c2 = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", null, "123.456.789-10");
            Assert.fail("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico' - test3");
        } catch (ExceptionTest ex){
            
        }
    }
    
    /**
     * Teste de nome - o tipo deve poder ser apenas "Físico" ou "Jurídico"
     */
    @Test
    public void testTipoSetter() {
        try {
            Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Fisico", "123.456.789-10");
            c.setTipo("asdda");
            Assert.fail("O setter aceitou um tipo diferente de 'Físico' ou 'Jurídico' - test1");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Fisico", "123.456.789-10");
            c.setTipo("");
            Assert.fail("O setter aceitou um tipo diferente de 'Físico' ou 'Jurídico' - test2");
        } catch (ExceptionTest ex){
            
        }
        
        try {
            Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Fisico", "123.456.789-10");
            c.setTipo(null);
            Assert.fail("O setter aceitou um tipo diferente de 'Físico' ou 'Jurídico' - test3");
        } catch (ExceptionTest ex){
            
        }
    }
}
