package org.angeldoc.model.producto;

public class GeneroMusical
{
    private int id;
    private GeneroMusical generoMusical;
    private String descripcion;

    public GeneroMusical() {
    }

    public GeneroMusical(int id, GeneroMusical generoMusical, String descripcion) {
        this.id = id;
        this.generoMusical = generoMusical;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
