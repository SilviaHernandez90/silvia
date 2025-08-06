package com.dominio.silvia.repository.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "DEPT")
public class Departamento {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_DEPT")
        private Long id;

        @Column(name = "NOMBRE")
        private String nombre;
        @Column(name ="LOCALIDAD")
        private String localidad;

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getLocalidad() {
            return localidad;
        }
        public void setLocalidad(String localidad) {
            this.localidad = localidad;
        }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
