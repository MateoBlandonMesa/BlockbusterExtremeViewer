/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackbusterextremeviewerui;

import blockbusterextremeviewer.classes.Customer;
import blockbusterextremeviewer.classes.Movie;
import blockbusterextremeviewer.classes.Operation;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sarai
 */
public class JFNewRental extends javax.swing.JFrame {
    
    Operation blockbusterOperation = new Operation();

    /**
     * Creates new form JFCliente
     */
    public JFNewRental() {

        initComponents();

        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        jComboBoxPelicula.setModel(leerPeliculasDesdeCSV(blockbusterOperation.getMoviesTableFilePath()));
        jComboBoxCliente.setModel(leerClientesDesdeCSV(blockbusterOperation.getCustomersTableFilePath()));

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
        jComboBoxPelicula = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Nueva Renta");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 110, 69));

        jComboBoxPelicula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxPelicula.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxPelicula.setModel(new javax.swing.DefaultComboBoxModel<Movie>());
        jComboBoxPelicula.setBorder(null);
        jComboBoxPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeliculaActionPerformed(evt);
            }
        });
        bg.add(jComboBoxPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 300, 40));

        jComboBoxCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxCliente.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<Customer>());
        jComboBoxCliente.setBorder(null);
        bg.add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 300, 40));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 10));

        jButtonGuardar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButtonGuardar.setText("Crear Renta");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        bg.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        Movie selectedMovie = (Movie) jComboBoxPelicula.getSelectedItem();
        Customer selectedCostumer = (Customer) jComboBoxCliente.getSelectedItem();

        if (selectedMovie == null || selectedMovie.getId().isEmpty() || selectedMovie.getTitle().equals("Selecciona una película")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una película válida.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedCostumer == null || selectedCostumer.getId().isEmpty() || selectedCostumer.getName().equals("Selecciona un cliente")) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un cliente valido.", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        blockbusterOperation.createRental(selectedMovie.getId(), selectedCostumer.getId());
        JOptionPane.showMessageDialog(this, "Renta creada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jComboBoxPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeliculaActionPerformed
    }//GEN-LAST:event_jComboBoxPeliculaActionPerformed

    /**
     * @param args the command line arguments
     */
    private DefaultComboBoxModel<Movie> leerPeliculasDesdeCSV(String rutaArchivo) {
        DefaultComboBoxModel<Movie> modeloPeliculas = new DefaultComboBoxModel<>();
        modeloPeliculas.addElement(new Movie("", 0, "Selecciona una película", " ", 0, "", "", "", "")); // Elemento por defecto

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(";");
                if (valores.length == 9) {
                    String id = valores[0];
                    double price = Double.parseDouble(valores[1]);
                    String title = valores[2];
                    String genre = valores[3];
                    int year = Integer.parseInt(valores[4]);
                    String format = valores[5];
                    String director = valores[6];
                    String cast = valores[7];
                    String language = valores[8];
                    modeloPeliculas.addElement(new Movie(id, price, title, genre, year, format, director, cast, language));
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " + e.getMessage());
        }
        return modeloPeliculas;
    }

    private DefaultComboBoxModel<Customer> leerClientesDesdeCSV(String rutaArchivo) {
        DefaultComboBoxModel<Customer> customerModel = new DefaultComboBoxModel<>();
        customerModel.addElement(new Customer("", "Selecciona un cliente", "", "", 1, "")); //Elemento por defecto

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(";");
                if (valores.length == 6) {
                    String id = valores[0];
                    String name = valores[1];
                    String lastName = valores[2];
                    String email = valores[3];
                    int age = Integer.parseInt(valores[4]);
                    String contactNumber = valores[5];
                    customerModel.addElement(new Customer(id, name, lastName, email, age, contactNumber));
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " + e.getMessage());
        }

        return customerModel;
    }

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
            java.util.logging.Logger.getLogger(JFNewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFNewRental().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<Customer> jComboBoxCliente;
    private javax.swing.JComboBox<Movie> jComboBoxPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
