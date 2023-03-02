package com.proyectly.proyectly.controllers;

import com.proyectly.proyectly.entities.Area;
import com.proyectly.proyectly.services.AreaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/area")
public class AreaController extends BaseControllerImpl<Area, AreaServiceImpl>{
}
