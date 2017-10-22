/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import d.espetos.Fisico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestFisico {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Fisico f = new Fisico("construtor", 35252597212, "(11) 1111-1222", "con@tr.com", "Ruaa", "bairro", 3, sourceFormat.parse("23/02/1997"));
            Assert.assertEquals("Bairro inválido", "bairro", f.getBairro());
            Assert.assertEquals("Email inválido", "con@tr.com", f.getEmailCliente());      
            Assert.assertEquals("Rua inválida", "Ruaa", f.getEndereco());    
            Assert.assertEquals("Nascimento inválido", "23/02/1997", sourceFormat.format(f.getNascimento()));
            Assert.assertEquals("Nome inválido", "construtor", f.getNomeCliente());
            Assert.assertEquals("Numero inválido", 3, f.getNumero());
            Assert.assertEquals("Telefone inválido", "(11) 1111-1222", f.getTelefoneCliente());     
            Assert.assertEquals("CPF inválido", "35292797812", Integer.toString(f.getCPF()));            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (RuntimeException ex) {
            Assert.fail("O CPF não cabe em um int, precisa ser String");
        }
    }
    
}
