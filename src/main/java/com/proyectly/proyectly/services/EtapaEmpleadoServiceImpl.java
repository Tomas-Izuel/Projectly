package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.EtapaEmpleado;
import com.proyectly.proyectly.repositories.BaseRepository;
import com.proyectly.proyectly.repositories.EtapaEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtapaEmpleadoServiceImpl extends BaseServiceImpl<EtapaEmpleado, Long> implements EtapaEmpleadoService{
    @Autowired
    private EtapaEmpleadoRepository etapaEmpleadoRepository;

    public EtapaEmpleadoServiceImpl(BaseRepository<EtapaEmpleado, Long> baseRepository){
        super(baseRepository);
    }
}
