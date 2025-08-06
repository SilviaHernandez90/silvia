package com.dominio.silvia.controller;

import com.dominio.silvia.service.FreelanceService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("freelance")
public class FreelanceController {
    @Autowired
    private FreelanceService freelanceService;


}
