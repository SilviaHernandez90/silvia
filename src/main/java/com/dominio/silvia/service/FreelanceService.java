package com.dominio.silvia.service;

import com.dominio.silvia.repository.FreelanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreelanceService {
    @Autowired
    private FreelanceRepository freelanceRepository;
    @Autowired
    private EmpleadoService empleadoService;

}
