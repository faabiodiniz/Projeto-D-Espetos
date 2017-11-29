/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.ExceptionTest;
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
    public void testConstrutor1() {
        try {
            Licenca l = new Licenca("123", 1);
            Assert.assertEquals("Teste 1 - Licença inválida", "123", l.getLicenca());
            Assert.assertEquals("Teste 1 - Status inválido", 1, l.getStatus());
        } catch (ExceptionTest ex ) {
            
        }
        
        try {
            Licenca l2 = new Licenca("aaaa", 0);
            Assert.assertEquals("Teste 2 - Licença inválida", "aaaa", l2.getLicenca());
            Assert.assertEquals("Teste 2 - Status inválido", 0, l2.getStatus());
        } catch (ExceptionTest ex ) {
            
        }
        
        try {
            Licenca l3 = new Licenca("123", 33);
            Assert.fail("O construtor aceitou um status inválido");
        } catch (ExceptionTest ex ) {
            
        }
    }
    
    /**
     * Teste do setter e getter - status
     */
    @Test
    public void testSetGetStatus() {
        try {
            Licenca l = new Licenca("123", 0);
            l.setStatus(1);
            Assert.assertEquals("Teste 1 - Status inválido", 1, l.getStatus());
        } catch (ExceptionTest ex ) {
            
        }
        
        
        try {
            Licenca l2 = new Licenca("123", 1);
            l2.setStatus(0);
            Assert.assertEquals("Teste 1 - Status inválido", 0, l2.getStatus());
        } catch (ExceptionTest ex ) {
            
        }
        
        try {
            Licenca l3 = new Licenca("123", 0);
            l3.setStatus(33);
            Assert.fail("O Setter aceitou um status inválido");
        } catch (ExceptionTest ex ) {
            
        }
    }
}
