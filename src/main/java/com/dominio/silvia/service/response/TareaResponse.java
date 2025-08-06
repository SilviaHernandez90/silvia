package com.dominio.silvia.service.response;
import com.dominio.silvia.repository.domain.Empleado;
import com.dominio.silvia.repository.domain.Proyecto;
import java.time.LocalDate;

public class TareaResponse {
    Long id;
    Empleado empleado;
    Proyecto proyecto;
    LocalDate fecha;
    Double hora;
    String descripcion;

    public TareaResponse(Long id, Empleado empleado, Proyecto proyecto, LocalDate fecha, Double hora, String descripcion) {
        this.id = id;
        this.empleado = empleado;
        this.proyecto = proyecto;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;

    }

        public Long getIdTarea() {
        return id;
        }
        public void setIdTarea(Long idTarea) {
        this.id = idTarea;
        }
        public Empleado getEmpleado(){
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
        public LocalDate getFecha() {
            return fecha;
        }
        public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
        }
        public Double getHora() {
            return hora;
        }
        public void setHora(Double hora) {
        this.hora = hora;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

    @Override
    public String toString() {
        return "TareaResponse{" +
                "idTarea=" + id +
                ", empleado=" + empleado +
                ", proyecto=" + proyecto +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}


