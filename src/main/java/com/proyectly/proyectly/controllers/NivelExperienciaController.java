package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.NivelExperiencia;
import com.proyectly.proyectly.services.NivelExperienciaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/nivelexperiencia")
public class NivelExperienciaController extends BaseControllerImpl<NivelExperiencia, NivelExperienciaServiceImpl>{
}
