/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author faad2
 */
public class CadastrarCarne extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCarne
     */
    public CadastrarCarne() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeCarne = new javax.swing.JTextField();
        jTextFieldQtdCarne = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setText("Nome: ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 20, 34, 14);

        jLabel2.setText("Data de Validade:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 110, 90, 14);

        jLabel3.setText("Data de vencimento: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 150, 120, 14);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(240, 20, 56, 20);

        jLabel4.setText("Tipo:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(210, 20, 34, 14);

        jLabel5.setText("Quantidade:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 70, 80, 14);

        jLabel6.setText("KG");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 70, 13, 14);
        jPanel2.add(jTextFieldNomeCarne);
        jTextFieldNomeCarne.setBounds(70, 20, 130, 20);
        jPanel2.add(jTextFieldQtdCarne);
        jTextFieldQtdCarne.setBounds(100, 70, 60, 20);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 110, 50, 20);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(220, 150, 50, 20);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(160, 110, 30, 20);

        jLabel7.setText("/");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(210, 150, 10, 20);

        jLabel8.setText("/");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(150, 110, 10, 20);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(120, 110, 30, 20);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(140, 150, 30, 20);
        jPanel2.add(jTextField6);
        jTextField6.setBounds(180, 150, 30, 20);

        jLabel9.setText("/");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(190, 110, 10, 20);

        jLabel10.setText("/");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(170, 150, 10, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 10, 320, 210);

        jButton1.setText("Cadastrar");
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 230, 90, 30);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 230, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCarne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCarne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCarne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCarne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCarne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFieldNomeCarne;
    private javax.swing.JTextField jTextFieldQtdCarne;
    // End of variables declaration//GEN-END:variables
}
