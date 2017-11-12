/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.Cliente;
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
        Cliente c = new Cliente(1, "", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
        Assert.assertNotEquals("O construtor permitiu o nome ser vazio", "", c.getNomeCliente());
        
        Cliente c1 = new Cliente(1, null, "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
        Assert.assertNotEquals("O construtor permitiu o nome ser nulo", null, c1.getNomeCliente());
    }
    
    /**
     * Teste de nome - o nome não pode ser vazio ou null
     */
    @Test
    public void testNomeSetter() {
        Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Físico", "123.456.789-10");
        c.setNomeCliente("");
        Assert.assertNotEquals("O Setter permitiu o nome ser vazio", "", c.getNomeCliente());
        c.setNomeCliente(null);
        Assert.assertNotEquals("O Setter permitiu o nome ser nulo", null, c.getNomeCliente());
    }
    
    /**
     * Teste de nome - o tipo deve poder ser apenas "Físico" ou "Jurídico"
     */
    @Test
    public void testTipoConstrutor() {
        Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "asdda", "123.456.789-10");
        Assert.assertNotEquals("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico'", "asdda", c.getTipo());
        Cliente c2 = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "", "123.456.789-10");
        Assert.assertNotEquals("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico'", "", c2.getTipo());
        Cliente c3 = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", null, "123.456.789-10");
        Assert.assertNotEquals("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico'", null, c3.getTipo());
    }
    
    /**
     * Teste de nome - o tipo deve poder ser apenas "Físico" ou "Jurídico"
     */
    @Test
    public void testTipoSetter() {
        Cliente c = new Cliente(1, "construtor", "(11) 1111-1222", "con@tr.com", "Fisico", "123.456.789-10");
        c.setTipo("asdda");
        Assert.assertNotEquals("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico'", "asdda", c.getTipo());
        c.setTipo("");
        Assert.assertNotEquals("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico'", "", c.getTipo());
        c.setTipo(null);
        Assert.assertNotEquals("O construtor aceitou um tipo diferente de 'Físico' ou 'Jurídico'", null, c.getTipo());
    }
}
