package com.demo.controller;

import com.demo.model.textArchivo;

import com.demo.model.Usuario;
import com.demo.view.VistaLogUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class ControllerLogup extends Controller implements ActionListener {

    long idusuario = 1;
    int tConexion;
    private VistaLogUp vista;
    private Usuario user;

    public ControllerLogup(VistaLogUp vista) {
        this.vista = vista;
        this.vista.BREGISTRAR.addActionListener(this);
        inicio();
    }

    public void tipoConexion(int tipo) {
        tConexion = tipo;
    }

    public void inicio() {
        vista.setTitle("MODEL VIEW CONTROLLER");
        if (!vista.isVisible()) {
            vista.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BREGISTRAR) {
            switch ((int) esCorrecto()) {
                case 10:
                    registro();
                    vaciarCasillas();
                    break;
                case 20:
                    JOptionPane.showMessageDialog(null, "Casillas Vacias", "Falta llenar", JOptionPane.WARNING_MESSAGE);
                    break;
                case 30:
                    JOptionPane.showMessageDialog(null, "Contraseñas no Coinciden", "Error Contraseñas", JOptionPane.WARNING_MESSAGE);
                    break;
                case 40:
                    JOptionPane.showMessageDialog(null, "Correo No Valido", "Verificar Correo", JOptionPane.WARNING_MESSAGE);
                    break;
            }

        }
    }

    public long esCorrecto() {
        /*10 = Correcto
          20 = Casillas Vacias
          30 = Contraseñas no coinciden
          40 = Correo no valido
         */
        long status = 10;
        if (vista.RNOMBRE.getText().compareTo("") == 0 || vista.RAPELLIDO.getText().compareTo("") == 0 || vista.RUSUARIO.getText().compareTo("") == 0 || vista.RCLAVE.getText().compareTo("") == 0 || vista.RREPETIRCLAVE.getText().compareTo("") == 0) {
            status = 20;
        } else if (!vista.RCLAVE.getText().equals(vista.RREPETIRCLAVE.getText())) {
            status = 30;
        } else if (!validarCorreo(vista.RUSUARIO.getText())) {
            status = 40;
        }

        return status;
    }

    public void registro() {
        String nombre, apellido, email, contraseña;
        int tipo;
        nombre = vista.RNOMBRE.getText();
        apellido = vista.RAPELLIDO.getText();
        if (vista.jComboBox1.getSelectedItem().toString().equals("Admin")) {
            tipo = 1;
        } else {
            tipo = 2;
        }
        email = vista.RUSUARIO.getText();
        contraseña = DigestUtils.md5Hex(vista.RCLAVE.getText());

        Usuario usuario = new Usuario(idusuario, email, contraseña, apellido, nombre, tipo);

        if (tConexion == 1) {
            if (textArchivo.registrarse(usuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado Con Exito");
                vaciarCasillas();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO");
            }
      
        }

        idusuario++;
    }

    public void vaciarCasillas() {
        vista.RAPELLIDO.setText(null);
        vista.RCLAVE.setText(null);
        vista.RNOMBRE.setText(null);
        vista.RREPETIRCLAVE.setText(null);
        vista.RUSUARIO.setText(null);
    }

    public boolean validarCorreo(String email) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);

        return mather.find();
    }
}
