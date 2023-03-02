package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.NivelExperiencia;
import com.proyectly.proyectly.repositories.BaseRepository;
import com.proyectly.proyectly.repositories.NivelExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelExperienciaServiceImpl extends BaseServiceImpl<NivelExperiencia, Long> implements NivelExperienciaService{
    @Autowired
    private NivelExperienciaRepository nivelExperienciaRepository;

    public NivelExperienciaServiceImpl(BaseRepository<NivelExperiencia, Long> baseRepository){
        super(baseRepository);
    }
}

