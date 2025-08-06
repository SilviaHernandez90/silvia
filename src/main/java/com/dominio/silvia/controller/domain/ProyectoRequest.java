package com.dominio.silvia.controller.domain;

public class ProyectoRequest {
    int IdProyecto;
    String NombreProyecto;
    int maxHoras;

    public ProyectoRequest(int idProyecto, String nombre, int maxHoras) {
        this.IdProyecto = idProyecto;
        this.NombreProyecto = nombre;
        this.maxHoras = maxHoras;
    }
    public int getIdProyecto() {
        return IdProyecto;
    }
    public void setIdProyecto(int idProyecto) {
        this.IdProyecto = idProyecto;
    }
    public String getNombreProyecto() {
        return NombreProyecto;
    }
    public void setNombreProyecto(String NombreProyecto) {
        this.NombreProyecto = NombreProyecto;
    }
    public int getMaxHoras() {
        return maxHoras;
    }
    public void setMaxHoras(int maxHoras) {
        this.maxHoras = maxHoras;
    }

    @Override
    public String toString() {
        return "ProyectoRequest{" +
                "IdProyecto=" + IdProyecto +
                ", NombreProyecto='" + NombreProyecto + '\'' +
                ", maxHoras=" + maxHoras +
                '}';
    }
}

