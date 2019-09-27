
package com.demo.view;
import com.demo.view.Vista;

/**
 *
 * @author Xiomara
 */


public class VistaLogUp extends javax.swing.JFrame {
    Vista v;
    public VistaLogUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CLAVE = new javax.swing.JLabel();
        RCLAVE = new javax.swing.JPasswordField();
        BREGISTRAR = new javax.swing.JButton();
        REPETIRCLAVE = new javax.swing.JLabel();
        RREPETIRCLAVE = new javax.swing.JPasswordField();
        NOMBRE = new javax.swing.JLabel();
        APELLIDO = new javax.swing.JLabel();
        RAPELLIDO = new javax.swing.JTextField();
        RNOMBRE = new javax.swing.JTextField();
        USUARIO = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        RUSUARIO = new javax.swing.JTextField();
        TIPO = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BREGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        CLAVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CLAVE.setText("CLAVE:");

        RCLAVE.setBackground(new java.awt.Color(255, 204, 255));

        BREGISTRAR.setBackground(new java.awt.Color(255, 255, 204));
        BREGISTRAR.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        BREGISTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anotar.png"))); // NOI18N
        BREGISTRAR.setText("Registrar");
        BREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BREGISTRARActionPerformed(evt);
            }
        });

        REPETIRCLAVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        REPETIRCLAVE.setText("REPETIR CLAVE:");

        RREPETIRCLAVE.setBackground(new java.awt.Color(255, 204, 255));

        NOMBRE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NOMBRE.setText("NOMBRE:");

        APELLIDO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        APELLIDO.setText("APELLIDO:");

        RAPELLIDO.setBackground(new java.awt.Color(255, 204, 255));
        RAPELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAPELLIDOActionPerformed(evt);
            }
        });

        RNOMBRE.setBackground(new java.awt.Color(255, 204, 255));
        RNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNOMBREActionPerformed(evt);
            }
        });

        USUARIO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        USUARIO.setText("USUARIO:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Usuario" }));

        RUSUARIO.setBackground(new java.awt.Color(255, 204, 255));
        RUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUSUARIOActionPerformed(evt);
            }
        });

        TIPO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TIPO.setText("TIPO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        jLabel7.setText("REGISTRO");

        BREGRESAR.setBackground(new java.awt.Color(255, 255, 204));
        BREGRESAR.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        BREGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        BREGRESAR.setText("Regresar");
        BREGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BREGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(BREGISTRAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BREGRESAR)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(REPETIRCLAVE)
                            .addComponent(NOMBRE)
                            .addComponent(CLAVE)
                            .addComponent(USUARIO)
                            .addComponent(APELLIDO)
                            .addComponent(TIPO))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RREPETIRCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE)
                    .addComponent(RNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APELLIDO)
                    .addComponent(RAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPO))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USUARIO))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLAVE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RREPETIRCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPETIRCLAVE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BREGISTRAR)
                    .addComponent(BREGRESAR))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BREGISTRARActionPerformed
        

    }//GEN-LAST:event_BREGISTRARActionPerformed

    private void RAPELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAPELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAPELLIDOActionPerformed

    private void RNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNOMBREActionPerformed

    private void RUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUSUARIOActionPerformed

    }//GEN-LAST:event_RUSUARIOActionPerformed

    private void BREGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BREGRESARActionPerformed
             
        dispose();
    }//GEN-LAST:event_BREGRESARActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APELLIDO;
    public javax.swing.JButton BREGISTRAR;
    private javax.swing.JButton BREGRESAR;
    private javax.swing.JLabel CLAVE;
    private javax.swing.JLabel NOMBRE;
    public javax.swing.JTextField RAPELLIDO;
    public javax.swing.JPasswordField RCLAVE;
    private javax.swing.JLabel REPETIRCLAVE;
    public javax.swing.JTextField RNOMBRE;
    public javax.swing.JPasswordField RREPETIRCLAVE;
    public javax.swing.JTextField RUSUARIO;
    private javax.swing.JLabel TIPO;
    private javax.swing.JLabel USUARIO;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
