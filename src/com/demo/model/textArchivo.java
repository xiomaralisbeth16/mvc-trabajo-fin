package com.demo.model;

import com.demo.model.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class textArchivo {

    static File textArchivo = new File("registrodeusuarios.txt");

    static public boolean registrarse(Usuario usuario) {
        boolean registrado = false;
        boolean existe = false;
        try {
            if (!textArchivo.exists()) {
                textArchivo.createNewFile();
            }

            FileReader fr = new FileReader(textArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            linea = br.readLine();
            String[] atributos;
            while (linea != null) {
                atributos = linea.split(" ");
                if (usuario.equals(atributos[3])) {
                    existe = true;
                    break;
                } else {

                }
                linea = br.readLine();
            }

            if (!existe) {
                FileWriter fw = new FileWriter(textArchivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(usuario.getNombre() + " ");
                bw.write(usuario.getApellido() + " ");
                bw.write((usuario.getTipo() == 2 ? "Usuario" : "Admin") + " ");
                bw.write(usuario.getEmail() + " ");
                bw.write(usuario.getClave());
                bw.newLine();
                bw.close();
                registrado = true;
            }

        } catch (IOException ex) {
            System.err.println("No se pudo escribir");
        }
        return registrado;
    }

    static public boolean ingresar(String usuario, String password) {
        boolean band = false;

        try {
            FileReader fr = new FileReader(textArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            linea = br.readLine();
            String[] atributos;
            while (linea != null) {
                atributos = linea.split(" ");
                if (usuario.equals(atributos[3])) {
                    if (password.equals(atributos[4])) {
                        band = true;
                    }
                }
                linea = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.err.println("NO SE PUEDE LEER EL ARCHIVO");
        } catch (IOException ex) {
            Logger.getLogger(textArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }

    static public boolean Ccontraseña(String usuario, String contraNueva) {
        boolean band = false;

        try {
            FileReader fr = new FileReader(textArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            ArrayList<String> nuevosDatos = new ArrayList<>();
            linea = br.readLine();
            String[] atributos;
            while (linea != null) {
                atributos = linea.split(" ");
                if (usuario.equals(atributos[3])) {
                    atributos[4] = contraNueva;
                    band = true;

                }
                nuevosDatos.add(atributos[0] + " " + atributos[1] + " " + atributos[2] + " " + atributos[3] + " " + atributos[4]);
                linea = br.readLine();
            }
            FileWriter fw = new FileWriter(textArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < nuevosDatos.size(); i++) {
                bw.write(nuevosDatos.get(i));
                bw.newLine();
            }

            bw.close();

        } catch (FileNotFoundException ex) {
            System.err.println("NO SE PUEDE LEER EL ARCHIVO");
        } catch (IOException ex) {
            Logger.getLogger(textArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }

}
