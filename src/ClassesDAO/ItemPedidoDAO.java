/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Controle.ConexaoBD;
import d.espetos.ItemPedido;
import java.sql.ResultSet;


/**
 *
 * @author faad2
 */
public class ItemPedidoDAO extends ConexaoBD {
    ConexaoBD conexao = new ConexaoBD();
    //ItemPedido itemPed = new ItemPedido();
    private static ItemPedidoDAO instance;
    
    /*public void Salvar(String nome, double valor, String fabricacao, String validade, double quantidade, String tipo, String marca){
        instance.conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement();
            pst.setString(1, nome);
            pst.setDouble(2, valor);
            pst.setString(3, marca);
            pst.setString(4, tipo);
            pst.setString(5, fabricacao);
            pst.setString(6, validade);
            pst.setDouble(7, quantidade);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao inserir dados\n Erro: " +ex);
            throw new ExceptionTest();
        }
        instance.desconecta();
    }*/
    
    public static ItemPedidoDAO getInstance() {
        if (instance == null) {
            instance = new ItemPedidoDAO();
            con = instance.conexao();
        }
        return instance;
    }
        
    private ItemPedido buildObject(ResultSet rs) {
        ItemPedido itemPedido = null;
        /*try {
            itemPedido = new ItemPedido();//rs.getInt("codCarne"), rs.getString("nome"), rs.getDouble("quantidade"), rs.getDate("dataFabricacao"),rs.getDate("dataValidade"), rs.getDouble("valor"), rs.getString("tipo"), rs.getString("marca"), rs.getInt("codTipoCarne"));       
        //} catch (SQLException e) {
        }*/
        return itemPedido;
    }
}
