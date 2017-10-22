/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import ClassesDAO.ClienteDAO;
import Controle.ConexaoBD;
import d.espetos.Cliente;
import d.espetos.ExceptionTest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;

/**
 *
 * @author rafae
 */
public class TestClienteDAO {
    
    /**
     * Teste cadastrando um cliente passando todos os parâmetros possíveis por set
     */
    /*@Test
    public void testCadastro1() {
        Cliente c = new Cliente();                                             
        c.setNomeCliente("Teste um");
        c.setCpf("111.111.111-11");
        c.setEmail("teste@um.com");
        c.setTelefone("(11) 1111-1111");
        ClienteDAO cdao = new ClienteDAO();
        try{
            cdao.Salvar(c);
        }
        catch (ExceptionTest ex) {
            Assert.fail("Os dados não foram inseridos no banco");
        }
        
        ConexaoBD conexao = new ConexaoBD();
        try {
            conexao.Conexao();
            PreparedStatement pst = conexao.con.prepareStatement("select * from cliente where "
                    + "cpfcnpj='111.111.111-11' and nome='Teste um' and email='teste@um.com' and telefone='(11) 1111-1111'");
            ResultSet rs = pst.executeQuery();
            if (!rs.next()) {
                Assert.fail("Nenhuma linha foi retornada: cliente não encontrado");
            }
        } catch (SQLException ex) {
            Assert.fail("O select não pôde ser executado");
        }
    }*/
    
    /**
     * Teste cadastrando um cliente sem passar parâmetro algum
     */
    /*@Test
    public void testCadastro2() {
        Cliente c = new Cliente();         
        ClienteDAO cdao = new ClienteDAO();
        try{
            cdao.Salvar(c);
        }
        catch (ExceptionTest ex) {
            Assert.fail("Os dados não foram inseridos no banco");
        }
        
        ConexaoBD conexao = new ConexaoBD();
        try {
            conexao.Conexao();
            PreparedStatement pst = conexao.con.prepareStatement("select * from cliente where "
                    + "cpfcnpj is null and nome is null and email is null and telefone is null");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Assert.fail("Pelo menos uma linha foi retornada: caso ela não existisse antes, o cliente foi inserido."
                        + "Não deveria ser possível a inserção de um cliente com todos os campos 'null'");
            }
        } catch (SQLException ex) {
            Assert.fail("O select não pôde ser executado");
        }
    }*/
}
