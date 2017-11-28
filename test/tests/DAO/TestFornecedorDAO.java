/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.DAO;
import ClassesDAO.FornecedorDAO;
import d.espetos.Fornecedor;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestFornecedorDAO {
    /**
     * Teste do cadastro
     */
    @Test
    public void testCadastroSelectDelete() {
        /* Execute uma vez com a linha do Salvar, e depois execute uma segunda com ela comentada para saber se funcionou */
        int aux = 0, i;
        FornecedorDAO.getInstance().Salvar("Fornecedor dos fornecimentos", "123-456-89012" , "11111111111111", null, null, null, null, null, "Estado"); // Esta linha
        List<Fornecedor> fornecedores = FornecedorDAO.getInstance().retrieveLike("Fornecedor dos fornecimentos");
        for (i = 0; i < fornecedores.size(); i++) {
            if ((fornecedores.get(i).getNomeFornecedor().trim().equals("Fornecedor dos fornecimentos")) && (fornecedores.get(i).getCnpj().trim().equals("11111111111111"))) {
                aux = 1;
                break;
            }
        }
        if (aux == 0) {
            Assert.fail("Fornecedor não encontrado no Banco de Dados");
        }
        FornecedorDAO.getInstance().delete(fornecedores.get(i));
        for (i = 0; i < fornecedores.size(); i++) {
            if ((fornecedores.get(i).getNomeFornecedor().trim().equals("Fornecedor dos fornecimentos")) && (fornecedores.get(i).getCnpj().trim().equals("11111111111111"))) {
                aux = 0;
                break;
            }
        }
        if (aux == 1) {
            Assert.fail("Fornecedor não deletado no Banco de Dados");
        }
    }
}
