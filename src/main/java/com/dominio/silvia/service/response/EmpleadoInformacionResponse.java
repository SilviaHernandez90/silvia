package com.dominio.silvia.service.response;

public class EmpleadoInformacionResponse {
    String Nombre;
    Double Sueldo;
    String nombreDepartamento;

    public EmpleadoInformacionResponse(String Nombre, Double Sueldo, String nombreDepartamento) {
        this.Nombre = Nombre;
        this.Sueldo = Sueldo;
        this.nombreDepartamento = nombreDepartamento;

    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public Double getSueldo() {
        return Sueldo;
    }
    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    @Override
    public String toString() {
        return "EmpleadoInformacionResponse{" +
                "Nombre='" + Nombre + '\'' +
                ", Sueldo=" + Sueldo +
                ", nombreDepartamento='" + nombreDepartamento + '\'' +
                '}';
    }
}
