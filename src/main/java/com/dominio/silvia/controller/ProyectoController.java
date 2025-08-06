package com.dominio.silvia.controller;

import com.dominio.silvia.controller.domain.ProyectoRequest;
import com.dominio.silvia.repository.ProyectoRepository;
import com.dominio.silvia.repository.domain.Proyecto;
import com.dominio.silvia.service.ProyectoService;
import com.dominio.silvia.service.response.ProyectoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("proyecto")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;
    @GetMapping()
    public ResponseEntity<List<ProyectoResponse>> getProyectos(){
        return ResponseEntity.ofNullable(proyectoService.getProyectos());

    }
    @GetMapping("/{nombre}")
    public ResponseEntity<ProyectoResponse> getProyectoByNombre(@PathVariable String nombre){
        ProyectoResponse proyectoResponse = proyectoService.getProyectoByNombre(nombre);
        return ResponseEntity.ofNullable(proyectoResponse);
    }

    @PostMapping()
    public ResponseEntity<ProyectoResponse> saveProyectoNuevo(@RequestBody ProyectoRequest proyectoRequest){
        return ResponseEntity.of(Optional.ofNullable(proyectoService.saveProyectoNuevo(proyectoRequest)));
    }

    @PatchMapping()
    public ResponseEntity<ProyectoResponse> updateProyecto(@RequestBody ProyectoRequest proyectoRequest){
        return ResponseEntity.of(Optional.ofNullable(proyectoService.updateProyecto(proyectoRequest)));
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteProyecto(@RequestBody ProyectoRequest proyectoRequest){
        proyectoService.deleteProyecto(proyectoRequest.getIdProyecto());
        return ResponseEntity.ok().build();
    }











}
