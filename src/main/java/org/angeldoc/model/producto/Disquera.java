package org.angeldoc.model.producto;

public class Disquera
{
    private int id;
    private int cantidad;
    private Disquera disquera;

    public Disquera() {
    }

    public Disquera(int id, int cantidad, Disquera disquera) {
        this.id = id;
        this.cantidad = cantidad;
        this.disquera = disquera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }
}
