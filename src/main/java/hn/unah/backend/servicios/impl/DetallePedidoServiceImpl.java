package hn.unah.backend.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import hn.unah.backend.modelos.detallePedido;
import hn.unah.backend.repositorios.DetallePedidoRepository;
import hn.unah.backend.servicios.DetallePedidoService;

public class DetallePedidoServiceImpl implements DetallePedidoService {
    
    @Autowired
    private DetallePedidoRepository DetallePedido;

    @Override
    public List<detallePedido> obtenerTodosPedidos(){
        return this.DetallePedido.findAll();
    }
}
