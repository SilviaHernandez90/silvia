package com.dominio.silvia.service;

import com.dominio.silvia.controller.domain.ProyectoRequest;
import com.dominio.silvia.repository.DepartamentoRepository;
import com.dominio.silvia.repository.ProyectoRepository;
import com.dominio.silvia.repository.domain.Proyecto;
import com.dominio.silvia.service.response.ProyectoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    public List<ProyectoResponse> getProyectos() {
        List<Proyecto> proyectos = proyectoRepository.findAll();
        List<ProyectoResponse> proyectosResponse = new ArrayList<>();
        for (Proyecto proyecto : proyectos) {
            proyectosResponse.add(new ProyectoResponse(proyecto.getId(),proyecto.getNombre(),proyecto.getMaxHoras()));
        }
        return proyectosResponse;
    }

    public ProyectoResponse getProyectoByNombre(String nombre){
        ProyectoResponse proyectoResponse= null;
        Optional<Proyecto> optProyecto = proyectoRepository.findByNombre(nombre);
        if(optProyecto.isPresent()){
            Proyecto proyecto = optProyecto.get();
            proyectoResponse = new ProyectoResponse(proyecto.getId(),proyecto.getNombre(),proyecto.getMaxHoras());
        }
        return proyectoResponse;
    }

    public ProyectoResponse saveProyectoNuevo(ProyectoRequest proyectoRequest){
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre(proyectoRequest.getNombreProyecto());
        proyecto.setMaxHoras(proyectoRequest.getMaxHoras());
        proyecto = proyectoRepository.save(proyecto);
        ProyectoResponse proyectoResponse = new ProyectoResponse(proyecto.getId(),proyecto.getNombre(),proyecto.getMaxHoras());
        return proyectoResponse;


    }

    @Transactional
    public ProyectoResponse updateProyecto(ProyectoRequest proyectoRequest){
        Optional<Proyecto> proyecto = proyectoRepository.findById(proyectoRequest.getIdProyecto());
        ProyectoResponse proyectoResponse = null;
        if(proyecto.isPresent()){
            Proyecto proyecto1 = proyecto.get();
            proyecto1.setNombre(proyectoRequest.getNombreProyecto());
            proyecto1.setMaxHoras(proyectoRequest.getMaxHoras());
            proyectoResponse =new ProyectoResponse(proyecto1.getId(),proyecto1.getNombre(),proyecto1.getMaxHoras());
        }
        return proyectoResponse;
    }

    public void deleteProyecto(int id){
      proyectoRepository.deleteById(id);
    }



}
