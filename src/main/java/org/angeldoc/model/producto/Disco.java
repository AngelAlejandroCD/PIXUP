package org.angeldoc.model.producto;

public class Disco
{
    private int id;
    private String titulo;
    private float precio;
    private int existencia;
    private float descuento;
    private String fechaLanzamiento;
    private String imagen;
    private Disquera disquera;
    private Artista atista;
    private GeneroMusical generoMusical;

    public Disco() {
    }

    public Disco(int id, String titulo, float precio, int existencia, float descuento, String fechaLanzamiento, String imagen, Disquera disquera, Artista atista, GeneroMusical generoMusical) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.existencia = existencia;
        this.descuento = descuento;
        this.fechaLanzamiento = fechaLanzamiento;
        this.imagen = imagen;
        this.disquera = disquera;
        this.atista = atista;
        this.generoMusical = generoMusical;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public Artista getAtista() {
        return atista;
    }

    public void setAtista(Artista atista) {
        this.atista = atista;
    }

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }
}
