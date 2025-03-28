package org.angeldoc.model;

public class TipoNotificacion
{
    private int id;
    private String descripcion;
    private String rutaPlantilla;

    public TipoNotificacion() {
    }

    public TipoNotificacion(int id, String descripcion, String rutaPlantilla) {
        this.id = id;
        this.descripcion = descripcion;
        this.rutaPlantilla = rutaPlantilla;
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

    public String getRutaPlantilla() {
        return rutaPlantilla;
    }

    public void setRutaPlantilla(String rutaPlantilla) {
        this.rutaPlantilla = rutaPlantilla;
    }
}
