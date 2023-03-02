package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.Etapa;
import com.proyectly.proyectly.repositories.BaseRepository;
import com.proyectly.proyectly.repositories.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtapaServiceImpl extends BaseServiceImpl<Etapa, Long> implements EtapaService{
    @Autowired
    private EtapaRepository areaRepository;

    public EtapaServiceImpl(BaseRepository<Etapa, Long> baseRepository){
        super(baseRepository);
    }
}