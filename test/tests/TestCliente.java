/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import d.espetos.Cliente;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Cliente c = new Cliente("construtor", "(11) 1111-1222", "con@tr.com", "Ruaa", "bairro", 3, sourceFormat.parse("23/02/1997"));
            Assert.assertEquals("Bairro inválido", "bairro", c.getBairro());
            Assert.assertEquals("Email inválido", "con@tr.com", c.getEmailCliente());      
            Assert.assertEquals("Rua inválida", "Ruaa", c.getEndereco());    
            Assert.assertEquals("Nascimento inválido", "23/02/1997", sourceFormat.format(c.getNascimento()));
            Assert.assertEquals("Nome inválido", "construtor", c.getNomeCliente());
            Assert.assertEquals("Numero inválido", 3, c.getNumero());
            Assert.assertEquals("Telefone inválido", "(11) 1111-1222", c.getTelefoneCliente());            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        }
    }
}
