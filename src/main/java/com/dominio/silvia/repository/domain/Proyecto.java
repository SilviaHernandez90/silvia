package com.dominio.silvia.repository.domain;
import jakarta.persistence.*;


@Entity
@Table(name= "PROYECTO")

public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID_PROYECTO")
    private int id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "MAX_HORAS")
    private int maxHoras;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
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
        return "Proyecto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", maxHoras=" + maxHoras +
                '}';
    }


}
