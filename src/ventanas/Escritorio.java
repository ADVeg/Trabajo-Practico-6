package ventanas;

import Clases.DirectorioTelefonico;

public class Escritorio extends javax.swing.JFrame {
    private static DirectorioTelefonico directorio=new DirectorioTelefonico();
    
    public Escritorio() {
        initComponents();
    }

    public static DirectorioTelefonico getDirectorio() {
        return directorio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenu = new javax.swing.JMenuBar();
        jMCliente = new javax.swing.JMenu();
        jMIAgregarCliente = new javax.swing.JMenuItem();
        jMIBuscarCliente = new javax.swing.JMenuItem();
        jMIBorrarCliente = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jMCliente.setText("Cliente");

        jMIAgregarCliente.setText("Agregar Cliente");
        jMIAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgregarClienteActionPerformed(evt);
            }
        });
        jMCliente.add(jMIAgregarCliente);

        jMIBuscarCliente.setText("Buscar Cliente");
        jMIBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarClienteActionPerformed(evt);
            }
        });
        jMCliente.add(jMIBuscarCliente);

        jMIBorrarCliente.setText("Borrar Cliente");
        jMCliente.add(jMIBorrarCliente);

        jMenu.add(jMCliente);

        jMSalir.setText("Salir");

        jMISalir.setText("Salir");
        jMSalir.add(jMISalir);

        jMenu.add(jMSalir);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgregarClienteActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaAgregarCliente vap=new VistaAgregarCliente();
        vap.setVisible(true);
        jEscritorio.add(vap);
    }//GEN-LAST:event_jMIAgregarClienteActionPerformed

    private void jMIBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarClienteActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaBuscarCliente vbc=new VistaBuscarCliente();
        vbc.setVisible(true);
        jEscritorio.add(vbc);
    }//GEN-LAST:event_jMIBuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenu jMCliente;
    private javax.swing.JMenuItem jMIAgregarCliente;
    private javax.swing.JMenuItem jMIBorrarCliente;
    private javax.swing.JMenuItem jMIBuscarCliente;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenu;
    // End of variables declaration//GEN-END:variables
}