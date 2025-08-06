package com.dominio.silvia.service.response;

import com.dominio.silvia.repository.domain.Empleado;
import com.dominio.silvia.repository.domain.Proyecto;

public class TareaInformacionResponse {
    String empleado;
    String proyecto;
    public TareaInformacionResponse(String empleado, String proyecto) {
        this.empleado = empleado;
        this.proyecto = proyecto;
    }
    public String getEmpleado() {
        return empleado;
    }
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    public String getProyecto() {
        return proyecto;
    }
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "TareaInformacionResponse{" +
                "empleado=" + empleado +
                ", proyecto=" + proyecto +
                '}';
    }
}
