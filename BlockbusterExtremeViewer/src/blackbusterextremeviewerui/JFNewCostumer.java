/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackbusterextremeviewerui;

import blockbusterextremeviewer.classes.Operation;
import javax.swing.JOptionPane;

/**
 *
 * @author sarai
 */
public class JFNewCostumer extends javax.swing.JFrame {

    /**
     * Creates new form JFCliente
     */
    public JFNewCostumer() {
        initComponents();
        // Esto siempre se hace para la navegacion
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
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

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNumber = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo Cliente");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 120, 69));

        jTextFieldId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldId.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldId.setText("CC");
        jTextFieldId.setBorder(null);
        bg.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 300, 30));

        jTextFieldName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldName.setText("Nombre");
        jTextFieldName.setBorder(null);
        bg.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 300, 30));

        jTextFieldLastName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldLastName.setText("Apellido");
        jTextFieldLastName.setBorder(null);
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        bg.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 30));

        jTextFieldAge.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldAge.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldAge.setText("Edad");
        jTextFieldAge.setBorder(null);
        bg.add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 300, 30));

        jTextFieldEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setText("Correo");
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        bg.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 300, 30));

        jTextFieldNumber.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldNumber.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNumber.setText("Telefono");
        jTextFieldNumber.setBorder(null);
        bg.add(jTextFieldNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 300, 30));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 10));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 300, 10));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 300, 10));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 300, 10));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 300, 10));

        jButtonSave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        bg.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String id = jTextFieldId.getText();
        String name = jTextFieldName.getText();
        String lastName = jTextFieldLastName.getText();
        String number = jTextFieldNumber.getText();
        int age = Integer.parseInt(jTextFieldAge.getText());
        String email = jTextFieldEmail.getText();

        Operation blockbusterOperation = new Operation();

        blockbusterOperation.createCustomer(id, name, lastName, email, age, number);

        JOptionPane.showMessageDialog(this, "Cliente creado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

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
            java.util.logging.Logger.getLogger(JFNewCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNewCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNewCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNewCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFNewCostumer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNumber;
    // End of variables declaration//GEN-END:variables
}
