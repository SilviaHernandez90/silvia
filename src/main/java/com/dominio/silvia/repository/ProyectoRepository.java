package com.dominio.silvia.repository;

import com.dominio.silvia.repository.domain.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
    Optional<Proyecto> findByNombre(String nombre);


}
