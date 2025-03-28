package org.angeldoc.model.producto;

public class Cancion
{
    private int id;
    private String titulo;
    private double duracion;
    private Disco disco;

    public Cancion() {
    }

    public Cancion(int id, String titulo, double duracion, Disco disco) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.disco = disco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }
}
