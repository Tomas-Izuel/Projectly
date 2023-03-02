package com.proyectly.proyectly.services;

import com.proyectly.proyectly.entities.Empresa;
import com.proyectly.proyectly.repositories.BaseRepository;
import com.proyectly.proyectly.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService{
    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository){
        super(baseRepository);
    }
}
