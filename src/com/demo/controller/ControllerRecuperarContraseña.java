package com.demo.controller;

import com.demo.model.textArchivo;

import com.demo.view.VistaRecuperarContraseña;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class ControllerRecuperarContraseña implements ActionListener {

    private VistaRecuperarContraseña vista;
    private int tconexion;

    public ControllerRecuperarContraseña(VistaRecuperarContraseña vista) {
        this.vista = vista;
        this.vista.btnConfirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnConfirmar) {

            if (tconexion != 0) {
                String usuario = vista.RRUSUARIO.getText();
                String contraNueva = DigestUtils.md5Hex(vista.RNCLAVE.getText());
                if (tconexion == 1) {
                    if (textArchivo.Ccontraseña(usuario, contraNueva)) {
                        JOptionPane.showMessageDialog(null, "Usuario modificado", "Modificacion hecha", JOptionPane.INFORMATION_MESSAGE);
                        vaciarCajas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado", "No existe", JOptionPane.ERROR_MESSAGE);
                    }
            
                }

            }
        }
    }

    public void setTconexion(int tconexion) {
        this.tconexion = tconexion;
    }

    public void vaciarCajas() {
        vista.RNCLAVE.setText(null);
        vista.RRUSUARIO.setText(null);
    }

}
