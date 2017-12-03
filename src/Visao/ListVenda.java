/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControlVenda;
import d.espetos.Venda;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author faad2
 */
public class ListVenda extends javax.swing.JFrame {

    /**
     * Creates new form ListVenda
     */
    Venda[] vContatos;
    public ListVenda() {
        initComponents();
        vContatos = ControlVenda.getListOfVendasAsArray();
        this.setLocationRelativeTo(null);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        menuItemCadastroCliente = new javax.swing.JMenuItem();
        menuItemListarClientes = new javax.swing.JMenuItem();
        jMenuFornecedores = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        menuItemListarEstoque = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuItemRelatorioVenda = new javax.swing.JMenuItem();
        menuItemRealizarVenda = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(723, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setModel(new VendaTableModel(ControlVenda.getListOfVendas()));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Realizar Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoTodos.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -30, 780, 530);

        menuPrincipal.setText("Menu Principal");
        menuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Menu Principal");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuPrincipal.add(jMenuItem3);

        barraMenu.add(menuPrincipal);

        menuClientes.setText("Clientes");

        menuItemCadastroCliente.setText("Cadastrar Cliente");
        menuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroClienteActionPerformed(evt);
            }
        });
        menuClientes.add(menuItemCadastroCliente);

        menuItemListarClientes.setText("Listar Clientes");
        menuItemListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarClientesActionPerformed(evt);
            }
        });
        menuClientes.add(menuItemListarClientes);

        barraMenu.add(menuClientes);

        jMenuFornecedores.setText("Fornecedores");

        jMenuItem1.setText("Cadastrar Fornecedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuFornecedores.add(jMenuItem1);

        jMenuItem2.setText("Listar Fornecedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuFornecedores.add(jMenuItem2);

        barraMenu.add(jMenuFornecedores);

        menuEstoque.setText("Estoque");

        menuItemListarEstoque.setText("Listar Carnes");
        menuItemListarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarEstoqueActionPerformed(evt);
            }
        });
        menuEstoque.add(menuItemListarEstoque);

        barraMenu.add(menuEstoque);

        menuVendas.setText("Vendas");

        menuItemRelatorioVenda.setText("Relatório de Vendas");
        menuItemRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatorioVendaActionPerformed(evt);
            }
        });
        menuVendas.add(menuItemRelatorioVenda);

        menuItemRealizarVenda.setText("Realizar Venda");
        menuItemRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRealizarVendaActionPerformed(evt);
            }
        });
        menuVendas.add(menuItemRealizarVenda);

        barraMenu.add(menuVendas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        barraMenu.add(jMenuSair);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CadastroVendas cadVendas = new CadastroVendas();
        cadVendas.setVisible(true);
        ((VendaTableModel) jTable1.getModel()).refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MenuInicial principal = new MenuInicial();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalActionPerformed
        MenuInicial principal = new MenuInicial();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPrincipalActionPerformed

    private void menuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroClienteActionPerformed
        CadClienteDialog clientes = new CadClienteDialog(this, true);
        clientes.setVisible(true);
    }//GEN-LAST:event_menuItemCadastroClienteActionPerformed

    private void menuItemListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarClientesActionPerformed
        ListClientes cliente = new ListClientes();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemListarClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadFornecedorDialog fornecedor = new CadFornecedorDialog(this, true);
        fornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ListFornecedor fornecedor = new ListFornecedor();
        fornecedor.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuItemListarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarEstoqueActionPerformed
        ListEstoque estoque = new ListEstoque();
        estoque.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemListarEstoqueActionPerformed

    private void menuItemRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatorioVendaActionPerformed
        ListVenda vendas = new ListVenda();
        vendas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRelatorioVendaActionPerformed

    private void menuItemRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRealizarVendaActionPerformed
        CadastroVendas cadVendas = new CadastroVendas();
        cadVendas.setVisible(true);
    }//GEN-LAST:event_menuItemRealizarVendaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuFornecedores;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenuItem menuItemCadastroCliente;
    private javax.swing.JMenuItem menuItemListarClientes;
    private javax.swing.JMenuItem menuItemListarEstoque;
    private javax.swing.JMenuItem menuItemRealizarVenda;
    private javax.swing.JMenuItem menuItemRelatorioVenda;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu menuVendas;
    // End of variables declaration//GEN-END:variables
}
