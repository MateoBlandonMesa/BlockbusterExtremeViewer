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
public class JFNewMovie extends javax.swing.JFrame {
//String id, double price, String title, String genre, int year, String format, String director, String cast, String language

    /**
     * Creates new form JFCliente
     */
    public JFNewMovie() {
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
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldGenre = new javax.swing.JTextField();
        jTextFieldYear = new javax.swing.JTextField();
        jComboBoxFormat = new javax.swing.JComboBox<>();
        jTextFieldDirector = new javax.swing.JTextField();
        jComboBoxLanguaje = new javax.swing.JComboBox<>();
        jTextFieldCast = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Nueva Pelicula");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 69));

        jTextFieldTitle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldTitle.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTitle.setText("Titulo");
        jTextFieldTitle.setBorder(null);
        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });
        bg.add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 300, 30));

        jTextFieldGenre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldGenre.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldGenre.setText("Genero");
        jTextFieldGenre.setBorder(null);
        bg.add(jTextFieldGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 300, 30));

        jTextFieldYear.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldYear.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldYear.setText("Año");
        jTextFieldYear.setBorder(null);
        jTextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYearActionPerformed(evt);
            }
        });
        bg.add(jTextFieldYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 300, 30));

        jComboBoxFormat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxFormat.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Formato", "DVD", "VHS", "Blu-ray" }));
        jComboBoxFormat.setToolTipText("");
        jComboBoxFormat.setBorder(null);
        jComboBoxFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormatActionPerformed(evt);
            }
        });
        bg.add(jComboBoxFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 300, 30));

        jTextFieldDirector.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldDirector.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldDirector.setText("Director");
        jTextFieldDirector.setBorder(null);
        jTextFieldDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirectorActionPerformed(evt);
            }
        });
        bg.add(jTextFieldDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 300, 30));

        jComboBoxLanguaje.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxLanguaje.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxLanguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Idioma", "Español", "Inglés", "Francés", "Aleman", "Chino", "Coreano", "Japones" }));
        jComboBoxLanguaje.setToolTipText("");
        jComboBoxLanguaje.setBorder(null);
        jComboBoxLanguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLanguajeActionPerformed(evt);
            }
        });
        bg.add(jComboBoxLanguaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 300, 30));

        jTextFieldCast.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldCast.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCast.setText("Reparto");
        jTextFieldCast.setBorder(null);
        bg.add(jTextFieldCast, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 300, 30));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 300, 10));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 300, 10));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 10));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 300, 10));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 300, 10));

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 300, 10));

        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        bg.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String title = jTextFieldTitle.getText();
        String genre = jTextFieldGenre.getText();
        int year = Integer.parseInt(jTextFieldYear.getText());
        String format = jComboBoxFormat.getSelectedItem().toString();
        String director = jTextFieldDirector.getText();
        String languaje = jComboBoxLanguaje.getSelectedItem().toString();
        String cast = jTextFieldCast.getText();

        Operation blockbusterOperation = new Operation();

        blockbusterOperation.createMovie(4500.00, title, genre, year, format, director, cast, languaje);

        JOptionPane.showMessageDialog(this, "Pelicula creada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDirectorActionPerformed

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void jComboBoxFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFormatActionPerformed

    private void jComboBoxLanguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLanguajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLanguajeActionPerformed

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
            java.util.logging.Logger.getLogger(JFNewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNewMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFNewMovie().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxFormat;
    private javax.swing.JComboBox<String> jComboBoxLanguaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextFieldCast;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldGenre;
    private javax.swing.JTextField jTextFieldTitle;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
