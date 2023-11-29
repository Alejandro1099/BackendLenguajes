package hn.unah.backend.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import hn.unah.backend.modelos.comercio;
import hn.unah.backend.repositorios.ComercioRepository;
import hn.unah.backend.servicios.ComercioService;

@Service
public class ComercioServiceImpl implements ComercioService{
    
    @Autowired
    private ComercioRepository comercioRepository;

    @Override
    public comercio crearComercio(comercio nvoComercio){
        return comercioRepository.save(nvoComercio);
    }

    @Override
    public List<comercio> obtenerTodosComercios(){
        return this.comercioRepository.findAll();
    }

}
