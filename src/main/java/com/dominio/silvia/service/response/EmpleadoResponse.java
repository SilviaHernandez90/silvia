package com.dominio.silvia.service.response;

import com.dominio.silvia.repository.domain.Departamento;

import java.time.LocalDate;

public class EmpleadoResponse {
    Long idEmp;
    String nombre;
    LocalDate fecha;
    Double sueldo;
    String validation;
    DepartamentoResponse departamento;

    public EmpleadoResponse(Long idEmp, String nombre, LocalDate fecha, Double sueldo) {
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
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getValidation() {
        return validation;
    }
    public void setValidation(String validation) {
        this.validation = validation;
    }
    public DepartamentoResponse getDepartamento() {
        return departamento;
    }
    public void setDepartamento(DepartamentoResponse departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "EmpleadoResponse{" +
                "idEmp=" + idEmp +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", sueldo=" + sueldo +
//                ", depto=" + depto +
                '}';
    }
}
