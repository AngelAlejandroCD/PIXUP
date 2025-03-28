package org.angeldoc.model;

public class TipoDomicilio
{
    private int id;
    private String descripcion;
    private TipoDomicilio tipoDomicilio;

    public TipoDomicilio() {
    }

    public TipoDomicilio(int id, String descripcion, TipoDomicilio tipoDomicilio) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipoDomicilio = tipoDomicilio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoDomicilio getTipoDomicilio() {
        return tipoDomicilio;
    }

    public void setTipoDomicilio(TipoDomicilio tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }
}
