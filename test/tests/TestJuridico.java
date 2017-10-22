/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import d.espetos.Fisico;
import d.espetos.ItemPedido;
import d.espetos.Juridico;
import d.espetos.Pedido;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestJuridico {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Juridico j = new Juridico("construtor", 53772816000108, "(11) 1111-1222", "con@tr.com", "Ruaa", "bairro", 3, sourceFormat.parse("23/02/1997"));
            Assert.assertEquals("Bairro inválido", "bairro", j.getBairro());
            Assert.assertEquals("Email inválido", "con@tr.com", j.getEmailCliente());      
            Assert.assertEquals("Rua inválida", "Ruaa", j.getEndereco());    
            Assert.assertEquals("Nascimento inválido", "23/02/1997", sourceFormat.format(j.getNascimento()));
            Assert.assertEquals("Nome inválido", "construtor", j.getNomeCliente());
            Assert.assertEquals("Numero inválido", 3, j.getNumero());
            Assert.assertEquals("Telefone inválido", "(11) 1111-1222", j.getTelefoneCliente());     
            Assert.assertEquals("CNPJ inválido", "53772816000108", Integer.toString(j.getCNPJ()));            
        } catch (ParseException ex) {
            Assert.fail("Exceção na conversão da data");
        } catch (RuntimeException ex) {
            Assert.fail("O CNPJ não cabe em um int, precisa ser String");
        }
    } 
}
