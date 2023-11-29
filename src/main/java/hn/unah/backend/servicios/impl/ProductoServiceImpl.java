package hn.unah.backend.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.backend.modelos.producto;
import hn.unah.backend.repositorios.ProductoRepository;
import hn.unah.backend.servicios.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public producto creaProducto(producto nvProducto){
        return productoRepository.save(nvProducto);
    }

    @Override
    public List<producto> obtenerTodosProductos(){
        return this.productoRepository.findAll();
    }
}
