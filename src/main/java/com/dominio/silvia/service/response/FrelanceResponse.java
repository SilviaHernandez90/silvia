package com.dominio.silvia.service.response;

import com.dominio.silvia.repository.domain.Empleado;

public class FrelanceResponse {
    Empleado empleado;
    Long valorHora;

    public FrelanceResponse(Empleado empleado, Long valorHora) {
        this.empleado = empleado;
        this.valorHora = valorHora;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Long getValorHora() {
        return valorHora;
    }
    public void setValorHora(Long valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "FrelanceResponse{" +
                "empleado=" + empleado +
                ", valorHora=" + valorHora +
                '}';
    }
}
