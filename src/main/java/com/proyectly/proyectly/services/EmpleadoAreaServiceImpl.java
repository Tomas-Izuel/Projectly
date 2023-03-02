package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.EmpleadoArea;
import com.proyectly.proyectly.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoAreaServiceImpl extends BaseServiceImpl<EmpleadoArea, Long> implements EmpleadoAreaService{
    @Autowired
    private EmpleadoArea areaRepository;

    public EmpleadoAreaServiceImpl(BaseRepository<EmpleadoArea, Long> baseRepository){
        super(baseRepository);
    }
}
