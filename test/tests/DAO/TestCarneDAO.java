/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.DAO;

import ClassesDAO.CarneDAO;
import d.espetos.Carne;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TestCarneDAO {
    /**
     * Teste do cadastro
     */
    @Test
    public void testCadastroSelectDelete() {
        /* Execute uma vez com a linha do Salvar, e depois execute uma segunda com ela comentada para saber se funcionou */
        int aux = 0, i;
        CarneDAO.getInstance().Salvar("Carne carnuda carnosa", 23.2lf, "22/01/1999", "22/10/2000", 10lf, 2); // Esta linha
        List<Carne> carnes = CarneDAO.getInstance().retrieveLike("Carne carnuda carnosa");
        for (i = 0; i < carnes.size(); i++) {
            if ((carnes.get(i).getNomeCarne().trim().equals("Carne carnuda carnosa"))) {
                aux = 1;
                break;
            }
        }
        if (aux == 0) {
            Assert.fail("Carne não encontrada no Banco de Dados");
        }
        CarneDAO.getInstance().delete(carnes.get(i));
        for (i = 0; i < carnes.size(); i++) {
            if ((carnes.get(i).getNomeCarne().trim().equals("Carne carnuda carnosa"))) {
                aux = 0;
                break;
            }
        }
        if (aux == 1) {
            Assert.fail("Carne não deletada no Banco de Dados");
        }
    }
}
