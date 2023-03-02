package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.Etapa;
import com.proyectly.proyectly.services.EtapaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/etapa")
public class EtapaController extends BaseControllerImpl<Etapa, EtapaServiceImpl>{
}
