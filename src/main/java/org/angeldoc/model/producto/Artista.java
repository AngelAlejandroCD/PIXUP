package org.angeldoc.model.producto;

public class Artista
{
    private int id;
    private String nombre;
    private Artista artista;

    public Artista() {
    }

    public Artista(int id, String nombre, Artista artista) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
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

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
