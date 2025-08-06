package com.dominio.silvia.controller.domain;

public class DepartamentoRequest {
        Long idDept;
        String nombre;
        String localidad;

        public DepartamentoRequest(Long idDept, String nombre, String localidad) {
            this.idDept = idDept;
            this.nombre = nombre;
            this.localidad = localidad;
        }
        public Long getidDept() {
            return idDept;
        }
        public void setidDept(Long idDept) {
            this.idDept = idDept;
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
        return "DepartamentoResponse{" +
                "idDept=" + idDept +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
