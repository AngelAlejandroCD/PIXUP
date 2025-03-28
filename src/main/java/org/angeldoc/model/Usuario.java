package org.angeldoc.model;

public class Usuario
{
    private int id;
    private Usuario usuario;
    private String nombre;
    private String apellido;
    private String segundoApellido;
    private String contraseña;
    private String email;
    private String rfc;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String segundoApellido, String contraseña, String email, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.contraseña = contraseña;
        this.email = email;
        this.rfc = rfc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
