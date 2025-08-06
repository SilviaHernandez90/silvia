package com.dominio.silvia.repository;

import com.dominio.silvia.repository.domain.Departamento;
import com.dominio.silvia.repository.domain.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    Optional<Departamento> findByNombre(String nombre);

    Optional<Departamento> findByNombreAndLocalidad(String nombre, String localidad);

    Optional<Departamento> findByNombreOrLocalidad(String nombre, String localidad);
}
