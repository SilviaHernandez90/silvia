package com.dominio.silvia.controller;
import com.dominio.silvia.controller.domain.DepartamentoRequest;
import com.dominio.silvia.repository.domain.Departamento;
import com.dominio.silvia.service.DepartamentoService;
import com.dominio.silvia.service.response.DepartamentoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping()
    public ResponseEntity<List<DepartamentoResponse>> getdepartamentos(){
        return ResponseEntity.of(Optional.ofNullable(departamentoService.getDepartamentos()));
    }

    @PostMapping()
    public ResponseEntity<DepartamentoResponse> saveDepartamento(@RequestBody DepartamentoRequest departamentoRequest){
        return ResponseEntity.of(Optional.ofNullable(departamentoService.saveDepartamento(departamentoRequest)));
    }

    @PostMapping("/parameters")
    public ResponseEntity<Void> saveParameterDepartamento(@RequestParam("nombre") String nombre, @RequestParam("id") Integer id){
        System.out.println(nombre);
        System.out.println(id);
       return ResponseEntity.accepted().build();
    }


    @DeleteMapping
    public ResponseEntity<Void> deleteDepartamente(@RequestBody DepartamentoRequest departamentoRequest){
        departamentoService.deleteDepartamento(departamentoRequest.getidDept());
        return ResponseEntity.accepted().build();
    }

    @PatchMapping
    public ResponseEntity<DepartamentoResponse> updateDepartamento(@RequestBody DepartamentoRequest departamentoRequest){
      return ResponseEntity.of(Optional.ofNullable(departamentoService.updateDepartamento(departamentoRequest)));
    }



}
