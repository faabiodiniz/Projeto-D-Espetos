/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import ClassesDAO.FornecedorDAO;
import Controle.ConexaoBD;
import d.espetos.Fornecedor;

/**
 *
 * @author faad2
 */
public class cadastroFornecedor extends javax.swing.JFrame {
    Fornecedor fornecedor = new Fornecedor();
    ConexaoBD conexao = new ConexaoBD();
    FornecedorDAO forDao = new FornecedorDAO();
    /**
     * Creates new form cadastroFornecedor
     */
    public cadastroFornecedor() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldCadNome = new javax.swing.JTextField();
        textFieldCadCNPJ = new javax.swing.JTextField();
        textFieldCadTel = new javax.swing.JTextField();
        textFieldCadEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRuaFor = new javax.swing.JTextField();
        jTextFieldNumFor = new javax.swing.JTextField();
        jTextFieldCidFor = new javax.swing.JTextField();
        jTextFieldUfFor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBairroFor = new javax.swing.JTextField();
        labelCadFornecedor = new javax.swing.JLabel();
        buttonCadastrarFuncionario = new javax.swing.JButton();
        buttonCancelarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(363, 395));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nome: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 35, 14);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("CNPJ: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 35, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Telefone: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 48, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Email: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 240, 33, 14);

        textFieldCadNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadNomeActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCadNome);
        textFieldCadNome.setBounds(70, 20, 190, 20);
        jPanel1.add(textFieldCadCNPJ);
        textFieldCadCNPJ.setBounds(70, 60, 190, 20);
        jPanel1.add(textFieldCadTel);
        textFieldCadTel.setBounds(70, 100, 190, 20);

        textFieldCadEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadEmailActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCadEmail);
        textFieldCadEmail.setBounds(70, 240, 190, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Rua:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 140, 22, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Cidade:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 200, 40, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Número:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 130, 60, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("UF:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 200, 50, 20);
        jPanel1.add(jTextFieldRuaFor);
        jTextFieldRuaFor.setBounds(70, 140, 150, 20);
        jPanel1.add(jTextFieldNumFor);
        jTextFieldNumFor.setBounds(270, 140, 30, 20);
        jPanel1.add(jTextFieldCidFor);
        jTextFieldCidFor.setBounds(70, 200, 100, 20);
        jPanel1.add(jTextFieldUfFor);
        jTextFieldUfFor.setBounds(210, 200, 30, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Bairro: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 170, 40, 14);
        jPanel1.add(jTextFieldBairroFor);
        jTextFieldBairroFor.setBounds(70, 170, 230, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 30, 310, 280);

        labelCadFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelCadFornecedor.setText("Cadastrar Fornecedor");
        getContentPane().add(labelCadFornecedor);
        labelCadFornecedor.setBounds(40, 10, 140, 20);

        buttonCadastrarFuncionario.setText("Cadastrar");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadastrarFuncionario);
        buttonCadastrarFuncionario.setBounds(70, 320, 100, 30);

        buttonCancelarCadastro.setText("Cancelar");
        buttonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelarCadastro);
        buttonCancelarCadastro.setBounds(180, 320, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCadNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadNomeActionPerformed

    private void textFieldCadEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadEmailActionPerformed

    private void buttonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioActionPerformed
        fornecedor.setNomeFornecedor(textFieldCadNome.getText());
        fornecedor.setEmail(textFieldCadEmail.getText());
        fornecedor.setTelefone(textFieldCadTel.getText());
        fornecedor.setCnpj(textFieldCadCNPJ.getText());
        fornecedor.setRua(jTextFieldRuaFor.getText());
        fornecedor.setBairro(jTextFieldRuaFor.getText());
        fornecedor.setNumero(jTextFieldNumFor.getText());
        fornecedor.setCidade(jTextFieldCidFor.getText());
        fornecedor.setEstado(jTextFieldUfFor.getText());
        forDao.Salvar(fornecedor);
    }//GEN-LAST:event_buttonCadastrarFuncionarioActionPerformed

    private void buttonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarCadastroActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonCancelarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBairroFor;
    private javax.swing.JTextField jTextFieldCidFor;
    private javax.swing.JTextField jTextFieldNumFor;
    private javax.swing.JTextField jTextFieldRuaFor;
    private javax.swing.JTextField jTextFieldUfFor;
    private javax.swing.JLabel labelCadFornecedor;
    private javax.swing.JTextField textFieldCadCNPJ;
    private javax.swing.JTextField textFieldCadEmail;
    private javax.swing.JTextField textFieldCadNome;
    private javax.swing.JTextField textFieldCadTel;
    // End of variables declaration//GEN-END:variables
}
