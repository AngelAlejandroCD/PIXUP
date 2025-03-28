package org.angeldoc.model.pedido;

import org.angeldoc.model.producto.Disco;

public class DetalleOrden
{
    private Disco disco;
    private Orden orden;
    private int cantidad;
    private float costo;

    public DetalleOrden() {
    }

    public DetalleOrden(Disco disco, Orden orden, int cantidad, float costo) {
        this.disco = disco;
        this.orden = orden;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
