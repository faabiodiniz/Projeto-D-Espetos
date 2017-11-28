/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.despetos;

import d.espetos.Carne;
import d.espetos.Estoque;
import d.espetos.Fornecedor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestFornecedor {
    
    /**
     * Teste do construtor - verificação se todos valores passados para o construtor foram corretamente atribuídos
     */
    @Test
    public void testConstrutor() {
        Assert.fail("No banco, o vendedor representante possui um fornecedor, e não o contrário");
        Fornecedor f = new Fornecedor(1, "53772816000108", "Nome", "forn@mail.com", "(12) 1212-2121", "Rua", 
                "Bairro 1", 32, "Paulista", "São Paulo");

        Assert.assertEquals("Bairro inválido", "Bairro 1", f.getBairro());
        Assert.assertEquals("Cidade inválida", "Paulista", f.getCidade());  
        Assert.assertEquals("Email inválido", "forn@mail.com", f.getEmail());  
        Assert.assertEquals("Rua inválido", "Rua", f.getRua());
        Assert.assertEquals("Estado inválido", "São Paulo", f.getEstado());
        Assert.assertEquals("Nome inválido", "Nome", f.getNomeFornecedor());
        Assert.assertEquals("Numero inválido", 32, f.getNumero());
        Assert.assertEquals("Telefone inválido", "(12) 1212-2121", f.getTelefone());
        Assert.assertEquals("CNPJ inválido", "53772816000108", f.getCnpj()); 
    } 
    
    /**
     * Teste de nome - o nome não pode ser nulo nem vazio
     */
    @Test
    public void testNomeConstrutor() {
        Fornecedor f = new Fornecedor(1, "53772816000108", "", "forn@mail.com", "(12) 1212-2121", "Rua", 
                "Bairro 1", 32, "Paulista", "São Paulo");
        Assert.assertNotEquals("O construtor permitiu o nome ser vazio", "", f.getNomeFornecedor());
        Fornecedor f1 = new Fornecedor(1, "53772816000108", null, "forn@mail.com", "(12) 1212-2121", "Rua", 
                "Bairro 1", 32, "Paulista", "São Paulo");
        Assert.assertNotEquals("O construtor permitiu o nome ser null", null, f1.getNomeFornecedor());
    }
    
    /**
     * Teste de nome - o nome não pode ser nulo nem vazio
     */
    @Test
    public void testNomeSetter() {
        Fornecedor f = new Fornecedor(1, "53772816000108", "Nome", "forn@mail.com", "(12) 1212-2121", "Rua", 
                "Bairro 1", 32, "Paulista", "São Paulo");
        f.setNomeFornecedor("");
        Assert.assertEquals("O Setter permitiu o nome ser vazio", "Nome", f.getNomeFornecedor());
        f.setNomeFornecedor(null);
        Assert.assertEquals("O Setter permitiu o nome ser null", "Nome", f.getNomeFornecedor());
    }
}
