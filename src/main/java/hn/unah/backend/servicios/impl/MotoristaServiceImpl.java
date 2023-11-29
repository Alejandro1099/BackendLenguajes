package hn.unah.backend.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import hn.unah.backend.modelos.motorista;
import hn.unah.backend.repositorios.MotoristaRepository;
import hn.unah.backend.servicios.MotoristaService;

@Service
public class MotoristaServiceImpl implements MotoristaService {
    
    @Autowired
    private MotoristaRepository MotoristaRepository;

    @Override
    public motorista crearMotorista(motorista nvMotorista){
        return MotoristaRepository.save(nvMotorista);
    }

    @Override
    public List<motorista> obtenerTodosMotoristas(){
        return this.MotoristaRepository.findAll();
    }
}
