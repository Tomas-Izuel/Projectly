package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.Area;
import com.proyectly.proyectly.repositories.AreaRepository;
import com.proyectly.proyectly.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl extends BaseServiceImpl<Area, Long> implements AreaService{
    @Autowired
    private AreaRepository areaRepository;

    public AreaServiceImpl(BaseRepository<Area, Long> baseRepository){
        super(baseRepository);
    }
}
