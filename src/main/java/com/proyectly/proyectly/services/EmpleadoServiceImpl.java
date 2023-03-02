package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.Empleado;
import com.proyectly.proyectly.repositories.BaseRepository;
import com.proyectly.proyectly.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Long> implements EmpleadoService{
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(BaseRepository<Empleado, Long> baseRepository){
        super(baseRepository);
    }
}
