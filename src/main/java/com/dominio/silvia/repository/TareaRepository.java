package com.dominio.silvia.repository;
import com.dominio.silvia.repository.domain.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
//    Optional<Tarea> findByNombre(String nombre);

}
