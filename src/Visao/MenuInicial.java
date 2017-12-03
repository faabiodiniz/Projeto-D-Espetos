/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ConexaoBD;

/**
 *
 * @author faad2
 */
public class MenuInicial extends javax.swing.JFrame {
    ConexaoBD conecta = new ConexaoBD();
    /**
     * Creates new form menuInicial
     */
    public MenuInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVendas = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jButtonFornecedor = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jLabelFundoMenus = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVendas.setText("Vendas");
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVendas);
        jButtonVendas.setBounds(200, 180, 140, 80);

        jButtonEstoque.setText("Estoque");
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstoque);
        jButtonEstoque.setBounds(370, 180, 140, 80);

        jButtonFornecedor.setText("Fornecedores");
        jButtonFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFornecedor);
        jButtonFornecedor.setBounds(540, 180, 140, 80);

        jButtonCliente.setText("Clientes");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente);
        jButtonCliente.setBounds(30, 180, 140, 80);

        jLabelFundoMenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoTodos.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoMenus);
        jLabelFundoMenus.setBounds(-10, -20, 750, 490);

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

        setBounds(0, 0, 735, 517);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
        ListVenda vendas = new ListVenda();
        vendas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVendasActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        ListEstoque cliente = new ListEstoque();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        ListClientes cliente = new ListClientes();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorActionPerformed
        ListFornecedor fornecedor = new ListFornecedor();
        fornecedor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFornecedor;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JLabel jLabelFundoMenus;
    private javax.swing.JMenu jMenuFornecedores;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
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
