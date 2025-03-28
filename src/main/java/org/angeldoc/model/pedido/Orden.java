package org.angeldoc.model.pedido;

import org.angeldoc.model.Usuario;

public class Orden
{
 private int id;
 private float costoTotal;
 private String fecha;
 private int cantidadTotal;
 private String estatusEnvio;
 private float costoEnvio;
 private Usuario usuario;
 private Orden orden;

    public Orden() {
    }

    public Orden(int id, float costoTotal, String fecha, int cantidadTotal, String estatusEnvio, float costoEnvio, Usuario usuario, Orden orden) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
        this.cantidadTotal = cantidadTotal;
        this.estatusEnvio = estatusEnvio;
        this.costoEnvio = costoEnvio;
        this.usuario = usuario;
        this.orden = orden;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getEstatusEnvio() {
        return estatusEnvio;
    }

    public void setEstatusEnvio(String estatusEnvio) {
        this.estatusEnvio = estatusEnvio;
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
}
