package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.EmpleadoArea;
import com.proyectly.proyectly.services.EmpleadoAreaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/empleadoarea")
public class EmpleadoAreaController extends BaseControllerImpl<EmpleadoArea, EmpleadoAreaServiceImpl>{
}

