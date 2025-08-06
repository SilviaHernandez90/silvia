package com.dominio.silvia.repository;
import com.dominio.silvia.repository.domain.Departamento;
import com.dominio.silvia.repository.domain.Empleado;
import com.dominio.silvia.service.response.EmpleadoResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmpleadoRepository  extends JpaRepository<Empleado, Long> {

}
