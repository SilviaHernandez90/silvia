package com.dominio.silvia.controller;

import com.dominio.silvia.repository.EmpleadoRepository;
import com.dominio.silvia.repository.domain.Tarea;
import com.dominio.silvia.service.ProyectoService;
import com.dominio.silvia.service.TareaService;
import com.dominio.silvia.service.response.TareaInformacionResponse;
import com.dominio.silvia.service.response.TareaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("tarea")
public class TareaController {

    @Autowired
    private TareaService tareaService;
    @Autowired
    private ProyectoService proyectoService;
    @Autowired
    private EmpleadoRepository empleadoRepository;

   @GetMapping
    public ResponseEntity<List<TareaResponse>> getTareas(){
       return ResponseEntity.of(Optional.ofNullable(tareaService.getTareas()));
   }
   @GetMapping("/informacion")
    public ResponseEntity<List<TareaInformacionResponse>> getInformacionTarea(){
       return ResponseEntity.of(Optional.ofNullable(tareaService.getInformacionTareas()));
   }


}
