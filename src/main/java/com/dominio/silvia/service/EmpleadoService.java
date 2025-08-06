package com.dominio.silvia.service;


import com.dominio.silvia.controller.domain.EmpleadoRequest;
import com.dominio.silvia.repository.EmpleadoRepository;
import com.dominio.silvia.repository.domain.Departamento;
import com.dominio.silvia.repository.domain.Empleado;
import com.dominio.silvia.service.response.DepartamentoResponse;
import com.dominio.silvia.service.response.EmpleadoDetallesResponse;
import com.dominio.silvia.service.response.EmpleadoInformacionResponse;
import com.dominio.silvia.service.response.EmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Autowired
    private DepartamentoService departamentoService;

    public List<EmpleadoResponse> getEmpleados() {
        List<Empleado> listempleados = empleadoRepository.findAll();
        List<EmpleadoResponse> empleadosResponse = new ArrayList<>();

        for (Empleado empleado : listempleados) {
            EmpleadoResponse empleadoResponse = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
            Departamento departamento = empleado.getDepartamento();
            DepartamentoResponse departamentoResponse = new DepartamentoResponse(departamento.getId(), departamento.getNombre(), departamento.getLocalidad());
            empleadoResponse.setDepartamento(departamentoResponse);
            empleadosResponse.add(empleadoResponse);
        }
        return empleadosResponse;
    }

    public List<EmpleadoResponse> getEmpleadosByValidation() {
        List<Empleado> listEmpVali = empleadoRepository.findAll();
        List<EmpleadoResponse> empleadosResponse = new ArrayList<>();

        for (Empleado empleado : listEmpVali) {
            if (empleado.getSueldo() > 15000) {
                EmpleadoResponse empRes = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
                empRes.setValidation("Gana bien");
                empleadosResponse.add(empRes);
            } else if (empleado.getSueldo() <= 15000) {
                EmpleadoResponse empRes = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
                empRes.setValidation("Gana mal");
                empleadosResponse.add(empRes);
            }
        }
        return empleadosResponse;
    }


    public List<EmpleadoResponse> getEmpleadosByValidation2() {
        List<Empleado> listEmpVali = empleadoRepository.findAll();
        List<EmpleadoResponse> empResponse = new ArrayList<>();
        for (Empleado empleado : listEmpVali) {
            if (empleado.getSueldo() > 15000) {
                EmpleadoResponse empResp = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
                empResponse.add(empResp);
                empResp.setValidation("Gana bien");

            } else if (empleado.getSueldo() <= 15000) {
                EmpleadoResponse empResp = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
                empResponse.add(empResp);
                empResp.setValidation("Gana mal");
            }
        }

        return empResponse;
    }

    public List<EmpleadoResponse> getEmpleadosByValidation3() {
        List<Empleado> listEmpVali = empleadoRepository.findAll();
        List<EmpleadoResponse> empResponse = new ArrayList<>();
        for (Empleado empleado : listEmpVali) {
            if (empleado.getSueldo() > 15000) {
                EmpleadoResponse emple = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
                empResponse.add(emple);
                emple.setValidation("Gana bien");
            }
        }
        return empResponse;
    }

    public EmpleadoResponse saveEmpleado(EmpleadoRequest empleadoRequest) {
        Empleado empleado = new Empleado();
        empleado.setNombre(empleadoRequest.getNombre());
        empleado.setFecha(empleadoRequest.getFecha());
        empleado.setSueldo(empleadoRequest.getSueldo());

        empleado = empleadoRepository.save(empleado);
        EmpleadoResponse empleResponse = new EmpleadoResponse(empleado.getId(), empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
        return empleResponse;
    }


    public List<EmpleadoResponse> getEmpleadoMod() {
        List<Empleado> listaEmpleados = empleadoRepository.findAll();
        List<EmpleadoResponse> empleadoResponse2 = new ArrayList<>();

        for (Empleado empleado : listaEmpleados ) {
           Departamento departamento = empleado.getDepartamento();
                if (departamento.getNombre().equals("SistemasModificado")) {
                    EmpleadoResponse emp = new EmpleadoResponse(empleado.getId(),empleado.getNombre(), empleado.getFecha(), empleado.getSueldo());
                    DepartamentoResponse departamentoResponse = new DepartamentoResponse(departamento.getId(),departamento.getNombre(),departamento.getLocalidad());
                    emp.setDepartamento(departamentoResponse);
                    empleadoResponse2.add(emp);

                }
        }
        return  empleadoResponse2;
        }


        //cuantas personas estan en sistema modificado
        public Integer getEmpleadoMod2() {
        List<Empleado> listaEmpleados = empleadoRepository.findAll();
        int contar =0;
        for (Empleado empleado : listaEmpleados ) {
            Departamento departamento = empleado.getDepartamento();
            if (departamento.getNombre().equals("SistemasModificado")) {
                empleado.getNombre();
                contar++;
            }
        }
         return contar;
        }

        public List<String> getNombreEmpleados() {
        List<Empleado> listaEmpleados = empleadoRepository.findAll();
            List<String> empleadosNombre = new ArrayList<>();
        for (Empleado empleado : listaEmpleados ) {
            Departamento departamento = empleado.getDepartamento();
            if (departamento.getNombre().equals("SistemasModificado" )) {
                empleadosNombre.add(empleado.getNombre());
            }
        }
        return empleadosNombre;
        }

        public List<Double> getSueldoEmpleados() {
        List<Empleado> listaEmpleados = empleadoRepository.findAll();
        List<Double> sueldoEmpleados = new ArrayList<>();
        for (Empleado empleado : listaEmpleados ) {
            Departamento departamento = empleado.getDepartamento();
            if (departamento.getNombre().equals("SistemasModificado")) {
                sueldoEmpleados.add(empleado.getSueldo());
            }

        }
        return sueldoEmpleados;
        }

        public List<LocalDate> getFechaEmpleados() {
        List<Empleado> listaEmpleados = empleadoRepository.findAll();
        List<LocalDate> fechaEmpleados = new ArrayList<>();
        for (Empleado empleado : listaEmpleados ) {
            Departamento departamento = empleado.getDepartamento();
            if (departamento.getNombre().equals("SistemasModificado")) {
                fechaEmpleados.add(empleado.getFecha());
            }
        }
        return  fechaEmpleados;
        }

        public List<EmpleadoInformacionResponse> getInformacionEmpleados() {
        List<Empleado> listaEmpleados = empleadoRepository.findAll();
        List<EmpleadoInformacionResponse> empleadosInfo = new ArrayList<>();

        for (Empleado empleado : listaEmpleados ) {
            empleadosInfo.add(new EmpleadoInformacionResponse(empleado.getNombre(),empleado.getSueldo(), empleado.getDepartamento().getNombre()));

        }
        return empleadosInfo;
        }













}