
package com.demo.controller;

import com.demo.model.textArchivo;

import com.demo.view.VistaLogUp;
import com.demo.view.VistaLogin;
import com.demo.view.VistaRecuperarContraseña;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class ControllerLogin extends Controller implements ActionListener {
    
    private ControllerLogup cVistaLogUp;
    private ControllerRecuperarContraseña cVistaRecuperarContraseña;
    
    private VistaLogUp vistaLogUp;
    private VistaLogin vista;
    private VistaRecuperarContraseña vRecuperarContraseña;
    
    private int tipoConexion;
    
    public ControllerLogin(VistaLogin vista) {
        this.vista = vista;
        vista.BLOGIN.addActionListener(this);
        vista.BLOGUP.addActionListener(this);
        vista.BRECUPERARCLAVE.addActionListener(this);
       
        vista.jMenuBD.addActionListener(this);
        vista.jMenuTxt.addActionListener(this);
        vista.jMenuExit.addActionListener(this);
        
        inicio();
    }
    
    public void inicio() {
        vista.setTitle("MODEL VIEW CONTROLLER");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (vista.jMenuTxt.isSelected()) {
            tipoConexion = 1;
        } else if (vista.jMenuBD.isSelected()) {
            tipoConexion = 2;
        } else {
            tipoConexion = 0;
        }
        
        if (ae.getSource() == vista.BLOGUP) {
            if (vistaLogUp == null) {
                vistaLogUp = new VistaLogUp();
                cVistaLogUp = new ControllerLogup(vistaLogUp);
                vistaLogUp.setLocationRelativeTo(vista);
            }
            cVistaLogUp.tipoConexion(tipoConexion);
            vistaLogUp.setVisible(true);
            
        }
        if (ae.getSource() == vista.BLOGIN) {
            if (tipoConexion == 1) {
                if (textArchivo.ingresar(vista.LUSUARIO.getText(), DigestUtils.md5Hex(vista.LCLAVE.getText()))) {
                    JOptionPane.showMessageDialog(null, "Logeo Correcto");
                    vaciarCajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto","Error en digitacion",JOptionPane.ERROR_MESSAGE);
                }
            
            }
            
        }
        
        if (ae.getSource() == vista.BRECUPERARCLAVE) {
            if (vRecuperarContraseña == null) {
                vRecuperarContraseña = new VistaRecuperarContraseña();
                cVistaRecuperarContraseña = new ControllerRecuperarContraseña(vRecuperarContraseña);
                vRecuperarContraseña.setLocationRelativeTo(vista);
            }
            cVistaRecuperarContraseña.setTconexion(tipoConexion);
            vRecuperarContraseña.setVisible(true);
        }
        
    }
    
    public void vaciarCajas() {
        vista.LUSUARIO.setText(null);
        vista.LCLAVE.setText(null);
    }
    
}
