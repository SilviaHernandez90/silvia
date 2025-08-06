package com.dominio.silvia.repository.domain;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "TAREA")
public class Tarea implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_TAREA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_EMP")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "ID_PROYECTO")
    private Proyecto proyecto;

    @Column(name = "FECHA")
    private LocalDate fecha;
    @Column(name = "HORAS")
    private Double horas;
    @Column(name = "DESCRIPCION")
    private String descripcion;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Double getHoras() {
        return horas;
    }
    public void setHoras(Double horas) {
        this.horas = horas;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", empleado=" + empleado +
                ", proyecto=" + proyecto +
                ", fecha=" + fecha +
                ", horas=" + horas +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
