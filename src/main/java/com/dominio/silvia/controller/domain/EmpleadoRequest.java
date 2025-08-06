package com.dominio.silvia.controller.domain;

import java.time.LocalDate;

public class EmpleadoRequest {
    Long idEmp;
    String nombre;
    LocalDate fecha;
    double sueldo;

    public EmpleadoRequest(Long idEmp, String nombre, LocalDate fecha, Double sueldo) {
        this.idEmp = idEmp;
        this.nombre = nombre;
        this.fecha = fecha;
        this.sueldo = sueldo;

    }

    public Long getIdEmp() {
        return idEmp;
    }
    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EmpleadoRequest{" +
                "idEmp=" + idEmp +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", sueldo=" + sueldo +
                '}';
    }
}
