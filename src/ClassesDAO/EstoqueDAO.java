/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.Carne;
import d.espetos.ExceptionTest;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author faad2
 */
public class EstoqueDAO extends ConexaoBD{
    ConexaoBD conexao = new ConexaoBD();
    Carne carne = new Carne();
    private static EstoqueDAO instance;
    
    public void Salvar(Carne Carne){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO Carne(Nome, Valor, Fabricacao, Validade) values (?,?,?,?)");
            pst.setString(1, carne.getNomeCarne());
            pst.setDouble(3, carne.getValorCusto());
            pst.setDate(4, (Date) carne.getFabricacao());
            pst.setDate(5, (Date) carne.getValidade());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }
    
        public static EstoqueDAO getInstance() {
        if (instance == null) {
            instance = new EstoqueDAO();
            con = instance.conexao();
        }
        return instance;
    }
}
