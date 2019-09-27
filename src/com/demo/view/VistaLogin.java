package com.demo.view;

/**
 *
 * @author Xiomara
 */
public class VistaLogin extends javax.swing.JFrame {

    public VistaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        MIgRUPO = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LUSUARIO = new javax.swing.JTextField();
        LCLAVE = new javax.swing.JPasswordField();
        BLOGIN = new javax.swing.JButton();
        BLOGUP = new javax.swing.JButton();
        BRECUPERARCLAVE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuTxt = new javax.swing.JRadioButtonMenuItem();
        jMenuBD = new javax.swing.JRadioButtonMenuItem();
        jMenuExit = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setIconImages(null);

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("USUARIO:");

        jLabel1.setBackground(new java.awt.Color(255, 0, 153));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("DEMO LOGIN");

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CLAVE:");

        LUSUARIO.setBackground(new java.awt.Color(255, 204, 204));
        LUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LUSUARIOActionPerformed(evt);
            }
        });

        LCLAVE.setBackground(new java.awt.Color(255, 204, 204));

        BLOGIN.setBackground(new java.awt.Color(255, 255, 204));
        BLOGIN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BLOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chica (1).png"))); // NOI18N
        BLOGIN.setText("Log In");
        BLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLOGINActionPerformed(evt);
            }
        });

        BLOGUP.setBackground(new java.awt.Color(255, 255, 204));
        BLOGUP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BLOGUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anotar.png"))); // NOI18N
        BLOGUP.setText("Log Up");
        BLOGUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLOGUPActionPerformed(evt);
            }
        });

        BRECUPERARCLAVE.setBackground(new java.awt.Color(255, 255, 204));
        BRECUPERARCLAVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BRECUPERARCLAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desarchivar.png"))); // NOI18N
        BRECUPERARCLAVE.setText("Recuperar clave");
        BRECUPERARCLAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRECUPERARCLAVEActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jMenu2.setBackground(new java.awt.Color(255, 0, 153));
        jMenu2.setText("CONECTADO");
        MIgRUPO.add(jMenu2);

        MIgRUPO.add(jMenuTxt);
        jMenuTxt.setSelected(true);
        jMenuTxt.setText("TXT");
        jMenu2.add(jMenuTxt);

        MIgRUPO.add(jMenuBD);
        jMenuBD.setText("BD");
        jMenu2.add(jMenuBD);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuExit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BRECUPERARCLAVE)
                    .addComponent(BLOGIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLOGUP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LUSUARIO)
                            .addComponent(LCLAVE, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(BLOGIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(BLOGUP)
                .addGap(18, 18, 18)
                .addComponent(BRECUPERARCLAVE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LUSUARIOActionPerformed

    }//GEN-LAST:event_LUSUARIOActionPerformed

    private void BLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLOGINActionPerformed
        
    }//GEN-LAST:event_BLOGINActionPerformed

    private void BLOGUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLOGUPActionPerformed
        
    }//GEN-LAST:event_BLOGUPActionPerformed

    private void BRECUPERARCLAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRECUPERARCLAVEActionPerformed

    }//GEN-LAST:event_BRECUPERARCLAVEActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuExitActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BLOGIN;
    public javax.swing.JButton BLOGUP;
    public javax.swing.JButton BRECUPERARCLAVE;
    public javax.swing.JPasswordField LCLAVE;
    public javax.swing.JTextField LUSUARIO;
    private javax.swing.ButtonGroup MIgRUPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JRadioButtonMenuItem jMenuBD;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuExit;
    public javax.swing.JRadioButtonMenuItem jMenuTxt;
    // End of variables declaration//GEN-END:variables
}
