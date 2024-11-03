/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package blackbusterextremeviewerui;

import blockbusterextremeviewer.classes.Operation;
import blockbusterextremeviewer.classes.Rental;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author blandonm
 */
public class JFListRental extends javax.swing.JFrame {

    Operation blockbusterOperation = new Operation();

    /**
     * Creates new form MainView
     */
    public JFListRental() {
        initComponents();

        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        List<Rental> rentals = loadRentalsFromCSV(blockbusterOperation.getRentalsTableFilePath());

        for (Rental rental : rentals) {
            listModel.addElement(rental.getId());
        }
        jListRentals.setModel(listModel);

        jListRentals.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = jListRentals.getSelectedIndex();
                if (selectedIndex != -1) {
                    Rental selectedRental = rentals.get(selectedIndex);
                    jTextAreaDescription.setText(
                            "Id renta: " + selectedRental.getId()
                            + "\nPelicula: " + selectedRental.getIdMovie()
                            + "\nCliente: " + selectedRental.getIdCustomer()
                            + "\nDía de prestamo: " + selectedRental.getRentalDate()
                            + "\nDía de retorno: " + selectedRental.getReturnDate()
                            + "\nPrecio: " + selectedRental.getTotalCost()
                            + "\nRetornada: " + selectedRental.isMovieReturned()
                    );
                }

            }
        });
    }

    public List<Rental> loadRentalsFromCSV(String filePath) {

        List<Rental> rentalsMovieModel = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length == 7) {
                    String idRental = values[0];
                    String idMovie = selectedItem(values[1], blockbusterOperation.getMoviesTableFilePath(), 1);
                    String IdCustomer = selectedItem(values[2], blockbusterOperation.getCustomersTableFilePath(), 2);
                    LocalDate rentalDate = LocalDate.parse(values[3]);
                    LocalDate returnDate = LocalDate.parse(values[4]);
                    double price = Double.parseDouble(values[5]);
                    rentalsMovieModel.add(new Rental(idRental, idMovie, IdCustomer, rentalDate, returnDate, price, false));
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " + e.getMessage());
        }
        return rentalsMovieModel;
    }

    public String selectedItem(String idSelected, String filePath, int identifier) {

        System.out.println(idSelected);
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields[0].equals(idSelected)) {
                    if (identifier == 1) {
                        return fields[2];
                    } else {
                        return fields[1] + " " + fields[2];
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al buscar el nombre de la pelicula: " + e.getMessage());
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelRentals = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListRentals = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        nuevaPeliculaMenuItem = new javax.swing.JMenuItem();
        nuevoClienteMenuItem = new javax.swing.JMenuItem();
        verMenu = new javax.swing.JMenu();
        listadeClientesMenuItem = new javax.swing.JMenuItem();
        listaDeAlquileresMenuItem = new javax.swing.JMenuItem();
        alquileresMenu = new javax.swing.JMenu();
        nuevoAlquilerMenuItem = new javax.swing.JMenuItem();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BlockBuster Store");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/blockbusterIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jButton1.setText("jButton1");
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jLabelRentals.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelRentals.setText("Rentas disponibles");
        bg.add(jLabelRentals, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabelDescription.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabelDescription.setText("Informacion adicional");
        bg.add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jListRentals.setBorder(null);
        jListRentals.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jListRentals);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 300));

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setBorder(null);
        jScrollPane2.setViewportView(jTextAreaDescription);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 280, 300));

        archivoMenu.setMnemonic('f');
        archivoMenu.setText("Archivo");

        nuevaPeliculaMenuItem.setMnemonic('o');
        nuevaPeliculaMenuItem.setText("Nueva película");
        nuevaPeliculaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPeliculaMenuItemActionPerformed(evt);
            }
        });
        archivoMenu.add(nuevaPeliculaMenuItem);

        nuevoClienteMenuItem.setMnemonic('s');
        nuevoClienteMenuItem.setText("Nuevo cliente");
        nuevoClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteMenuItemActionPerformed(evt);
            }
        });
        archivoMenu.add(nuevoClienteMenuItem);

        menuBar.add(archivoMenu);

        verMenu.setMnemonic('e');
        verMenu.setText("Ver");

        listadeClientesMenuItem.setMnemonic('y');
        listadeClientesMenuItem.setText("Lista de clientes");
        verMenu.add(listadeClientesMenuItem);

        listaDeAlquileresMenuItem.setMnemonic('a');
        listaDeAlquileresMenuItem.setText("Lista de alquileres");
        verMenu.add(listaDeAlquileresMenuItem);

        menuBar.add(verMenu);

        alquileresMenu.setMnemonic('h');
        alquileresMenu.setText("Alquileres");

        nuevoAlquilerMenuItem.setMnemonic('c');
        nuevoAlquilerMenuItem.setText("Nuevo alquiler");
        nuevoAlquilerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlquilerMenuItemActionPerformed(evt);
            }
        });
        alquileresMenu.add(nuevoAlquilerMenuItem);

        menuBar.add(alquileresMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaPeliculaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPeliculaMenuItemActionPerformed
        JFNewMovie newMovie = new JFNewMovie();
        newMovie.setVisible(true);
    }//GEN-LAST:event_nuevaPeliculaMenuItemActionPerformed

    private void nuevoClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteMenuItemActionPerformed
        JFNewCostumer nuevoCliente = new JFNewCostumer();
        nuevoCliente.setVisible(true);
    }//GEN-LAST:event_nuevoClienteMenuItemActionPerformed

    private void nuevoAlquilerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlquilerMenuItemActionPerformed
        JFNewRental nuevaRenta = new JFNewRental();
        nuevaRenta.setVisible(true);
    }//GEN-LAST:event_nuevoAlquilerMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(JFListRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFListRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFListRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFListRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFListRental().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alquileresMenu;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelRentals;
    private javax.swing.JList<String> jListRentals;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JMenuItem listaDeAlquileresMenuItem;
    private javax.swing.JMenuItem listadeClientesMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nuevaPeliculaMenuItem;
    private javax.swing.JMenuItem nuevoAlquilerMenuItem;
    private javax.swing.JMenuItem nuevoClienteMenuItem;
    private javax.swing.JMenu verMenu;
    // End of variables declaration//GEN-END:variables

}
