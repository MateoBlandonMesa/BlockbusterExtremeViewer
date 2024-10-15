/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package blackbusterextremeviewerui;

/**
 *
 * @author blandonm
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        nuevaPeliculaMenuItem = new javax.swing.JMenuItem();
        nuevoClienteMenuItem = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        verMenu = new javax.swing.JMenu();
        inventarioDePeliculasMenuItem = new javax.swing.JMenuItem();
        listadeClientesMenuItem = new javax.swing.JMenuItem();
        alquileresMenu = new javax.swing.JMenu();
        nuevoAlquilerMenuItem = new javax.swing.JMenuItem();
        listaDeAlquileresMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        archivoMenu.add(nuevoClienteMenuItem);

        salirMenuItem.setMnemonic('a');
        salirMenuItem.setText("Salir");
        archivoMenu.add(salirMenuItem);

        menuBar.add(archivoMenu);

        verMenu.setMnemonic('e');
        verMenu.setText("Ver");

        inventarioDePeliculasMenuItem.setMnemonic('t');
        inventarioDePeliculasMenuItem.setText("Inventario de películas");
        verMenu.add(inventarioDePeliculasMenuItem);

        listadeClientesMenuItem.setMnemonic('y');
        listadeClientesMenuItem.setText("Lista de clientes");
        verMenu.add(listadeClientesMenuItem);

        menuBar.add(verMenu);

        alquileresMenu.setMnemonic('h');
        alquileresMenu.setText("Alquileres");

        nuevoAlquilerMenuItem.setMnemonic('c');
        nuevoAlquilerMenuItem.setText("Nuevo alquiler");
        alquileresMenu.add(nuevoAlquilerMenuItem);

        listaDeAlquileresMenuItem.setMnemonic('a');
        listaDeAlquileresMenuItem.setText("Lista de alquileres");
        alquileresMenu.add(listaDeAlquileresMenuItem);

        menuBar.add(alquileresMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaPeliculaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPeliculaMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaPeliculaMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alquileresMenu;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem inventarioDePeliculasMenuItem;
    private javax.swing.JMenuItem listaDeAlquileresMenuItem;
    private javax.swing.JMenuItem listadeClientesMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nuevaPeliculaMenuItem;
    private javax.swing.JMenuItem nuevoAlquilerMenuItem;
    private javax.swing.JMenuItem nuevoClienteMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JMenu verMenu;
    // End of variables declaration//GEN-END:variables

}
