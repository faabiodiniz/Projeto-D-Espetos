/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.DAO;

import ClassesDAO.CarneDAO;
import d.espetos.Carne;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void testCarneCadastroSelectDelete() {
        int aux = 0, i;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fabricacao = sdf.parse("22/01/1999");
            Date validade = sdf.parse("22/10/2000");
            CarneDAO.getInstance().salvarCarne("22/01/1999", "22/10/2000", 10l, 2); // Esta linha
            List<Carne> carnes = CarneDAO.getInstance().retrieveAll();
            for (i = 0; i < carnes.size(); i++) {
                if (((carnes.get(i).getFabricacao().equals(fabricacao))) && (carnes.get(i).getValidade().equals(validade))) {
                    aux = 1;
                    break;
                }
            }
            if (aux == 0) {
                Assert.fail("Carne não encontrada no Banco de Dados");
            }
            CarneDAO.getInstance().delete(carnes.get(i));
            carnes = CarneDAO.getInstance().retrieveAll();
            for (i = 0; i < carnes.size(); i++) {
                if (((carnes.get(i).getFabricacao().equals(fabricacao))) && (carnes.get(i).getValidade().equals(validade))) {
                    aux = 0;
                    break;
                }
            }
            if (aux == 1) {
                Assert.fail("Carne não deletada no Banco de Dados");
            }
        } catch (ParseException ex) {
            Assert.fail("Erro na conversão de data");
        }
    }
    
    /**
     * Teste do cadastro
     */
    @Test
    public void testTipoCarneCadastroSelectDelete() {
        int aux = 0, i;
        CarneDAO.getInstance().Salvar("Carne carnosa", 30f, "Perdigao", "Frango"); // Esta linha
        List<Carne> carnes = CarneDAO.getInstance().retrieveLike("Carne carnosa");
        if (carnes.isEmpty()) {
            Assert.fail("Carne não encontrada no Banco de Dados");
        }
        CarneDAO.getInstance().delete(carnes.get(0));
        if (!carnes.isEmpty()) {
            Assert.fail("Carne não deletada no Banco de Dados");
        }
    }
}
