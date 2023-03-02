package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.Proyecto;
import com.proyectly.proyectly.repositories.BaseRepository;
import com.proyectly.proyectly.repositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl extends BaseServiceImpl<Proyecto, Long> implements ProyectoService{
    @Autowired
    private ProyectoRepository proyectoRepository;

    public ProyectoServiceImpl(BaseRepository<Proyecto, Long> baseRepository){
        super(baseRepository);
    }
}

