package com.dominio.silvia.service;
import com.dominio.silvia.controller.domain.DepartamentoRequest;
import com.dominio.silvia.repository.DepartamentoRepository;
import com.dominio.silvia.repository.ProyectoRepository;
import com.dominio.silvia.repository.domain.Departamento;
import com.dominio.silvia.service.response.DepartamentoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.antlr.v4.runtime.atn.SemanticContext.and;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Autowired
    private ProyectoService proyectoService;

    public List<DepartamentoResponse> getDepartamentos() {
        List<Departamento> listadepartamentos = departamentoRepository.findAll();
        List<DepartamentoResponse> departamentosResponse = new ArrayList<>();

        for (Departamento departamento : listadepartamentos) {
            departamentosResponse.add(new DepartamentoResponse(departamento.getId(),departamento.getNombre(),departamento.getLocalidad()));

        }
        return departamentosResponse;
    }
    public DepartamentoResponse saveDepartamento(DepartamentoRequest departamentoRequest){
        Departamento departamento = new Departamento();
        departamento.setNombre(departamentoRequest.getNombre());
        departamento.setLocalidad(departamentoRequest.getLocalidad());
        departamento = departamentoRepository.save(departamento);
        DepartamentoResponse depRespon = new DepartamentoResponse(departamento.getId(),departamento.getNombre(),departamento.getLocalidad());
        return depRespon;
    }

    public void deleteDepartamento(Long id){
        departamentoRepository.deleteById(id);
    }

    @Transactional
    public DepartamentoResponse updateDepartamento(DepartamentoRequest departamentoRequest){ //de  donde
        Optional<Departamento> optDept = departamentoRepository.findById(departamentoRequest.getidDept()); //
        proyectoService.deleteProyecto(1);

        DepartamentoResponse departamentoResponse = null;
        if(optDept.isPresent()){ //validación
            Departamento departamento =  optDept.get();
            departamento.setNombre(departamentoRequest.getNombre());
            departamento.setLocalidad(departamentoRequest.getLocalidad());
            departamentoResponse =  new DepartamentoResponse(departamento.getId(),departamento.getNombre(),departamento.getLocalidad()); // Mando a llamar
        }

        return departamentoResponse; //retorna
    }

    public List<DepartamentoResponse> getAllDepartamentos(){
        List<Departamento> listadepartamentos = departamentoRepository.findAll();
        List<DepartamentoResponse> departamentosResponse = new ArrayList<>();

        for (Departamento departamento : listadepartamentos) {
            departamentosResponse.add(new DepartamentoResponse(departamento.getId(),departamento.getNombre(),departamento.getLocalidad()));

        }
        return departamentosResponse;

    }
    public List<DepartamentoResponse> getAllDepartamentos2(){
        List<Departamento> listaDEpartamentos = departamentoRepository.findAll();
        List<DepartamentoResponse> departamentosResponse2 = new ArrayList<>();
        for (Departamento departamento : listaDEpartamentos) {
            departamentosResponse2.add(new DepartamentoResponse(departamento.getId(),departamento.getNombre(),departamento.getLocalidad()));
        }
        return departamentosResponse2;
    }



}
