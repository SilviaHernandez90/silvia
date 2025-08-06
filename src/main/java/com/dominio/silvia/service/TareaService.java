package com.dominio.silvia.service;

import com.dominio.silvia.repository.TareaRepository;
import com.dominio.silvia.repository.domain.Tarea;
import com.dominio.silvia.service.response.ProyectoResponse;
import com.dominio.silvia.service.response.TareaInformacionResponse;
import com.dominio.silvia.service.response.TareaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;
    @Autowired
    private ProyectoService proyectoService;



    public List<TareaResponse> getTareas() {
        List<Tarea> tareas = tareaRepository.findAll();
        List<TareaResponse> tareasResponse = new ArrayList<>();
        for (Tarea tarea : tareas) {
            TareaResponse tareaResponse = new TareaResponse(tarea.getId(), tarea.getEmpleado(), tarea.getProyecto(), tarea.getFecha(), tarea.getHoras(), tarea.getDescripcion());
            tareasResponse.add(tareaResponse);

        }
        return tareasResponse;
    }
    public List<TareaInformacionResponse> getInformacionTareas() {
        List<Tarea> tareas = tareaRepository.findAll();
        List<TareaInformacionResponse> tareaInformacionResponse = new ArrayList<>();
        for (Tarea tarea : tareas) {

            TareaInformacionResponse tareaInformacionResponse1 = new TareaInformacionResponse(tarea.getEmpleado().getNombre(), tarea.getProyecto().getNombre());
            tareaInformacionResponse.add(tareaInformacionResponse1);


        }
        return tareaInformacionResponse;
    }


}






