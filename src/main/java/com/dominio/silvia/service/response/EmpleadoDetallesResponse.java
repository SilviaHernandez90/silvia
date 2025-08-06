package com.dominio.silvia.service.response;

import com.dominio.silvia.repository.domain.Empleado;
import com.dominio.silvia.repository.domain.Proyecto;

public class EmpleadoDetallesResponse {
   Empleado empleado;
 Proyecto proyecto;

 public EmpleadoDetallesResponse(Empleado empleado, Proyecto proyecto) {
     this.empleado = empleado;
     this.proyecto = proyecto;
 }
 public Empleado getEmpleado() {
        return empleado;
 }
 public void setEmpleado(Empleado empleado) {
     this.empleado = empleado;
 }
 public Proyecto getProyecto() {
     return proyecto;
 }
 public void setProyecto(Proyecto proyecto) {
     this.proyecto = proyecto;
 }

    @Override
    public String toString() {
        return "EmpleadoDetallesResponse{" +
                "empleado=" + empleado +
                ", proyecto=" + proyecto +
                '}';
    }
}
