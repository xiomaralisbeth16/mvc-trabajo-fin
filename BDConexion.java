package com.demo.model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BDConexion {

    public static final String url = "jdbc:mysql://localhost:3306/bdlog";
    public static final String usuario = "root";
    public static final String clave = "";

    public static Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, usuario, clave);
            //JOptionPane.showMessageDialog(null, "CONEXION ESTABLECIDA");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return conexion;
    }
}
