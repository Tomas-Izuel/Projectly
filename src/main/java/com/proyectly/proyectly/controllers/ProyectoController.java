package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.Proyecto;
import com.proyectly.proyectly.services.ProyectoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/proyecto")
public class ProyectoController extends BaseControllerImpl<Proyecto, ProyectoServiceImpl>{
}
