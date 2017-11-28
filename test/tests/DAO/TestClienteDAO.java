/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.DAO;
import ClassesDAO.ClienteDAO;
import d.espetos.Cliente;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestClienteDAO {
    /**
     * Teste do cadastro
     */
    @Test
    public void testCadastroSelectDelete() {
        /* Execute uma vez com a linha do Salvar, e depois execute uma segunda com ela comentada para saber se funcionou */
        int aux = 0, i;
        ClienteDAO.getInstance().Salvar("testeeee", "252.252.252-22", "issoeumteste@test.com", null, "Jurídico"); // Esta linha
        List<Cliente> clientes = ClienteDAO.getInstance().retrieveLike("testeeee");
        for (i = 0; i < clientes.size(); i++) {
            if ((clientes.get(i).getNomeCliente().trim().equals("testeeee")) && (clientes.get(i).getCpfcnpj().trim().equals("252.252.252-22"))) {
                aux = 1;
                break;
            }
        }
        if (aux == 0) {
            Assert.fail("Cliente não encontrado no Banco de Dados");
        }
        ClienteDAO.getInstance().delete(clientes.get(i));
        for (i = 0; i < clientes.size(); i++) {
            if ((clientes.get(i).getNomeCliente().trim().equals("testeeee")) && (clientes.get(i).getCpfcnpj().trim().equals("252.252.252-22"))) {
                aux = 0;
                break;
            }
        }
        if (aux == 1) {
            Assert.fail("Cliente não deletado no Banco de Dados");
        }
    }
}
