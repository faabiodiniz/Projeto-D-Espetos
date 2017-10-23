package Visao;

import Controle.ConexaoBD;
import Controle.ControlCliente;
import d.espetos.Cliente;
import d.espetos.Fisico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faad2
 */
public class cadastroClientes extends javax.swing.JFrame {
    Fisico fisico = new Fisico();
    Cliente cliente = new Cliente();
    ConexaoBD conexao = new ConexaoBD();
    ControlCliente ctrCliente = new ControlCliente();
    /**
     * Creates new form cadastroClientes
     */
    public cadastroClientes() {
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

        jPanelPainel = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPainel.setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelNome.setText("Nome: ");
        jPanelPainel.add(jLabelNome);
        jLabelNome.setBounds(20, 20, 50, 20);

        jLabelCPF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelCPF.setText("CPF:");
        jPanelPainel.add(jLabelCPF);
        jLabelCPF.setBounds(20, 60, 40, 14);

        jLabelTelefone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelTelefone.setText("Telefone: ");
        jPanelPainel.add(jLabelTelefone);
        jLabelTelefone.setBounds(20, 100, 60, 20);

        jLabelEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelEmail.setText("E-mail: ");
        jPanelPainel.add(jLabelEmail);
        jLabelEmail.setBounds(20, 140, 50, 20);

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelPainel.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(90, 140, 160, 20);
        jPanelPainel.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(90, 100, 160, 20);
        jPanelPainel.add(jTextFieldNome);
        jTextFieldNome.setBounds(90, 20, 160, 20);

        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });
        jPanelPainel.add(jTextFieldCPF);
        jTextFieldCPF.setBounds(90, 60, 160, 20);

        getContentPane().add(jPanelPainel);
        jPanelPainel.setBounds(27, 27, 280, 180);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 4, 160, 20);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(70, 220, 100, 30);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(180, 220, 90, 30);

        setBounds(0, 0, 355, 299);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        cliente.setNomeCliente(jTextFieldNome.getText());
        fisico.setCpfCliente(jTextFieldCPF.getText());
        cliente.setEmailCliente(jTextFieldEmail.getText());
        cliente.setTelefoneCliente(jTextFieldTelefone.getText());
        ctrCliente.Salvar(cliente);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelPainel;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
