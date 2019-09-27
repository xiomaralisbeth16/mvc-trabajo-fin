package com.demo.model;

public class Usuario {

    private long idusuario;
    private String email;
    private String clave;
    private String apellido;
    private String nombre;
    private int tipo;

    public Usuario() {
    }

    public Usuario(long id, String email, String contraseña, String apellidos, String nombre, int tipo) {
        this.idusuario = id;
        this.email = email;
        this.clave = contraseña;
        this.apellido = apellidos;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Usuario(String email, String contraseña) {
        this.email = email;
        this.clave = contraseña;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
