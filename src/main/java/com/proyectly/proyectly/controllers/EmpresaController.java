package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.Empresa;
import com.proyectly.proyectly.services.EmpresaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/empresa")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{
}