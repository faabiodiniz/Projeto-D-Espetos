/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import d.espetos.Carne;
import d.espetos.Estoque;
import d.espetos.Fornecedor;
import d.espetos.VendedorRepresentante;
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
        try {
            VendedorRepresentante v = new VendedorRepresentante("vendedor", "v@endedor.com", "(11) 1515-1515");
            Fornecedor f = new Fornecedor(53772816000108, "Fantasia", "Razao Social", "forn@mail.com", "(12) 1212-2121", "End", 
                    "Bairro 1", 32, "Paulista", "São Paulo", v);
            
            Assert.assertEquals("Vendedor - Email inválido", "v@endedor.com", f.getRepresentante().getEmail()); 
            Assert.assertEquals("Vendedor - Nome inválido", "vendedor", f.getRepresentante().getNome()); 
            Assert.assertEquals("Vendedor - Telefone inválido", "(11) 1515-1515", f.getRepresentante().getTelefone()); 
            
            Assert.assertEquals("Bairro inválido", "Bairro 1", f.getBairro());
            Assert.assertEquals("Cidade inválida", "Paulista", f.getCidade());  
            Assert.assertEquals("Email inválido", "forn@mail.com", f.getEmail());  
            Assert.assertEquals("Endereço inválido", "End", f.getEndereco());
            Assert.assertEquals("Estado inválido", "São Paulo", f.getEstado());
            Assert.assertEquals("Nome Fantasia inválido", "Fantasia", f.getNomeFantasia());
            Assert.assertEquals("Numero inválido", 32, f.getNumero());
            Assert.assertEquals("Razão Social inválida", "Razao Social", f.getRazaoSocial());
            Assert.assertEquals("Telefone inválido", "(12) 1212-2121", f.getTelefone());
            Assert.assertEquals("CNPJ inválido", "53772816000108", Integer.toString(f.getCnpj()));   
        } catch (RuntimeException ex) {
            Assert.fail("O CNPJ não cabe em um int, precisa ser String");
        }
    } 
}
