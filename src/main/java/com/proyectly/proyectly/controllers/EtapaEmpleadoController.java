package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.EtapaEmpleado;
import com.proyectly.proyectly.services.EtapaEmpleadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/etapaempleado")
public class EtapaEmpleadoController extends BaseControllerImpl<EtapaEmpleado, EtapaEmpleadoServiceImpl>{
}
