/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_is2;

/**
 *
 * @author alumno
 */
public class LoginGerente extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginGerente() {
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

        BotonAceptarGerente = new javax.swing.JButton();
        TextfieldContrasenyaGerente = new javax.swing.JTextField();
        TextfieldUsuarioGerente = new javax.swing.JTextField();
        LabelUsuarioGerente = new javax.swing.JLabel();
        LabelContrasenyaGerente = new javax.swing.JLabel();
        TituloGerente = new javax.swing.JLabel();
        BotonVolverGerente = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAceptarGerente.setText("Aceptar");
        BotonAceptarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarGerenteActionPerformed(evt);
            }
        });

        TextfieldContrasenyaGerente.setColumns(10);

        TextfieldUsuarioGerente.setColumns(10);
        TextfieldUsuarioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldUsuarioGerenteActionPerformed(evt);
            }
        });

        LabelUsuarioGerente.setText("Usuario");

        LabelContrasenyaGerente.setText("Contraseña");

        TituloGerente.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 24)); // NOI18N
        TituloGerente.setText("Inicio Gerente");

        BotonVolverGerente.setText("Volver");
        BotonVolverGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUsuarioGerente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextfieldUsuarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelContrasenyaGerente)
                            .addGap(18, 18, 18)
                            .addComponent(TextfieldContrasenyaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(BotonAceptarGerente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverGerente)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(TituloGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(TituloGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuarioGerente)
                    .addComponent(TextfieldUsuarioGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextfieldContrasenyaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelContrasenyaGerente))
                .addGap(30, 30, 30)
                .addComponent(BotonAceptarGerente)
                .addGap(18, 18, 18)
                .addComponent(BotonVolverGerente)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAceptarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAceptarGerenteActionPerformed

    private void TextfieldUsuarioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldUsuarioGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldUsuarioGerenteActionPerformed

    private void BotonVolverGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverGerenteActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptarGerente;
    private javax.swing.JToggleButton BotonVolverGerente;
    private javax.swing.JLabel LabelContrasenyaGerente;
    private javax.swing.JLabel LabelUsuarioGerente;
    private javax.swing.JTextField TextfieldContrasenyaGerente;
    private javax.swing.JTextField TextfieldUsuarioGerente;
    private javax.swing.JLabel TituloGerente;
    // End of variables declaration//GEN-END:variables
}
