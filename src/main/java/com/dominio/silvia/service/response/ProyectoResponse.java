package com.dominio.silvia.service.response;

public class ProyectoResponse {
    int idProy;
    String nombre;
    int maxHoras;

    public ProyectoResponse(int idProy, String nombre, int maxHoras) {
        this.idProy = idProy;
        this.nombre = nombre;
        this.maxHoras = maxHoras;
    }
    public int getIdProy() {
        return idProy;
    }
    public void setIdProy(int idProy) {
        this.idProy = idProy;
    }
    public String getNombre() {
        return  nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getMaxHoras() {
        return maxHoras;
    }
    public void setMaxHoras(int maxHoras) {
        this.maxHoras = maxHoras;
    }

    @Override
    public String toString() {
        return "ProyectoResponse{" +
                "idProy=" + idProy +
                ", nombre='" + nombre + '\'' +
                ", maxHoras=" + maxHoras +
                '}';
    }
}
