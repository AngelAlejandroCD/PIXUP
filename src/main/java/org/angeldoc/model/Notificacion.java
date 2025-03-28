package org.angeldoc.model;

public class Notificacion
{
    private int id;
    private String fechaNotificacion;
    private Usuario usuario;
    private TipoNotificacion tipoNotificacion;

    public Notificacion() {
    }

    public Notificacion(int id, String fechaNotificacion, Usuario usuario, TipoNotificacion tipoNotificacion) {
        this.id = id;
        this.fechaNotificacion = fechaNotificacion;
        this.usuario = usuario;
        this.tipoNotificacion = tipoNotificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(String fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }
}
