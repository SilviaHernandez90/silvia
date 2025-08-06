package com.dominio.silvia.controller;


import com.dominio.silvia.controller.domain.EmpleadoRequest;
import com.dominio.silvia.repository.DepartamentoRepository;
import com.dominio.silvia.repository.domain.Empleado;
import com.dominio.silvia.service.DepartamentoService;
import com.dominio.silvia.service.EmpleadoService;
import com.dominio.silvia.service.response.DepartamentoResponse;
import com.dominio.silvia.service.response.EmpleadoDetallesResponse;
import com.dominio.silvia.service.response.EmpleadoInformacionResponse;
import com.dominio.silvia.service.response.EmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping()
    public ResponseEntity<List<EmpleadoResponse>> getEmpleados(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getEmpleados()));
    }

    @GetMapping("/validacion")
    public ResponseEntity<List<EmpleadoResponse>> getEmpleadosValidation(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getEmpleadosByValidation()));
    }

    @GetMapping("/validation")
    public ResponseEntity<List<EmpleadoResponse>> getEmpleadosValidation2(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getEmpleadosByValidation2()));
    }

    @GetMapping("/valimas") //endpoint
    public ResponseEntity<List<EmpleadoResponse>> getEmpleadosValidation3(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getEmpleadosByValidation3()));
    }

    @PostMapping()
    public ResponseEntity<EmpleadoResponse> saveEmpleado(@RequestBody EmpleadoRequest empleadoRequest){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.saveEmpleado(empleadoRequest)));
    }

    @GetMapping("/empleadomod")
    public ResponseEntity<List<EmpleadoResponse>> getEmpleadomod(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getEmpleadoMod()));
    }

    @GetMapping("/empleadomod2")
    public ResponseEntity<Integer>  getEmpleadomod2(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getEmpleadoMod2()));
    }

    @GetMapping ("/nombres")
    public ResponseEntity<List<String>> getNombreEmpleados(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getNombreEmpleados()));
    }

    @GetMapping("/sueldo")
    public ResponseEntity<List<Double>> getSalarioEmpleados(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getSueldoEmpleados()));

    }

    @GetMapping("/fecha")
    public ResponseEntity<List<LocalDate>> getFechaEmpleados(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getFechaEmpleados()));

    }

    @GetMapping("/informacion")
    public ResponseEntity<List<EmpleadoInformacionResponse>> getInformacionEmpleados(){
        return ResponseEntity.of(Optional.ofNullable(empleadoService.getInformacionEmpleados()));

    }







}
