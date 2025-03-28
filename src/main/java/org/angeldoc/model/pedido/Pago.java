package org.angeldoc.model.pedido;

public class Pago
{
    private int id;
    private char numeroTarjeta;
    private float monto;
    private String fecha;
    private Orden orden;

    public Pago() {
    }

    public Pago(int id, char numeroTarjeta, float monto, String fecha, Orden orden) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.monto = monto;
        this.fecha = fecha;
        this.orden = orden;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(char numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
}
